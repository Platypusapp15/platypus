/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.ReservasDao;
import java.util.GregorianCalendar;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Seix
 */
@Path("reservas")
public class ReservasService {
    
    private final ReservasDao reservasDao = new ReservasDao();
//    
//    @GET
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Reservas> getTodasReservas(){
//        return reservasDao.getAll();
//    }
//    
    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean crearReserva(@FormParam("idUsuario") int idUsuario,
                                @FormParam("idRestaurante") int idRestaurante,
                                @FormParam("year") int year,
                                @FormParam("month") int month,
                                @FormParam("day") int day,
                                @FormParam("numeroPersonas") int numeroPersonas){
        GregorianCalendar cal = new GregorianCalendar(year, month, day);
        return reservasDao.create(idUsuario, idRestaurante, cal.getTime(), numeroPersonas);
    }
    
//    @PUT
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean modificarReserva(Reservas reserva, Reservas updatedReserva){
//        return reservasDao.update(reserva, updatedReserva);
//    }
//    
//    @DELETE
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean eliminarReserva(Reservas reserva){
//        return reservasDao.delete(reserva);
//    }
}
