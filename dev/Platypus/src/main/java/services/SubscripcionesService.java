/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.SubscripcionesDao;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Subscripciones;
import model.SubscripcionesTipos;

/**
 *
 * @author Seix
 */
@Path("subscripciones")
public class SubscripcionesService {
    
//    private final SubscripcionesDao subscripcionesDao = new SubscripcionesDao();
//        
//    @GET
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Subscripciones> getTodasSubscripciones(){
//        return subscripcionesDao.getAll();
//    }
//    
//    @POST
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean crearSubscripcion(Subscripciones subscripcion){
//        return subscripcionesDao.create(subscripcion);
//    }
//    
//    @PUT
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean modificarSubscripcion(Subscripciones subscripcion, Subscripciones updatedSubscripcion){
//        return subscripcionesDao.update(subscripcion, updatedSubscripcion);
//    }
//    
//    @DELETE
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean eliminarSubscripcion(Subscripciones subscripcion){
//        return subscripcionesDao.delete(subscripcion);
//    }
//    
//    @GET
//    @Path("/tipos")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<SubscripcionesTipos> getTodosTiposSubscripciones(){
//        return subscripcionesDao.getTiposAll();
//    }
//    
//    @POST
//    @Path("/tipos")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean crearTipoSubscripcion(SubscripcionesTipos tipo){
//        return subscripcionesDao.createTipo(tipo);
//    }
//    
//    @PUT
//    @Path("/tipos")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean modificarTipoSubscripcion(SubscripcionesTipos tipo, SubscripcionesTipos updatedTipo){
//        return subscripcionesDao.updateTipo(tipo, updatedTipo);
//    }
//    
//    @DELETE
//    @Path("/tipos")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean eliminarTipoSubscripcion(SubscripcionesTipos tipo){
//        return subscripcionesDao.deleteTipo(tipo);
//    }
}
