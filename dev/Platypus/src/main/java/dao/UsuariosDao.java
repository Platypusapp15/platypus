/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import model.Rangos;
import model.Usuarios;
import model.UsuariosTipos;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;
import util.Utils;

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
            Criteria critera = session.createCriteria(Usuarios.class);
            usuarios = critera.list();
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
     * Crea un usuario en la BD si no existe. Recibe todos los datos relacionados con el usuario.
     * Primero buscará si existe el email en algún registro de la base de datos, de no encontrarlo, 
     * encriptará la contraseña (que ha de recibir sin encriptar) para después persistir el nuevo
     * usario.
     *
     * @param usuario Objeto usuario que va a ser creado en la base de datos.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean create(Usuarios usuario) {
        boolean creado = false;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();

            //Primero comprobamos que el email no existe en la BD
            Criteria criteria = session.createCriteria(Usuarios.class).add(Restrictions.like("email", usuario.getEmail()));
            if (criteria.uniqueResult() == null) {
                
                usuario.setPassword(Utils.encriptarPassword(usuario.getPassword()));
                
                //Persistencia de datos
                session.persist(usuario);
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
     * Crea un usuario en la BD si no existe. Primero buscará si existe el email
     * en algún registro de la base de datos, de no encontrarlo, obtendrá el
     * tipo de usuario de la base de datos para relacionarlo con el nuevo
     * usuario. Aquí se encripta la contraseña antes de ser almacenado el nuevo
     * usuario en la base de datos.
     *
     * @param email String correo electrónico a registrar.
     * @param password String contraseña aún sin encriptar.
     * @param idTipoUsuario int identificador del tipo de usuario a persistir.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean create(String email, String password, int idTipoUsuario) {

        boolean creado = false;
        Usuarios usuario = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();

            //Primero comprobamos que el email no existe en la BD
            Criteria criteria = session.createCriteria(Usuarios.class).add(Restrictions.like("email", email));
            if (criteria.uniqueResult() == null) {
                //Obtenemos el tipo de usuario
                UsuariosTipos tipoUsuario = (UsuariosTipos) session.get(UsuariosTipos.class, idTipoUsuario);

                //Ya que estamos creando un usuario nuevo, asignaremos automáticamente el rango más bajo.
                Rangos rango = (Rangos) session.get(Rangos.class, 2);

                //Asignamos valores
                usuario.setEmail(email);
                usuario.setPassword(Utils.encriptarPassword(password));
                usuario.setUsuariosTipos(tipoUsuario);
                usuario.setPuntos(1F);
                usuario.setRangos(rango);

                //Persistencia de datos
                session.persist(usuario);
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

    /**
     * Verifica las credenciales del usuario. Si son correctas se registrará en
     * la base de datos la fecha.
     * 
     * @param email String email del usuario a verificar
     * @param password String contraseña sin encriptar del usuario a verificar
     * @return Objeto Usuario con los datos de éste si la verificación ha tenido
     * éxito o null.
     */
    public Usuarios login(String email, String password) {

        Usuarios usuario = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();

            Criteria criteria = session.createCriteria(Usuarios.class)
                    .add(Restrictions.like("email", email));
            criteria.add(Restrictions.like("passord", Utils.encriptarPassword(password)));
            usuario = (Usuarios) criteria.uniqueResult();
            session.getTransaction().commit();

            if (usuario != null) {
                GregorianCalendar calendar = new GregorianCalendar();
                usuario.setFechaUltimoLogin(calendar.getTime());
                session.beginTransaction();
                session.update(usuario);
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

        return usuario;
    }

    //TODO
    public boolean logout(String email) {

        boolean loggedout = false;
        Usuarios usuario = null;
        Session session = null;

        try {

            loggedout = true;

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

        return loggedout;
    }
}
