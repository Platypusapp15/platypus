/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.DireccionesDao;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Direcciones;

/**
 *
 * @author Seix
 */
@Path("direcciones")
public class DireccionesService {
    
//    private final DireccionesDao direccionesDao = new DireccionesDao();
//    
//    @GET
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Direcciones> getTodasDirecciones(){
//        return direccionesDao.getAll();
//    }
//        
//    @POST
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean crearDireccion(Direcciones direccion){
//        return direccionesDao.create(direccion);
//    }
//        
//    @PUT
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean modificarDireccion(Direcciones direccion, Direcciones updatedDireccion){
//        return direccionesDao.update(direccion, updatedDireccion);
//    }
//        
//    @DELETE
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean eliminarDireccion(Direcciones direccion){
//        return direccionesDao.delete(direccion);
//    }
}
