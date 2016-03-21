package util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 * Esta clase se encarga de leer el fichero de configuración de Hibernate (Hibernate.cfg.xml)
 * del que obtendrá datos como la cadena de conexión a la base de datos, nombre de usuario y contraseña,
 * número de conexiones máximas, mínimas... entre otras cosas.
 * 
 * @author Seix
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
              Configuration configuration = new Configuration();
              return configuration.configure()
                                  .buildSessionFactory(
                                       new StandardServiceRegistryBuilder()  
                                          .applySettings(configuration.getProperties())
                                          .build());
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
