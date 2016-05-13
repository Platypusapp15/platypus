/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Date;
import java.util.List;
import model.Reservas;
import model.ReservasId;
import model.Restaurantes;
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
public class ReservasDao {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public List<Reservas> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Crea una reserva en la base de datos. Se comprobará que no existe ya una reserva del usuario
     * en el restaurante en una misma fecha. Comprobado que tanto el usuario como el restaurante existen
     * en la base de datos, se creará la nueva reserva.
     * 
     * @param idUsuario Identificador de usuario.
     * @param idRestaurante Identificador de restaurante.
     * @param fecha Date fecha reservada.
     * @param numeroPersonas int Número de personas que asistirán a la reserva.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean create(int idUsuario, int idRestaurante, Date fecha, int numeroPersonas) {

        boolean creado = false;
        Reservas reserva = null;
        Restaurantes restaurante = null;
        Usuarios usuario = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            
            ReservasId resIdAux = new ReservasId(idUsuario, idRestaurante, fecha);
            
            //Comprobamos que este no existe ya en la base de datos.
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Reservas.class).add(Restrictions.like("id", resIdAux));
            reserva = (Reservas) criteria.uniqueResult();
            session.getTransaction().commit();

            //Comprobamos que existen el usuario y el restaurante en la base de datos.
            session.beginTransaction();
            restaurante = (Restaurantes) session.get(Restaurantes.class, idRestaurante);
            usuario = (Usuarios) session.get(Usuarios.class, idUsuario);
            session.getTransaction().commit();
            
            if (reserva == null && usuario != null && restaurante != null) {
                
                //Creamos el nuevo objeto a persistir en la base de datos.
                ReservasId resId = new ReservasId(idUsuario, idRestaurante, fecha);
                reserva = new Reservas(resId, restaurante, usuario, numeroPersonas, false);

                //Persistencia de datos
                session.beginTransaction();
                session.persist(reserva);
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

    public boolean update(Reservas reserva, Reservas updatedReserva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(Reservas reserva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
