/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import model.Restaurantes;
import model.Subscripciones;
import model.SubscripcionesId;
import model.SubscripcionesTipos;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;
import util.Utils;

/**
 *
 * @author Seix
 */
public class SubscripcionesDao {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public List<Subscripciones> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Crea una subscripción en la base de datos. Se comprueba que el restaurante no tiene ninguna
     * subscripción, si es así, se obtiene el tipo de subscripción de la base de datos y se le asigna
     * a éste creando una nueva subscripción en la base de datos.
     * 
     * @param idRestaurante Identificador del restaurante a subscribir.
     * @param idTipoSubscripcion Identificador del tipo de subscripción.
     * @param fechaInicio Date fecha a partir de la cual se aplicará el periodo de subscripción.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean create(int idRestaurante, int idTipoSubscripcion, Date fechaInicio) {

        boolean creado = false;
        Restaurantes restaurante = null;
        Subscripciones subscripcion = null;
        SubscripcionesTipos tipo = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            
            SubscripcionesId subsIdAux = new SubscripcionesId(idRestaurante, idTipoSubscripcion);
            
            //Comprobamos si existe alguna subscripción
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Subscripciones.class).add(Restrictions.like("id", subsIdAux));
            Subscripciones subscripcionControl = (Subscripciones) criteria.uniqueResult();
            session.getTransaction().commit();

            if (subscripcionControl == null || (subscripcionControl.getSubscripcionesTipos().getId() != idTipoSubscripcion)) {

                //Recuperamos el tipo de subscripción y el restaurante de la base de datos.
                session.beginTransaction();
                restaurante = (Restaurantes) session.get(Restaurantes.class, idRestaurante);
                tipo = (SubscripcionesTipos) session.get(SubscripcionesTipos.class, idTipoSubscripcion);
                session.getTransaction().commit();

                //Creamos el nuevo objeto a persistir en la base de datos.
                SubscripcionesId subsId = new SubscripcionesId(idRestaurante, idTipoSubscripcion);
                subscripcion = new Subscripciones(subsId, restaurante, tipo, fechaInicio, Utils.sumarDiasFecha(fechaInicio, tipo.getDias()), isActivo(fechaInicio, idRestaurante));

                //Persistencia de datos
                session.beginTransaction();
                session.persist(subscripcion);
                session.getTransaction().commit();
                creado = true;
            }
        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
                System.out.println("\n Error message:\n" + e.getMessage() + "\n");
            }
            creado = false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return creado;
    }

    /**
     * Actualiza los datos de una subscripción. Se comprobará que ya existe una subscripción para
     * el restaurante indicado y se actualizará en caso de que el tipo de subscripción sea 
     * diferente al anterior. Hay que tener en cuenta que se sobreescribirá la subscripción sin
     * tener en cuenta la validez de la anterior.
     * 
     * @param idRestaurante Identificador del restaurante a subscribir.
     * @param idTipoSubscripcion Identificador del tipo de subscripción.
     * @param fechaInicio Date fecha a partir de la cual se aplicará la subscripción.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean update(int idRestaurante, int idTipoSubscripcion, Date fechaInicio) {

        boolean actualizado = false;
        Subscripciones subscripcion = null;
        SubscripcionesTipos tipo = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();

            //Comprobamos si existe alguna subscripción
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Subscripciones.class)
                    .add(Restrictions.like("id_restaurante", idRestaurante));
            subscripcion = (Subscripciones) criteria.uniqueResult();
            session.getTransaction().commit();

            if (subscripcion != null || (subscripcion.getSubscripcionesTipos().getId() != idTipoSubscripcion)) {

                //Recuperamos el tipo de subscripción y el restaurante de la base de datos.
                session.beginTransaction();
                tipo = (SubscripcionesTipos) session.get(SubscripcionesTipos.class, idTipoSubscripcion);
                session.getTransaction().commit();

                //Asignamos el nuevo tipo de subscripción si este no existe actualmente.
                if (subscripcion.getId().getIdTipoSubscripcion() != idTipoSubscripcion) {
                    subscripcion.getId().setIdTipoSubscripcion(idTipoSubscripcion);

                    //Actualizamos los datos.
                    GregorianCalendar cal = new GregorianCalendar();
                    subscripcion.setFechaInicio(fechaInicio);
                    subscripcion.setFechaFinal(Utils.sumarDiasFecha(fechaInicio, tipo.getDias()));
                    subscripcion.setActiva(isActivo(subscripcion.getFechaInicio(), subscripcion.getSubscripcionesTipos().getDias()));

                    //Persistencia de datos
                    session.beginTransaction();
                    session.persist(subscripcion);
                    session.getTransaction().commit();
                    actualizado = true;
                }
            }
        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
                System.out.println("\n Error message:\n" + e.getMessage() + "\n");
            }
            actualizado = false;
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return actualizado;
    }

    public boolean delete(Subscripciones subscripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<SubscripcionesTipos> getTiposAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Crea un tipo de subscripción en la base de datos si no existe uno con el
     * mismo nombre.
     *
     * @param nombre String nombre del tipo de subscripción.
     * @param dias int días de validez del tipo de subscripción.
     * @param precio float precio del tipo de subscripción.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean createTipo(String nombre, int dias, float precio) {

        boolean creado = false;
        SubscripcionesTipos tipo = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();

            //Comprobamos que este no existe ya en la base de datos.
            session.beginTransaction();
            Criteria criteria = session.createCriteria(SubscripcionesTipos.class).add(Restrictions.like("nombre", nombre));
            SubscripcionesTipos tipoControl = (SubscripcionesTipos) criteria.uniqueResult();
            session.getTransaction().commit();

            if (tipoControl == null) {

                //Creamos el nuevo objeto a persistir en la base de datos.
                tipo = new SubscripcionesTipos(nombre, dias, precio);

                //Persistencia de datos
                session.beginTransaction();
                session.persist(tipo);
                session.getTransaction().commit();
                creado = true;
            }

        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
                System.out.println("\n Error message:\n" + e.getMessage() + "\n");
            }
            creado = false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return creado;
    }

    /**
     * Actualiza los datos de un tipo de subscripción de la base de datos.
     *
     * @param idTipo Identificador del tipo de subscripción a modificar.
     * @param nombre String nombre del tipo de subscripción.
     * @param dias int días de validez del tipo de subscripción.
     * @param precio float precio del tipo de subscripción.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean updateTipo(int idTipo, String nombre, int dias, float precio) {

        boolean actualizado = false;
        SubscripcionesTipos tipo = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();

            //Primero obtenemos el tipo de restaurante de la BD
            session.beginTransaction();
            tipo = (SubscripcionesTipos) session.get(SubscripcionesTipos.class, idTipo);
            session.getTransaction().commit();

            if (tipo != null) {

                //Actualizamos valores
                if (!tipo.getNombre().equals(nombre)) {
                    tipo.setNombre(nombre);
                }
                if (tipo.getDias() != dias) {
                    tipo.setDias(dias);
                }
                if (tipo.getPrecio() != precio) {
                    tipo.setPrecio(precio);
                }

                //Persistencia de datos
                session.beginTransaction();
                session.persist(tipo);
                session.getTransaction().commit();
                actualizado = true;
            }
        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
                System.out.println("\n Error message:\n" + e.getMessage() + "\n");
            }
            actualizado = false;
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return actualizado;
    }

    public boolean deleteTipo(SubscripcionesTipos tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean isActivo(Date fechaInicio, int dias) {
        boolean activo = false;
        GregorianCalendar calActual = new GregorianCalendar();

        if (fechaInicio.after(calActual.getTime()) && fechaInicio.before(Utils.sumarDiasFecha(fechaInicio, dias))) {
            activo = true;
        }
        return activo;
    }
}
