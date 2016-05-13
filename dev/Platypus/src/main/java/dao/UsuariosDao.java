/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import model.Direcciones;
import model.Rangos;
import model.Usuarios;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import util.Defs;
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
     * en algún registro de la base de datos, de no encontrarlo. 
     * En caso de no especificar un tipo de usuario, se asumirá que es del tipo Usuario
     * (no administrador, no restaurante...)
     * Aquí se encripta la contraseña antes de ser almacenado el nuevo
     * usuario en la base de datos.
     *
     * @param email String correo electrónico a registrar.
     * @param password String contraseña aún sin encriptar.
     * @param tipoUsuario String con el valor del tipo de usuario a persistir.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean create(String email, String password, String tipoUsuario) {

        boolean creado = false;
        Usuarios usuario = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();

            //Primero comprobamos que el email no existe en la BD
            Criteria criteria = session.createCriteria(Usuarios.class).add(Restrictions.like("email", email));
            session.getTransaction().commit();
            if (criteria.uniqueResult() == null) {
                
                session.beginTransaction();
                //Ya que estamos creando un usuario nuevo, asignaremos automáticamente el rango más bajo.
                Rangos rango = (Rangos) session.get(Rangos.class, 2); //Editar
                session.getTransaction().commit();
                
                //Si no se indica el tipo de usuario, asumiremos que es un usuario no admonistrador
                //ni restaurante.
                if(tipoUsuario.isEmpty() || tipoUsuario.equals("")){
                    tipoUsuario = Defs.USUARIO_TIPO_USUARIO;
                }
                
                //Creamos el nuevo objeto a persistir en la base de datos.
                usuario = new Usuarios(rango, email, Utils.encriptarPassword(password), tipoUsuario, 1F);

                //Persistencia de datos
                session.beginTransaction();
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
     * Actualiza los datos de un usuario de la BD. Se comprueban los datos modificados y se actualiza
     * el usuario con los nuevos datos. Finalmente se guarda la información en la base de datos.
     * Antes de modificar la dirección se comprobará que esta existe en la base de datos.
     * 
     * @param id Identificador del usuario a modificar.
     * @param email String con el Email del usuario.
     * @param nombre String con el Nombre del usuario.
     * @param apellido1 String con el Apellido1 del usuario.
     * @param apellido2 String con el Apellido2 del usuario.
     * @param sexo String con el Sexo del usuario.
     * @param fechaNacimiento Date con la fecha de Nacimiento del usuario.
     * @param idDireccion Identificador de la dirección del usuario.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean update(int id, String email, String nombre, String apellido1, String apellido2, String sexo, Date fechaNacimiento, int idDireccion) {
        
        boolean actualizado = false;
        Usuarios usuario = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();

            //Primero comprobamos que el email no existe en la BD
            Criteria criteria = session.createCriteria(Usuarios.class).add(Restrictions.like("id", id));
            usuario = (Usuarios) criteria.uniqueResult();
            session.getTransaction().commit();
            if (usuario != null) {
                
                //Actualizamos valores
                if(!usuario.getEmail().equals(email)){
                    usuario.setEmail(email);
                }
                if(usuario.getNombre() == null || !usuario.getNombre().equals(nombre)){
                    usuario.setNombre(nombre);
                }
                if(usuario.getApellido1() == null || !usuario.getApellido1().equals(apellido1)){
                    usuario.setApellido1(apellido1);
                }
                if(usuario.getApellido2() == null || !usuario.getApellido2().equals(apellido2)){
                    usuario.setApellido2(apellido2);
                }
                if(usuario.getSexo() == null || !usuario.getSexo().equals(sexo)){
                    usuario.setSexo(sexo);
                }
                if(usuario.getFechaNacimiento() == null || !usuario.getFechaNacimiento().equals(fechaNacimiento)){
                    usuario.setFechaNacimiento(fechaNacimiento);
                }
                
                //Primero buscamos la nueva dirección en la base de datos antes de asignarla
                if(idDireccion != Defs.INVALID_DIRECCION_ID){
                    session.beginTransaction();
                    criteria = session.createCriteria(Direcciones.class, String.valueOf(idDireccion));
                    Direcciones dir = (Direcciones) criteria.uniqueResult();
                    session.getTransaction().commit();
                    
                    if(dir != null){
                        if(usuario.getDirecciones() != null){
                            if(!usuario.getDirecciones().equals(dir)){
                                usuario.setDirecciones(dir);
                            }
                        }
                        else{
                            usuario.setDirecciones(dir);
                        }
                    }
                }
                
                session.beginTransaction();
                
                //Persistencia de datos
                session.persist(usuario);
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
     * Elimina un usuario de la BD.
     * Busca el usuario en la base de datos y comprueba la concordancia de email y password.
     * Si coinciden, se procederá a eliminar la cuenta.
     * 
     * @param email
     * @param password
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean delete(String email, String password) {
        boolean eliminado = false;
        Usuarios usuario = null;
        Session session = null;
        
        try {
            
            session = sessionFactory.openSession();
            session.beginTransaction();

            Criteria criteria = session.createCriteria(Usuarios.class)
                    .add(Restrictions.like("email", email));
            criteria.add(Restrictions.like("password", Utils.encriptarPassword(password)));
            usuario = (Usuarios) criteria.uniqueResult();
            session.getTransaction().commit();

            if (usuario != null) {
                session.beginTransaction();
                session.delete(usuario);
                session.getTransaction().commit();
                eliminado = true;
            }
            
        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
                System.out.println("\n Error message:\n" + e.getMessage() + "\n");
            }
            eliminado = false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return eliminado;
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
            criteria.add(Restrictions.like("password", Utils.encriptarPassword(password)));
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
