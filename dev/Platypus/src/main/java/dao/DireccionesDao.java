/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.City;
import model.Country;
import model.Direcciones;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import util.Defs;
import util.HibernateUtil;

/**
 *
 * @author Seix
 */
public class DireccionesDao {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public List<Direcciones> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Crea una dirección en la base de datos. Recibe todos los datos de una
     * dirección. Primero recuperará de la base de datos la Ciudad, después
     * creará el nuevo objeto a persistir en la base de datos.
     *
     * @param calle String nombre de la calle.
     * @param numero int numero de la calle.
     * @param idCiudad int Identificador de una City.
     * @param poblacion String nombre del municipio.
     * @param codigoPostal String código postal.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean create(String calle, int numero, int idCiudad, String poblacion, String codigoPostal) {
        boolean creado = false;
        Session session = null;
        Direcciones direccion = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();

            //Primero recuperamos la ciudad de la BD
            City ciudad = (City) session.get(City.class, idCiudad);
            session.getTransaction().commit();
            if (ciudad != null) {
                direccion = new Direcciones(ciudad, calle, String.valueOf(numero), poblacion, codigoPostal);

                //Persistencia de datos
                session.beginTransaction();
                session.persist(direccion);
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
     * Actualiza los datos de una dirección de la base de datos. Se comprueban
     * los datos modificados y se actualiza la dirección con los nuevos datos.
     * Finalmente se guarda la información en la base de datos. Antes de
     * modificar la ciudad de la dirección se comprobará que esta existe en la
     * base de datos.
     *
     * @param id int Identificador de la direccion a modificar.
     * @param calle String nombre de la callse.
     * @param numero int número de la calle.
     * @param idCiudad int Identificador de una City.
     * @param provincia String nombre de provincia.
     * @param codigoPostal String código postal.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean update(int id, String calle, int numero, int idCiudad, String poblacion, String codigoPostal) {

        boolean actualizado = false;
        Direcciones direccion = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();

            //Primero obtenemos la dirección a modificar de la BD
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Direcciones.class).add(Restrictions.like("id", id));
            direccion = (Direcciones) criteria.uniqueResult();
            session.getTransaction().commit();

            //Obtenemos la City con el identificador proporcionado
            session.beginTransaction();
            Criteria criteriaCity = session.createCriteria(City.class).add(Restrictions.like("id", idCiudad));
            City city = (City) criteriaCity.uniqueResult();
            session.getTransaction().commit();

            if (direccion != null && city != null) {

                //Actualizamos valores
                if (!direccion.getCalle().equals(calle)) {
                    direccion.setCalle(calle);
                }
                if (!direccion.getCity().equals(city)) {
                    direccion.setCity(city);
                }
                if (!direccion.getCp().equals(codigoPostal)) {
                    direccion.setCp(codigoPostal);
                }
                if (!direccion.getNumero().equals(String.valueOf(numero))) {
                    direccion.setNumero(String.valueOf(numero));
                }
                if (!direccion.getPoblacion().equals(poblacion)) {
                    direccion.setPoblacion(poblacion);
                }

                //Persistencia de datos
                session.beginTransaction();
                session.persist(direccion);
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

    public boolean delete(Direcciones direccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Country> getListCountry(){
        List<Country> paises = new ArrayList<>();
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Criteria critera = session.createCriteria(Country.class);
            paises = critera.list();
            session.getTransaction().commit();

        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
                System.out.println("\n Error message:\n" + e.getMessage() + "\n");
            }

        } finally {
            if (session != null) {
                session.close();
            }
        }
        return paises;
    }
    
    public List<City> getListCity(String codCountry){
        List<City> ciudades = new ArrayList<>();
        Country pais = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Criteria critera = session.createCriteria(Country.class).add(Restrictions.like("code", codCountry));
            pais = (Country) critera.uniqueResult();
            session.getTransaction().commit();

            if(pais != null){
                session.beginTransaction();
                critera = session.createCriteria(City.class).add(Restrictions.like("country", pais));
                ciudades = critera.list();
                session.getTransaction().commit();
            }
            
        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
                System.out.println("\n Error message:\n" + e.getMessage() + "\n");
            }

        } finally {
            if (session != null) {
                session.close();
            }
        }
        return ciudades;
    }
    
}
