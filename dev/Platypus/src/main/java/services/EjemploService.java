package services;

import dao.EjemplosDao;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Usuarios;

/**
 *
 * @author Seix
 */

//Path del servicio:  "http://... .../EjemploService"
//Path para una función concreta del servicio: "http://... .../EjemploService/[Path de la función]
@Path("EjemploService")
public class EjemploService {
    
    private final EjemplosDao ejemplosDao = new EjemplosDao();
    
    // Principalmente hay 4 verbos: GET, POST, PUT, DELETE
    // No podemos repetir un verbo para un mismo Path 
    
    @GET //Verbo para funciones/métodos para obtener datos
    @Path("/ejemplo") //Equivale a "http://... .../EjemploService/ejemplo
    @Produces(MediaType.APPLICATION_JSON) //Cómo devolverá los datos, en este caso JSON
    public List<Usuarios> obtener(){
        return ejemplosDao.sinParametros();
    }
    
    @POST //Verbo para funciones/métodos para modificar datos
    @Path("/ejemplo")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean modificar(Usuarios usuario, Usuarios usuarioActualizado){
        return false;
    }
    @PUT //Verbo para funciones/métodos para crear/guardar datos
    @Path("/ejemplo")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean crear(Usuarios usuario){
        return false;
    }
    @DELETE //Verbo para funciones/métodos para eliminar datos
    @Path("/ejemplo")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean eliminar(int id){
        return false;
    }
    
    // ------------- A tener en cuenta --------------- //
    
    // Aunque la función tiene diferente nombre, la llamada no deja de ser al mismo Path,
    // el programa no sabrá a dónde ir
    @GET 
    @Path("/ejemplo") 
    @Produces(MediaType.APPLICATION_JSON) 
    public List<Usuarios> obtenerTodos(){
        return ejemplosDao.sinParametros();
    }
    
    // Aunque la función tiene diferente nombre, la llamada no deja de ser al mismo Path,
    // el programa no sabrá a dónde ir
    @GET 
    @Path("/ejemplo") 
    @Produces(MediaType.APPLICATION_JSON) 
    public List<Usuarios> obtenerAdministradoresINCORRECTO(){
        return ejemplosDao.sinParametros();
    }
    
    // Solución
    // Añadimos otro apartado para una opción más específica
    @GET 
    @Path("/ejemplo/administradores") 
    @Produces(MediaType.APPLICATION_JSON) 
    public List<Usuarios> obtenerAdministradoresCORRECTO(){
        return ejemplosDao.sinParametros();
    }
    
}
