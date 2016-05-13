/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.GregorianCalendar;
import java.util.List;
import model.Consultas;
import model.ConsultasId;
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

public class ConsultasDao{
    
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    public List<Consultas> getAll(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Registra en la base de datos si un usuario ha consultado un restaurante y la fecha del hecho.
     * Se almacenará únicamente la última vez en que el usuario visualizó los datos del restaurante.
     * Primero se comprueba si existe ya la consulta en la base de datos para el usuario y restaurante indicados.
     * En caso de no existir se creará una nueva consulta con la fecha del hecho.
     * En caso de existir, se modificará la fecha de la consulta.
     * 
     * @param idUsuario Identificador del usuario que realiza la consulta.
     * @param idRestaurante Identificador del restaurante que es consultado.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean create(int idUsuario, int idRestaurante) {

        boolean creado = false;
        Consultas consulta = null;
        Restaurantes restaurante = null;
        Usuarios usuario = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();

            ConsultasId consIdAux = new ConsultasId(idUsuario, idRestaurante);
            //Comprobamos que este no existe ya en la base de datos.
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Consultas.class).add(Restrictions.like("id", consIdAux));
            //criteria.add(Restrictions.like("id_restaurante", idRestaurante));
            consulta = (Consultas) criteria.uniqueResult();
            session.getTransaction().commit();

            if (consulta == null) {                
                //Obtenemos el usuario y el restaurante de la base de datos.
                session.beginTransaction();
                restaurante = (Restaurantes) session.get(Restaurantes.class, idRestaurante);
                usuario = (Usuarios) session.get(Usuarios.class, idUsuario);
                session.getTransaction().commit();
                
                //Creamos el nuevo objeto a persistir en la base de datos.
                ConsultasId consultaId = new ConsultasId(idUsuario, idRestaurante);
                consulta = new Consultas(consultaId, restaurante, usuario);
                setFechaActualConsulta(consulta);

                //Persistencia de datos
                session.beginTransaction();
                session.persist(consulta);
                session.getTransaction().commit();
                creado = true;
            }
            else{
                //Actualizaremos los datos de la consulta
                setFechaActualConsulta(consulta);
                
                session.beginTransaction();
                session.persist(consulta);
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
    
    public boolean update(Consultas consulta, Consultas updatedConsulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(Consultas consulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Establece la fecha actual a una consulta.
    private void setFechaActualConsulta(Consultas consulta){
        GregorianCalendar cal = new GregorianCalendar();
        
        if(consulta != null){
            consulta.setFecha(cal.getTime());
        }
    }
}
