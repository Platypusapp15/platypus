/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Comentarios;

/**
 *
 * @author Seix
 */
public class ComentariosDao extends PlatypusDao {

    public List<Comentarios> getAll() {
        
        List<Comentarios> comentarios = new ArrayList<>();
        comentarios = (List)executeNamedQuery("model.Comentarios.getAll");
        return comentarios;
    }

    public boolean create(Comentarios comentario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(Comentarios comentario, Comentarios updatedComentario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(Comentarios comentario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
