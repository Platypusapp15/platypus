/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Usuarios;
import model.UsuariosTipos;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

/**
 *
 * @author Seix
 */
public class UsuariosDao {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    /**
     * Obtiene todos los usuarios de la BD.
     *
     * @return Lista de Usuarios de la base de datos.
     */
    public List<Usuarios> getAll() {

        List<Usuarios> usuarios = new ArrayList<>();
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Query query = session.createSQLQuery("select * from usuarios");
            usuarios = query.list();
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
        return usuarios;
    }

    /**
     * Crea un usuario en la BD si no existe.
     *
     * @param usuario Objeto usuario que va a ser creado en la base de datos.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean create(Usuarios usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Actualiza los datos de un usuario de la BD.
     *
     * @param usuario Objeto usuario que va a ser modificado en la base de
     * datos.
     * @param updatedUsuario Objeto usuario modificado a persistir en la base de
     * datos.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean update(Usuarios usuario, Usuarios updatedUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Elimina un usuario de la BD.
     *
     * @param usuario Objeto usuario que va a ser eliminado de la base de datos.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean delete(Usuarios usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Obtiene todos los tipos de usuario de la BD.
     *
     * @return Lista de tipos de usuario de la base de datos.
     */
    public List<UsuariosTipos> getTiposAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Crea un tipo de usuario en la BD si no existe.
     *
     * @param tipo Objeto tipo de usuario que va a ser creado en la base de
     * datos.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean createTipo(UsuariosTipos tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Actualiza los datos de un tipo de usuario de la BD.
     *
     * @param tipo Objeto tipo de usuario que va a ser modificado en la base de
     * datos.
     * @param updatedTipo Objeto tipo de usuario modificado a persistir en la
     * base de datos.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean updateTipo(UsuariosTipos tipo, UsuariosTipos updatedTipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Elimina un tipo de usuario de la BD.
     *
     * @param tipo Objeto tipo de usuario que va a ser eliminado de la base de
     * datos.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean deleteTipo(UsuariosTipos tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Busca en la BD un usuario cuyo nombre y/o apellido(s) coinciden con la
     * cadena de texto recibida por parámetro.
     *
     * @param text Texto con el que se buscará al usuario.
     * @return Lista de usuarios que hayan sido encontrados. Esta estará vacía
     * si no ha habido ningún resultado.
     */
    public List<Usuarios> findByNameSurname(String text) {

        List<Usuarios> usuarios = new ArrayList<>();
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            
            Query query = session.createSQLQuery("select * from Usuarios u where u.nombre like :TEXTO or "
                    + "u.apellido1 like :TEXTO or u.apellido2 like :TEXTO")
                    .setString("TEXTO", text);
            usuarios = query.list();
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

        return usuarios;
    }

    public Usuarios login(String email, String password){
        
        Usuarios usuario = null;
        Session session = null;
        
        try {
            List <Usuarios> usuarios = null;
            session = sessionFactory.openSession();
            session.beginTransaction();
            Query query = session.createSQLQuery("select * from Usuarios u where u.email=:EMAIL")
                    .setString("EMAIL", email);
            usuarios = query.list();
            session.getTransaction().commit();
            
            if(!usuarios.isEmpty()){
                usuario = usuarios.get(0);
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

        return usuario;
    }
}
