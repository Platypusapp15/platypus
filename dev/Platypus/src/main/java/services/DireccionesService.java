/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.DireccionesDao;
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
@Path("direcciones")
public class DireccionesService {

    private final DireccionesDao direccionesDao = new DireccionesDao();
//    
//    @GET
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Direcciones> getTodasDirecciones(){
//        return direccionesDao.getAll();
//    }
//        

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean crearDireccion(@FormParam("calle") String calle,
            @FormParam("numero") int numero,
            @FormParam("idCiudad") int idCiudad,
            @FormParam("poblacion") String poblacion,
            @FormParam("codigoPostal") String codigoPostal) {

        return direccionesDao.create(calle, numero, idCiudad, poblacion, codigoPostal);
    }

    @PUT
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean modificarDireccion(@FormParam("id") int id,
            @FormParam("calle") String calle,
            @FormParam("numero") int numero,
            @FormParam("idCiudad") int idCiudad,
            @FormParam("poblacion") String poblacion,
            @FormParam("codigoPostal") String codigoPostal) {

        return direccionesDao.update(id, calle, numero, idCiudad, poblacion, codigoPostal);
    }
//        
//    @DELETE
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean eliminarDireccion(Direcciones direccion){
//        return direccionesDao.delete(direccion);
//    }

    @POST
    @Path("/ciudad")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean crearCiudad(@FormParam("nombre") String nombre,
            @FormParam("codPais") String codPais,
            @FormParam("region") String region) {

        return direccionesDao.createCity(nombre, codPais, region);
    }
}
