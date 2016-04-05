/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.ConsultasDao;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Consultas;

/**
 *
 * @author Seix
 */
@Path("consultas")
public class ConsultasService {
    
//    private final ConsultasDao consultasDao = new ConsultasDao();
//    
//    @GET
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Consultas> getTodasConsultas(){
//        return consultasDao.getAll();
//    }
//    
//    @POST
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean crearConsulta(Consultas consulta){
//        return consultasDao.create(consulta);
//    }
//    
//    @PUT
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean modificarConsulta(Consultas consulta, Consultas updatedConsulta){
//        return consultasDao.update(consulta, updatedConsulta);
//    }
//    
//    @DELETE
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean eliminarConsulta(Consultas consulta){
//        return consultasDao.delete(consulta);
//    }
}
