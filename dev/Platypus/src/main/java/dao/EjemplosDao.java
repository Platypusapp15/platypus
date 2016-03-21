package dao;

import java.util.ArrayList;
import java.util.List;
import model.Usuarios;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

/**
 *
 * @author Seix
 */

// Evitar uso de select * e indicar siempre los campos para evitar mostrar más datos de lo que deberíamos 
public class EjemplosDao {
    
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    //Ejemplo sentencia SQL sin parámetros
    public List<Usuarios> sinParametros() {

        List<Usuarios> usuarios = new ArrayList<>();
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            
            //Variación
            session.createSQLQuery("select * from usuarios"); 
            //Variación
            
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
    
    // Ejemplo sentencia SQL con parámetros.
    // No es necesario indicar los parámetros en mayúsculas, pero se entiende mejor
    public List<Usuarios> conParametros(String nombre, String apellido) {

        List<Usuarios> usuarios = new ArrayList<>();
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            
            //Variación
            session.createSQLQuery("select * from usuarios u where u.nombre=:NOMBRE and u.apellido=:APELLIDO")
                    .setString("NOMBRE", nombre)
                    .setString("APELLIDO", apellido);
            //Variación
                
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
    
}
