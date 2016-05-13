/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.RestaurantesDao;
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
@Path("restaurantes")
public class RestaurantesService {
    
    private final RestaurantesDao restaurantesDao = new RestaurantesDao();
    
//    @GET
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Restaurantes> getTodosRestaurantes(){
//        return restaurantesDao.getAll();
//    }
//    
    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean crearRestaurante(@FormParam("idUsuario") int idUsuario,
                                    @FormParam("nombre") String nombre, 
                                    @FormParam("idDireccion") int idDireccion, 
                                    @FormParam("idTipo") int idTipo, 
                                    @FormParam("descripcion") String descripcion, 
                                    @FormParam("email") String email, 
                                    @FormParam("plazas") int plazas, 
                                    @FormParam("horaApertura") String horaApertura, 
                                    @FormParam("horaCierre") String horaCierre, 
                                    @FormParam("telefono") int telefono, 
                                    @FormParam("coordenadas") String coordenadas, 
                                    @FormParam("imgUrl") String imgUrl){
        String[] hApertura = horaApertura.split(":");
        String[] hCierre = horaCierre.split(":");
        
        GregorianCalendar calApertura = new GregorianCalendar(2000, 01, 01, Integer.parseInt(hApertura[0]), Integer.parseInt(hApertura[1]));
        GregorianCalendar calCierre = new GregorianCalendar(2000, 01, 01, Integer.parseInt(hCierre[0]), Integer.parseInt(hCierre[1]));
        
        return restaurantesDao.create(idUsuario, nombre, idDireccion, idTipo, descripcion, email, plazas, calApertura.getTime(), calCierre.getTime(), telefono, coordenadas, imgUrl);
    }
    
    @PUT
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean modificarRestaurante(@FormParam("idRestaurante") int idRestaurante,
                                        @FormParam("idUsuario") int idUsuario,
                                        @FormParam("nombre") String nombre, 
                                        @FormParam("idDireccion") int idDireccion, 
                                        @FormParam("idTipo") int idTipo, 
                                        @FormParam("descripcion") String descripcion, 
                                        @FormParam("email") String email, 
                                        @FormParam("plazas") int plazas, 
                                        @FormParam("horaApertura") String horaApertura, 
                                        @FormParam("horaCierre") String horaCierre, 
                                        @FormParam("telefono") int telefono, 
                                        @FormParam("coordenadas") String coordenadas, 
                                        @FormParam("imgUrl") String imgUrl){
        
        String[] hApertura = horaApertura.split(":");
        String[] hCierre = horaCierre.split(":");
        
        GregorianCalendar calApertura = new GregorianCalendar(2000, 01, 01, Integer.parseInt(hApertura[0]), Integer.parseInt(hApertura[1]));
        GregorianCalendar calCierre = new GregorianCalendar(2000, 01, 01, Integer.parseInt(hCierre[0]), Integer.parseInt(hCierre[1]));
        
        return restaurantesDao.update(idRestaurante, idUsuario, nombre, idDireccion, idTipo, descripcion, email, plazas, calApertura.getTime(), calCierre.getTime(), telefono, coordenadas, imgUrl);
    }
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
    @POST
    @Path("/tipos")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean crearTipoRestaurante(@FormParam("nombre") String nombre){
        return restaurantesDao.createTipo(nombre);
    }
    
    @PUT
    @Path("/tipos")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean modificarTipoRestaurante(@FormParam("idTipo") int idTipo,
                                            @FormParam("nombre") String nombre){
        return restaurantesDao.updateTipo(idTipo, nombre);
    }
//    
//    @DELETE
//    @Path("/tipos")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean eliminarTipoRestaurante(RestaurantesTipos tipo){
//        return restaurantesDao.deleteTipo(tipo);
//    }
}
