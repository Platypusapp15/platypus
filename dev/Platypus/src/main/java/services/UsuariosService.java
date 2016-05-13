/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.UsuariosDao;
import java.util.GregorianCalendar;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Seix
 */
@Path("usuarios")
public class UsuariosService {

    private final UsuariosDao usuariosDao = new UsuariosDao();
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
    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean crearUsuario(@FormParam("email") String email, 
                                @FormParam("password") String password,
                                @FormParam("tipoUsuario") String tipoUsuario) {
        
        return usuariosDao.create(email, password, tipoUsuario);
    }
    
    @PUT
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean modificarUsuario(@FormParam("id") int id,
                                    @FormParam("email") String email,
                                    @FormParam("nombre") String nombre,
                                    @FormParam("apellido1") String apellido1,
                                    @FormParam("apellido2") String apellido2,
                                    @FormParam("sexo") String sexo,
                                    @FormParam("day") int day,
                                    @FormParam("month") int month,
                                    @FormParam("year") int year,
                                    @FormParam("idDireccion") int idDireccion){
        GregorianCalendar fechaNacimiento = new GregorianCalendar(year, month, day);
        return usuariosDao.update(id, email, nombre, apellido1, apellido2, sexo, fechaNacimiento.getTime(), idDireccion);
    }
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
