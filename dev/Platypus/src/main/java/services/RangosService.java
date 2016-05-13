/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.RangosDao;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Rangos;

/**
 *
 * @author Seix
 */
@Path("rangos")
public class RangosService {
    
    private final RangosDao rangosDao = new RangosDao();
    
//    @GET
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Rangos> getTodosRangos(){
//        return rangosDao.getAll();
//    }
//    
    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean crearRango(@FormParam("nombre") String nombre,
                              @FormParam("puntosNecesarios") int puntosNecesarios){
        return rangosDao.create(nombre, puntosNecesarios);
    }
    
    @PUT
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean modificarRango(@FormParam("idRango") String idRango,
                                  @FormParam("nombre") String nombre,
                                  @FormParam("puntosNecesarios") int puntosNecesarios){
        return rangosDao.update(idRango, nombre, puntosNecesarios);
    }
//    
//    @DELETE
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean eliminarRango(Rangos rango){
//        return rangosDao.delete(rango);
//    }
}
