/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Date;
import java.util.List;
import model.Direcciones;
import model.Restaurantes;
import model.RestaurantesTipos;
import model.Usuarios;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author Seix
 */
public class RestaurantesDao {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public List<Restaurantes> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Crea un restaurante en la base de datos. Primero comprobará que existen
     * Direcciones, Usuarios, RestaurantesTipos con los identificadores
     * proporcionados, de no encontrarlos, no se creará el nuevo restaurante.
     * Una vez encontrados, se asignarán todos los valores al nuevo restaurante
     * a persistir en la base de datos.
     *
     * @param idUsuario Identificador Usuarios.
     * @param nombre String nombre del restaurante.
     * @param idDireccion Identificador dirección del restaurante.
     * @param idTipo Identificador tipo de restaurante.
     * @param descripcion String descripción del restaurante.
     * @param email String email del restaurante (puede coincidir o no con el
     * del usuario asignado).
     * @param plazas int número total de plazas que dispone el restaurante.
     * @param horaApertura Date hora de apertura diaria.
     * @param horaCierre Date hora de cierre diario.
     * @param telefono int Numero de teléfono de contacto.
     * @param coordenadas String coordenadas de localización del restaurante.
     * @param imgUrl String Path donde se encuentra la(s) imagen(es) del
     * restaurante.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean create(int idUsuario, String nombre, int idDireccion, int idTipo, String descripcion, String email, int plazas, Date horaApertura, Date horaCierre, int telefono, String coordenadas, String imgUrl) {

        boolean creado = false;
        Direcciones direccion = null;
        Restaurantes restaurante = null;
        RestaurantesTipos tipo = null;
        Usuarios usuario = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();

            //Obtenemos el usuario encargado del restaurante y la dirección de éste.
            session.beginTransaction();
            usuario = (Usuarios) session.get(Usuarios.class, idUsuario);
            direccion = (Direcciones) session.get(Direcciones.class, idDireccion);
            tipo = (RestaurantesTipos) session.get(RestaurantesTipos.class, idTipo);
            session.getTransaction().commit();

            //Creamos el nuevo objeto a persistir en la base de datos.
            restaurante = new Restaurantes(direccion, tipo, usuario, nombre, descripcion, email, plazas, horaApertura, horaCierre, telefono, coordenadas, imgUrl);

            //Persistencia de datos
            session.beginTransaction();
            session.persist(restaurante);
            session.getTransaction().commit();
            creado = true;

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
     * Actualiza los datos de un restaurante de la base de datos. Primero
     * comprobará que existen Direcciones, Usuarios, RestaurantesTipos y el
     * restaurante a modificar con los identificadores proporcionados, de no
     * encontrarlos, no se creará el nuevo restaurante.
     *
     * @param idRestaurante Identificador del restaurante a modificar.
     * @param idUsuario Identificador Usuarios.
     * @param nombre String nombre del restaurante.
     * @param idDireccion Identificador de la dirección.
     * @param idTipo Identificador del tipo de restaurante.
     * @param descripcion String descripción del restaurante.
     * @param email String email del restaurante (puede coincidir o no con el
     * del usuario asignado).
     * @param plazas int número total de plazas que dispone el restaurante.
     * @param horaApertura Date hora de apertura diaria.
     * @param horaCierre Date hora de cierre diario.
     * @param telefono int Número de teléfono de contacto.
     * @param coordenadas String coordenadas de localización del restaurante.
     * @param imgUrl String Path donde se encuentra la(s) imagen(es) del
     * restaurante.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean update(int idRestaurante, int idUsuario, String nombre, int idDireccion, int idTipo, String descripcion, String email, int plazas, Date horaApertura, Date horaCierre, int telefono, String coordenadas, String imgUrl) {

        boolean actualizado = false;
        Direcciones direccion = null;
        Restaurantes restaurante = null;
        RestaurantesTipos tipo = null;
        Usuarios usuario = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();

            //Primero comprobamos que el email no existe en la BD
            session.beginTransaction();
            restaurante = (Restaurantes) session.get(Restaurantes.class, idRestaurante);
            usuario = (Usuarios) session.get(Usuarios.class, idUsuario);
            direccion = (Direcciones) session.get(Direcciones.class, idDireccion);
            tipo = (RestaurantesTipos) session.get(RestaurantesTipos.class, idTipo);
            session.getTransaction().commit();

            if (restaurante != null && usuario != null && direccion != null && tipo != null) {

                //Actualizamos valores
                if (!restaurante.getCoordenadas().equals(coordenadas)) {
                    restaurante.setCoordenadas(coordenadas);
                }
                if (!restaurante.getDescripcion().equals(descripcion)) {
                    restaurante.setDescripcion(descripcion);
                }
                if (!restaurante.getDirecciones().equals(direccion)) {
                    restaurante.setDirecciones(direccion);
                }
                if (!restaurante.getEmailCorporativo().equals(email)) {
                    restaurante.setEmailCorporativo(email);
                }
                if (!restaurante.getHoraApertura().equals(horaApertura)) {
                    restaurante.setHoraApertura(horaApertura);
                }
                if (!restaurante.getHoraCierre().equals(horaCierre)) {
                    restaurante.setHoraCierre(horaCierre);
                }
                if (!restaurante.getImgUrl().equals(imgUrl)) {
                    restaurante.setImgUrl(imgUrl);
                }
                if (!restaurante.getNombre().equals(nombre)) {
                    restaurante.setNombre(nombre);
                }
                if (!restaurante.getPlazas().equals(plazas)) {
                    restaurante.setPlazas(plazas);
                }
                if (!restaurante.getRestaurantesTipos().equals(tipo)) {
                    restaurante.setRestaurantesTipos(tipo);
                }
                if (!restaurante.getTelefono().equals(telefono)) {
                    restaurante.setTelefono(telefono);
                }
                if (!restaurante.getUsuarios().equals(usuario)) {
                    restaurante.setUsuarios(usuario);
                }

                //Persistencia de datos
                session.beginTransaction();
                session.persist(restaurante);
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

    public boolean delete(Restaurantes restaurante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<RestaurantesTipos> getTiposAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Crea un Tipo de Restaurante en la base de datos si no encuentra un registro con el mismo nombre.
     *
     * @param nombre String nombre del tipo.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean createTipo(String nombre) {

        boolean creado = false;
        RestaurantesTipos tipo = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();

            //Comprobamos que este no existe ya en la base de datos.
            session.beginTransaction();
            Criteria criteria = session.createCriteria(RestaurantesTipos.class).add(Restrictions.like("nombre", nombre));
            RestaurantesTipos restTipo = (RestaurantesTipos) criteria.uniqueResult();
            session.getTransaction().commit();

            if (restTipo == null) {
                
                //Creamos el nuevo objeto a persistir en la base de datos.
                tipo = new RestaurantesTipos(nombre);

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
     * Actualiza los datos de un tipo de restaurante en la base de datos.
     * 
     * @param idTipo Identificador del tipo de restaurante a modificar.
     * @param nombre String nombre del tipo.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean updateTipo(int idTipo, String nombre) {

        boolean actualizado = false;
        RestaurantesTipos tipo = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();

            //Primero obtenemos el tipo de restaurante de la BD
            session.beginTransaction();
            tipo = (RestaurantesTipos) session.get(RestaurantesTipos.class, idTipo);
            session.getTransaction().commit();

            if (tipo != null) {

                //Actualizamos valores
                if (!tipo.getNombre().equals(nombre)) {
                    tipo.setNombre(nombre);
                }

                //Persistencia de datos
                session.beginTransaction();
                session.persist(nombre);
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

    public boolean deleteTipo(RestaurantesTipos tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Restaurantes> buscarRestaurantes(String texto, int idCiudad, String codPais, int idTipo, int valoracion, String horaApertura, String horaCierre) {
        
    
        return null;
    }

}
