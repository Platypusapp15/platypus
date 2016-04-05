/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.RestaurantesDao;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Restaurantes;
import model.RestaurantesTipos;

/**
 *
 * @author Seix
 */
@Path("restaurantes")
public class RestaurantesService {
    
//    private final RestaurantesDao restaurantesDao = new RestaurantesDao();
//    
//    @GET
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Restaurantes> getTodosRestaurantes(){
//        return restaurantesDao.getAll();
//    }
//    
//    @POST
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean crearRestaurante(Restaurantes restaurante){
//        return restaurantesDao.create(restaurante);
//    }
//    
//    @PUT
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean modificarRestaurante(Restaurantes restaurante, Restaurantes updatedRestaurante){
//        return restaurantesDao.update(restaurante, updatedRestaurante);
//    }
//    
//    @DELETE
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean eliminarRestaurante(Restaurantes restaurante){
//        return restaurantesDao.delete(restaurante);
//    }
//    
//    @GET
//    @Path("/tipos")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<RestaurantesTipos> getTodosTiposRestaurantes(){
//        return restaurantesDao.getTiposAll();
//    }
//    
//    @POST
//    @Path("/tipos")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean crearTipoRestaurante(RestaurantesTipos tipo){
//        return restaurantesDao.createTipo(tipo);
//    }
//    
//    @PUT
//    @Path("/tipos")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean modificarTipoRestaurante(RestaurantesTipos tipo, RestaurantesTipos updatedTipo){
//        return restaurantesDao.updateTipo(tipo, updatedTipo);
//    }
//    
//    @DELETE
//    @Path("/tipos")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean eliminarTipoRestaurante(RestaurantesTipos tipo){
//        return restaurantesDao.deleteTipo(tipo);
//    }
}
