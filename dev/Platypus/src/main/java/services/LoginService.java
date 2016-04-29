/*
 */
package services;

import dao.UsuariosDao;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Usuarios;

/**
 *
 * 21-abr-2016
 *
 * @author Seix
 */
@Path("session")
public class LoginService {

    private final UsuariosDao usuariosDao = new UsuariosDao();

    @POST
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuarios login(@FormParam("email") String email,
            @FormParam("password") String password) {

        return usuariosDao.login(email, password);
    }
    
    @POST
    @Path("/logout")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean logout(@FormParam("email") String email){
        
        return usuariosDao.logout("email");
    }
}
