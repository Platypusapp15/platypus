/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.GregorianCalendar;
import java.util.List;
import model.Comentarios;
import model.Restaurantes;
import model.Usuarios;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import util.Defs;
import util.HibernateUtil;

/**
 *
 * @author Seix
 */
public class ComentariosDao {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    public List<Comentarios> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Crea un comentario en la base de datos. Se obtiene de la base de datos el usuario que 
     * hace el comentario y el restaurante al que se lo hace. Se comprobará si es un comentario
     * sobre otro comentario o no. Una vez verificado, se creará el nuevo comentario con la fecha
     * actual del sistema.
     * 
     * @param idUsuario Identificador de usuario.
     * @param idRestaurante Identificador de restaurante.
     * @param texto String contenido del comentario.
     * @param idComentario Identificador de un comentario en caso de que un comentario pertenezca a otro.
     * @return True or False si la operación ha tenido éxito.
     */
    public boolean create(int idUsuario, int idRestaurante, String texto, int idComentario) {
        
        boolean creado = false;
        Comentarios comentario = null;
        Comentarios comentarioAux = null;
        Restaurantes restaurante = null;
        Usuarios usuario = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            
            //Obtenemos el restaurante y el usuario
            session.beginTransaction();
            restaurante = (Restaurantes) session.get(Restaurantes.class, idRestaurante);
            usuario = (Usuarios) session.get(Usuarios.class, idUsuario);
            session.getTransaction().commit();
            
            //Si es un comentario sobre otro comentario lo recuperaremos
            if(idComentario != Defs.INVALID_COMENTARIO_ID){
                session.beginTransaction();
                Criteria criteria = session.createCriteria(Comentarios.class).add(Restrictions.like("id", idComentario));
                comentarioAux = (Comentarios) criteria.uniqueResult();//session.get(Comentarios.class, idComentario);
                session.getTransaction().commit();
            }
            
            if (restaurante != null && usuario != null && !texto.isEmpty()) {
                
                GregorianCalendar cal = new GregorianCalendar();
                
                //Creamos el nuevo objeto a persistir en la base de datos.
                if(comentarioAux != null){
                    comentario = new Comentarios(comentarioAux, restaurante, usuario, texto, cal.getTime());
                }else{
                    comentario = new Comentarios(null, restaurante, usuario, texto, cal.getTime());
                }

                //Persistencia de datos
                session.beginTransaction();
                session.persist(comentario);
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
    
    public boolean update(Comentarios comentario, Comentarios updatedComentario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(Comentarios comentario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
