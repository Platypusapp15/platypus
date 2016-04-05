/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.ComentariosDao;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Comentarios;

/**
 *
 * @author Seix
 */
@Path("comentarios")
public class ComentariosService {
    
//    private final ComentariosDao comentariosDao = new ComentariosDao();
//    
//    @GET
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Comentarios> getTodosComentarios(){
//        return comentariosDao.getAll();
//    }
//    
//    @POST
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean crearComentario(@FormParam("comentario") Comentarios comentario){
//        return comentariosDao.create(comentario);
//    }
//    
//    @PUT
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean modificarComentario(Comentarios comentario, Comentarios updatedComentario){
//        return comentariosDao.update(comentario, updatedComentario);
//    }
//    
//    @DELETE
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean eliminarComentario(Comentarios comentario){
//        return comentariosDao.delete(comentario);
//    }
}
