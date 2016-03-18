/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

/**
 *
 * @author Seix
 */
public abstract class PlatypusDao {
    
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    protected Object executeNamedQuery(String namedQuery) {

        Session session = null;
        Object resultado = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Query query = session.getNamedQuery(namedQuery);
            resultado = query.list();
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

        return resultado;
    }
    
//    protected Object executeNamedQuery(String namedQuery, String[] params, String[] values) {
//
//        Session session = null;
//        Object resultado = null;
//
//        try {
//            session = sessionFactory.openSession();
//            session.beginTransaction();
//            Query query = session.getNamedQuery(namedQuery);
//            if(params.length > 0){
//                if(values.length > 0){
//                    int i = 0;
//                    while (i < query.getNamedParameters().length) {
//                        if(params[i] != null && values[i] != null){
//                            query.setParameter(params[i], values[i]);
//                        }
//                        i++;
//                    }
//                }
//            }
//            resultado = query.list();
//            session.getTransaction().commit();
//
//        } catch (Exception e) {
//            if (session != null) {
//                session.getTransaction().rollback();
//                System.out.println("\n Error message:\n" + e.getMessage() + "\n");
//            }
//
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//
//        return resultado;
//    }
    
}
