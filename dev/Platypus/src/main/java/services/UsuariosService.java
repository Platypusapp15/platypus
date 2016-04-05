/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.UsuariosDao;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Usuarios;
import model.UsuariosTipos;

/**
 *
 * @author Seix
 */
@Path("usuarios")
public class UsuariosService {
    
//    private final UsuariosDao usuariosDao = new UsuariosDao();
//     
//    @GET
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Usuarios> getTodosUsuarios(){
//        return usuariosDao.getAll();
//    }
//    
//    @POST
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean crearUsuario(Usuarios usuario){
//        return usuariosDao.create(usuario);
//    }
//    
//    @PUT
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean modificarUsuario(Usuarios usuario, Usuarios updatedUsuario){
//        return usuariosDao.update(usuario, updatedUsuario);
//    }
//    
//    @DELETE
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean eliminarUsuario(Usuarios usuario){
//        return usuariosDao.delete(usuario);
//    }
//    
//    @GET
//    @Path("/tipos")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<UsuariosTipos> getTodosTiposUsuarios(){
//        return usuariosDao.getTiposAll();
//    }
//    
//    @POST
//    @Path("/tipos")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean crearTipoUsuario(UsuariosTipos tipo){
//        return usuariosDao.createTipo(tipo);
//    }
//    
//    @PUT
//    @Path("/tipo")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean modificarTipoUsuario(UsuariosTipos tipo, UsuariosTipos updatedTipo){
//        return usuariosDao.updateTipo(tipo, updatedTipo);
//    }
//    
//    @DELETE
//    @Path("/tipos")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean eliminarTipoUsuario(UsuariosTipos tipo){
//        return usuariosDao.deleteTipo(tipo);
//    }
//    
}
