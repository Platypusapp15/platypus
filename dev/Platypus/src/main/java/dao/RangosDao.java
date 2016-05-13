/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Rangos;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author Seix
 */
public class RangosDao {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public List<Rangos> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Crea un rango en la base de datos si no encuentra un registro con el mismo nombre.
     * 
     * @param nombre String nombre del rango.
     * @param puntosNecesarios int puntos mínimos para alcanzar el rango. 
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean create(String nombre, int puntosNecesarios) {
        
        boolean creado = false;
        Rangos rango = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();

            //Comprobamos que este no existe ya en la base de datos.
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Rangos.class).add(Restrictions.like("nombre", nombre));
            Rangos ran = (Rangos) criteria.uniqueResult();
            session.getTransaction().commit();

            if (ran == null) {
                
                //Creamos el nuevo objeto a persistir en la base de datos.
                rango = new Rangos(nombre, puntosNecesarios);

                //Persistencia de datos
                session.beginTransaction();
                session.persist(rango);
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
     * Actualiza los datos de un rango de la base de datos.
     * 
     * @param idRango Identificador del rango a modificar.
     * @param nombre String nombre del rango.
     * @param puntosNecesarios int puntos mínimos para alzcanzar el rango.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean update(String idRango, String nombre, int puntosNecesarios) {

        boolean actualizado = false;
        Rangos rango = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();

            //Primero obtenemos el tipo de restaurante de la BD
            session.beginTransaction();
            rango = (Rangos) session.get(Rangos.class, idRango);
            session.getTransaction().commit();

            if (rango != null) {

                //Actualizamos valores
                if (!rango.getNombre().equals(nombre)) {
                    rango.setNombre(nombre);
                }
                if (rango.getPuntosNecesarios() != puntosNecesarios) {
                    rango.setPuntosNecesarios(puntosNecesarios);
                }

                //Persistencia de datos
                session.beginTransaction();
                session.persist(rango);
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

    public boolean delete(Rangos rango) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
