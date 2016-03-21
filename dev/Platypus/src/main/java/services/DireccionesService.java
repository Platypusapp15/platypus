/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.ComentariosDao;
import dao.ConsultasDao;
import dao.DireccionesDao;
import dao.RangosDao;
import dao.ReservasDao;
import dao.RestaurantesDao;
import dao.SubscripcionesDao;
import dao.UsuariosDao;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Comentarios;
import model.Consultas;
import model.Direcciones;
import model.Rangos;
import model.Reservas;
import model.Restaurantes;
import model.RestaurantesTipos;
import model.Subscripciones;
import model.SubscripcionesTipos;
import model.Usuarios;
import model.UsuariosTipos;

/**
 *
 * @author Seix
 */
@Path("service")
public class DireccionesService {
    
    private final ComentariosDao comentariosDao = new ComentariosDao();
    private final ConsultasDao consultasDao = new ConsultasDao();
    private final DireccionesDao direccionesDao = new DireccionesDao();
    private final RangosDao rangosDao = new RangosDao();
    private final ReservasDao reservasDao = new ReservasDao();
    private final RestaurantesDao restaurantesDao = new RestaurantesDao();
    private final SubscripcionesDao subscripcionesDao = new SubscripcionesDao();
    private final UsuariosDao usuariosDao = new UsuariosDao();
     
    //////// ---------------- Comentarios ---------------- ////////
    @GET
    @Path("/comentarios")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Comentarios> getTodosComentarios(){
        return comentariosDao.getAll();
    }
    
    @POST
    @Path("/comentarios")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean createComentario(Comentarios comentario){
        return comentariosDao.create(comentario);
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public boolean updateComentario(Comentarios comentario, Comentarios updatedComentario){
        return comentariosDao.update(comentario, updatedComentario);
    }
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteComentario(Comentarios comentario){
        return comentariosDao.delete(comentario);
    }
    
    //////// ---------------- Consutas ---------------- ////////
    @GET
    @Path("/consultas")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Consultas> getTodasConsultas(){
        return consultasDao.getAll();
    }
    
    @POST
    @Path("/consultas")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean createConsulta(Consultas consulta){
        return consultasDao.create(consulta);
    }
    
    @PUT
    @Path("/consultas")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean updateConsulta(Consultas consulta, Consultas updatedConsulta){
        return consultasDao.update(consulta, updatedConsulta);
    }
    
    @DELETE
    @Path("/consultas")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteConsulta(Consultas consulta){
        return consultasDao.delete(consulta);
    }
    
    //////// ---------------- Direcciones ---------------- ////////
    @GET
    @Path("/direcciones")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Direcciones> getTodasDirecciones(){
        return direccionesDao.getAll();
    }
        
    @POST
    @Path("/direcciones")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean createDireccion(Direcciones direccion){
        return direccionesDao.create(direccion);
    }
        
    @PUT
    @Path("/direcciones")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean updateDireccion(Direcciones direccion, Direcciones updatedDireccion){
        return direccionesDao.update(direccion, updatedDireccion);
    }
        
    @DELETE
    @Path("/direcciones")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteDireccion(Direcciones direccion){
        return direccionesDao.delete(direccion);
    }
        
    //////// ---------------- Rangos ---------------- ////////
    @GET
    @Path("/rangos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Rangos> getTodosRangos(){
        return rangosDao.getAll();
    }
    
    @POST
    @Path("/rangos")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean createRango(Rangos rango){
        return rangosDao.create(rango);
    }
    
    @PUT
    @Path("/rangos")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean updateRango(Rangos rango, Rangos updatedRango){
        return rangosDao.update(rango, updatedRango);
    }
    
    @DELETE
    @Path("/rangos")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteRango(Rangos rango){
        return rangosDao.delete(rango);
    }
    
    //////// ---------------- Reservas ---------------- ////////
    @GET
    @Path("/reservas")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Reservas> getTodasReservas(){
        return reservasDao.getAll();
    }
    
    @POST
    @Path("/reservas")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean createReserva(Reservas reserva){
        return reservasDao.create(reserva);
    }
    
    @PUT
    @Path("/reservas")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean updateReserva(Reservas reserva, Reservas updatedReserva){
        return reservasDao.update(reserva, updatedReserva);
    }
    
    @DELETE
    @Path("/reservas")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteReserva(Reservas reserva){
        return reservasDao.delete(reserva);
    }
    
    //////// ---------------- Restaurantes ---------------- ////////
    @GET
    @Path("/restaurantes")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Restaurantes> getTodosRestaurantes(){
        return restaurantesDao.getAll();
    }
    
    @POST
    @Path("/restaurantes")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean createRestaurante(Restaurantes restaurante){
        return restaurantesDao.create(restaurante);
    }
    
    @PUT
    @Path("/restaurantes")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean updateRestaurante(Restaurantes restaurante, Restaurantes updatedRestaurante){
        return restaurantesDao.update(restaurante, updatedRestaurante);
    }
    
    @DELETE
    @Path("/restaurantes")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteRestaurante(Restaurantes restaurante){
        return restaurantesDao.delete(restaurante);
    }
    
    @GET
    @Path("/restaurantes/tipos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<RestaurantesTipos> getTodosTiposRestaurantes(){
        return restaurantesDao.getTiposAll();
    }
    
    @POST
    @Path("/restaurantes/tipos")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean createTipoRestaurante(RestaurantesTipos tipo){
        return restaurantesDao.createTipo(tipo);
    }
    
    @PUT
    @Path("/restaurantes/tipos")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean updateTipoRestaurante(RestaurantesTipos tipo, RestaurantesTipos updatedTipo){
        return restaurantesDao.updateTipo(tipo, updatedTipo);
    }
    
    @DELETE
    @Path("/restaurantes/tipos")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteTipoRestaurante(RestaurantesTipos tipo){
        return restaurantesDao.deleteTipo(tipo);
    }
    
    
    //////// ---------------- Subscripciones ---------------- ////////
    @GET
    @Path("/subscripciones")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Subscripciones> getTodasSubscripciones(){
        return subscripcionesDao.getAll();
    }
    
    @POST
    @Path("/subscripciones")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean createSubscripcion(Subscripciones subscripcion){
        return subscripcionesDao.create(subscripcion);
    }
    
    @PUT
    @Path("/subscripciones")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean updateSubscripcion(Subscripciones subscripcion, Subscripciones updatedSubscripcion){
        return subscripcionesDao.update(subscripcion, updatedSubscripcion);
    }
    
    @DELETE
    @Path("/subscripciones")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteSubscripcion(Subscripciones subscripcion){
        return subscripcionesDao.delete(subscripcion);
    }
    
    @GET
    @Path("/subscripciones/tipos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<SubscripcionesTipos> getTodosTiposSubscripciones(){
        return subscripcionesDao.getTiposAll();
    }
    
    @POST
    @Path("/subscripciones/tipos")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean createTipoSubscripcion(SubscripcionesTipos tipo){
        return subscripcionesDao.createTipo(tipo);
    }
    
    @PUT
    @Path("/subscripciones/tipos")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean updateSubscripcion(SubscripcionesTipos tipo, SubscripcionesTipos updatedTipo){
        return subscripcionesDao.updateTipo(tipo, updatedTipo);
    }
    
    @DELETE
    @Path("/subscripciones/tipos")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteSubscripcion(SubscripcionesTipos tipo){
        return subscripcionesDao.deleteTipo(tipo);
    }
    
    //////// ---------------- Usuarios ---------------- ////////
    @GET
    @Path("/usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuarios> getTodosUsuarios(){
        return usuariosDao.getAll();
    }
    
    @POST
    @Path("/usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean createUsuario(Usuarios usuario){
        return usuariosDao.create(usuario);
    }
    
    @PUT
    @Path("/usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean updateUsuario(Usuarios usuario, Usuarios updatedUsuario){
        return usuariosDao.update(usuario, updatedUsuario);
    }
    
    @DELETE
    @Path("/usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteUsuario(Usuarios usuario){
        return usuariosDao.delete(usuario);
    }
    
    @GET
    @Path("/usuarios/tipos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<UsuariosTipos> getTodosTiposUsuarios(){
        return usuariosDao.getTiposAll();
    }
    
    @POST
    @Path("/usuarios/tipos")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean createTipoUsuario(UsuariosTipos tipo){
        return usuariosDao.createTipo(tipo);
    }
    
    @PUT
    @Path("/usuarios/tipo")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean updateTipoUsuario(UsuariosTipos tipo, UsuariosTipos updatedTipo){
        return usuariosDao.update(tipo, updatedTipo);
    }
    
    @DELETE
    @Path("/usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteTipoUsuario(UsuariosTipos tipo){
        return usuariosDao.deleteTipo(tipo);
    }
    
}
