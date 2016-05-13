/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.SubscripcionesDao;
import java.util.GregorianCalendar;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.SubscripcionesTipos;

/**
 *
 * @author Seix
 */
@Path("subscripciones")
public class SubscripcionesService {
    
    private final SubscripcionesDao subscripcionesDao = new SubscripcionesDao();
//        
//    @GET
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Subscripciones> getTodasSubscripciones(){
//        return subscripcionesDao.getAll();
//    }
//    
    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean crearSubscripcion(@FormParam("idRestaurante") int idRestaurante,
                                     @FormParam("idTipoSubscripcion") int idTipoSubscripcion,
                                     @FormParam("day") int day,
                                     @FormParam("month") int month,
                                     @FormParam("year") int year){
        GregorianCalendar cal = new GregorianCalendar(year, month, day);
        return subscripcionesDao.create(idRestaurante, idTipoSubscripcion, cal.getTime());
    }
    
    @PUT
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean modificarSubscripcion(@FormParam("idRestaurante") int idRestaurante,
                                         @FormParam("idTipoSubscripcion") int idTipoSubscripcion,
                                         @FormParam("day") int day,
                                         @FormParam("month") int month,
                                         @FormParam("year") int year){
        GregorianCalendar cal = new GregorianCalendar(year, month, day);
        return subscripcionesDao.update(idRestaurante, idTipoSubscripcion, cal.getTime());
    }
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
    @POST
    @Path("/tipos")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean crearTipoSubscripcion(@FormParam("nombre") String nombre,
                                         @FormParam("dias") int dias,
                                         @FormParam("precio") float precio){
        return subscripcionesDao.createTipo(nombre, dias, precio);
    }
    
    @PUT
    @Path("/tipos")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean modificarTipoSubscripcion(@FormParam("idTipo") int idTipo,
                                             @FormParam("nombre") String nombre,
                                             @FormParam("dias") int dias,
                                             @FormParam("precio") float precio){
        return subscripcionesDao.updateTipo(idTipo, nombre, dias, precio);
    }
    
//    @DELETE
//    @Path("/tipos")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean eliminarTipoSubscripcion(SubscripcionesTipos tipo){
//        return subscripcionesDao.deleteTipo(tipo);
//    }
}
