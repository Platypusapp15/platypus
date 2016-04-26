/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Date;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Direcciones;
import model.Rangos;
import model.Restaurantes;
import model.RestaurantesTipos;
import model.SubscripcionesTipos;
import model.Usuarios;
import model.UsuariosTipos;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.Defs;
import util.HibernateUtil;
import util.Utils;

/**
 *
 * @author Seix
 */
@Path("TestService")
public class TestService {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private UsuariosTipos tipoUsu1 = new UsuariosTipos("Administrador");
    private UsuariosTipos tipoUsu2 = new UsuariosTipos("Usuario");
    private UsuariosTipos tipoUsu3 = new UsuariosTipos("Restaurante");

    private Rangos rango1 = new Rangos("Principiante", 1);
    private Rangos rango2 = new Rangos("Entendido", 5);
    private Rangos rango3 = new Rangos("Avanzado", 10);

    private Direcciones direccion1 = new Direcciones("Barcelona", "Barcelona", "08032", "España");
    private Direcciones direccion2 = new Direcciones("Mataro", "Barcelona", "08932", "España");
    private Direcciones direccion3 = new Direcciones("Gerona", "Gerona", "09532", "España");

    private RestaurantesTipos tipoRest1 = new RestaurantesTipos(1, "Bar-Restaurante");
    private RestaurantesTipos tipoRest2 = new RestaurantesTipos(2, "Restaurante");
    private RestaurantesTipos tipoRest3 = new RestaurantesTipos(3, "Bar-Copas");

    private SubscripcionesTipos tipoSubs1 = new SubscripcionesTipos(1, "Simple", 30, 10.00F);
    private SubscripcionesTipos tipoSubs2 = new SubscripcionesTipos(2, "Simple-Plus", 45, 13.00F);
    private SubscripcionesTipos tipoSubs3 = new SubscripcionesTipos(3, "Simple-Gold", 60, 15.00F);

    private Date d1 = new Date(1991, 3, 20);
    private Date d2 = new Date(1964, 3, 27);
    private Date d3 = new Date(1991, 1, 30);

    private Usuarios usu1 = new Usuarios(direccion1, rango1, tipoUsu1, "seix@live.com", Utils.encriptarPassword("password"), "Iván", "Mesa", "Martín", "Hombre", d1, 1F, 0, null, null, null, null, null, null, null);
    private Usuarios usu2 = new Usuarios(direccion2, rango2, tipoUsu2, "pepe@live.com", Utils.encriptarPassword("password"), "Pepe", "Mesa", "Martín", "Hombre", d2, 1F, 0, null, null, null, null, null, null, null);
    private Usuarios usu3 = new Usuarios(direccion3, rango1, tipoUsu3, "chef@live.com", Utils.encriptarPassword("password"), "Chef", "De", "Restaurante", "Mujer", d3, 1F, 0, null, null, null, null, null, null, null);

    private Restaurantes rest1 = new Restaurantes(direccion2, tipoRest1, usu3, "Can Ramón", "Con terraza interior y 75 plazas", "canramon@gmail.com", 75, d3, d3, 934258712, null, null, null, null, null);
    private Restaurantes rest2 = new Restaurantes(direccion2, tipoRest2, usu3, "Picadero", "pepe", "picadero@gmail.com", 185, d3, d3, 934258777, null, null, null, null, null);
    private Restaurantes rest3 = new Restaurantes(direccion2, tipoRest3, usu3, "St Fost", "Con terraza exterior", "stfost@gmail.com", 150, d3, d3, 934258333, null, null, null, null, null);

    // TEST OK!
    @GET
    @Path("/database/test1")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean testDatabase() {
        Session session = null;
        boolean correcto = false;

        try {
            session = sessionFactory.openSession();
            System.out.println("\nEjecutando pruebas CRUD...");
            crudRangos(session);
            crudDirecciones(session);
            crudTiposUsuario(session);
            crudTiposRestaurante(session);
            crudTiposSubscripcion(session);
            correcto = true;

        } catch (Exception e) {
            System.out.println("\nUna operacion no se ha completado correctamente");
            correcto = false;
            session.close();
        }

        return correcto;
    }
    
    // TEST OK!
    @GET
    @Path("/database/usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean testDatabaseUsuario() {
        Session session = null;
        boolean correcto = false;

        try {
            session = sessionFactory.openSession();
            System.out.println("\nEjecutando pruebas usuarios...");
            session.beginTransaction();
            session.persist(direccion1);
            session.persist(direccion2);
            session.persist(direccion3);
            session.persist(rango1);
            session.persist(rango2);
            session.persist(rango3);
            session.persist(tipoUsu1);
            session.persist(tipoUsu2);
            session.persist(tipoUsu3);
            System.out.println("Creando usuario...");
            session.persist(usu1);
            session.getTransaction().commit();
            System.out.println("Editando usuario...");
            session.beginTransaction();
            Usuarios u = (Usuarios) session.get(Usuarios.class, usu1.getId());
            UsuariosTipos t = (UsuariosTipos) session.get(UsuariosTipos.class, tipoUsu2.getId());
            u.setNombre("Editado");
            u.setUsuariosTipos(t);
            session.getTransaction().commit();
            session.beginTransaction();
            session.delete(u);
            session.getTransaction().commit();
            correcto = true;

        } catch (Exception e) {
            System.out.println("\nUna operacion no se ha completado correctamente");
            session.getTransaction().rollback();
            session.close();
            correcto = false;
        }

        return correcto;
    }
    
    // TEST OK!
    @GET
    @Path("/database/restaurantes")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean testDatabaseRestaurante() {
        Session session = null;
        boolean correcto = false;

        try {
            session = sessionFactory.openSession();
            System.out.println("\nEjecutando pruebas restaurantes...");
            session.beginTransaction();
            session.persist(direccion1);
            session.persist(direccion2);
            session.persist(direccion3);
            session.persist(rango1);
            session.persist(rango2);
            session.persist(rango3);
            session.persist(tipoUsu1);
            session.persist(tipoUsu2);
            session.persist(tipoUsu3);
            session.getTransaction().commit();
            System.out.println("Creando usuario...");
            session.beginTransaction();
            session.persist(usu3);
            session.getTransaction().commit();
            session.beginTransaction();
            System.out.println("Creanto restaurante...");
            session.persist(tipoRest1);
            session.persist(tipoRest2);
            session.persist(tipoRest3);
            //rest1.setUsuarios(usu1);
            session.persist(rest1);
            session.getTransaction().commit();
            System.out.println("Editando restaurante...");
            session.beginTransaction();
            Restaurantes r = (Restaurantes) session.get(Restaurantes.class, rest1.getId());
            RestaurantesTipos t = (RestaurantesTipos) session.get(RestaurantesTipos.class, tipoRest2.getId());
            r.setNombre("Editado");
            r.setRestaurantesTipos(t);
            session.getTransaction().commit();
            session.beginTransaction();
            session.delete(r);
            session.getTransaction().commit();
            correcto = true;

        } catch (Exception e) {
            System.out.println("\nUna operacion no se ha completado correctamente");
            session.getTransaction().rollback();
            session.close();
            correcto = false;
        }

        return correcto;
    }

    
    @POST
    @Path("/database/usuariosEjemplo")
    @Produces(MediaType.TEXT_PLAIN)
    public String altaUsuariosEjemplo(){
        
        Session session = null;
        String text = "";
        
        try {
            
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.persist(tipoUsu1);
            session.persist(tipoUsu2);
            session.persist(tipoUsu3);
            session.persist(rango1);
            session.persist(rango2);
            session.persist(rango3);
            session.persist(direccion1);
            session.persist(direccion2);
            session.persist(direccion3);
            session.persist(usu1);
            session.persist(usu2);
            session.persist(usu3);
            session.getTransaction().commit();
            text = "Tipos de usuario, Rangos, Direcciones y Usuarios de ejemplo cargados correctamente " +
                    "en la base de datos.";
            
        } catch (Exception e) {
            System.out.println("Una operación no se ha completado correctamente");
            session.getTransaction().rollback();
            text = "No se ha podido completar la operación. Asegúrate de que no existan datos en la base " +
                   "de datos y/o no haya valores duplicados.";
        }
        
        return text;
    }
    
    @DELETE
    @Path("/database/usuariosEjemplo")
    @Produces(MediaType.TEXT_PLAIN)
    public String bajaUsuariosEjemplo(){
        Session session = null;
        String text = "";
        
        try {
            
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(tipoUsu1);
            session.delete(tipoUsu2);
            session.delete(tipoUsu3);
            session.delete(rango1);
            session.delete(rango2);
            session.delete(rango3);
            session.delete(direccion1);
            session.delete(direccion2);
            session.delete(direccion3);
            session.delete(usu1);
            session.delete(usu2);
            session.delete(usu3);
            session.getTransaction().commit();
            text = "Tipos de usuario, Rangos, Direcciones y Usuarios de ejemplo eliminados correctamente " +
                   "en la base de datos.";
            
        } catch (Exception e) {
            System.out.println("Una operación no se ha completado correctamente");
            session.getTransaction().rollback();
            text = "No se ha podido completar la operación. Asegúrate de que uno o varios datos no hayan sido ya eliminados. ";
        }
        
        return text;
    }
    
    @GET
    @Path("/core/encode/{text}")
    @Produces(MediaType.APPLICATION_XHTML_XML)
    public String testEncoding(@PathParam("text") String text){
        String resultado = "";
        String codificado = Utils.encriptarPassword(text);
        
        resultado = "<html><body>";
        resultado += "<br/>Introducido: " + text + " <br/>";
        resultado += "Codificado: " + codificado + " <br/>";
        resultado += "Longitud: " + codificado.length() + " <br/>";
        resultado += "</body></html>";
        
        return resultado;
    }
    
    
    private void crudRangos(Session session) {
        System.out.println("==================== Rangos ====================");
        int id = crearRango(session);
        leerRango(session, id);
        editarRango(session, id);
        leerRango(session, id);
        eliminarRango(session, id);
    }
    
    private void crudDirecciones(Session session) {
        System.out.println("==================== Direcciones ====================");
        int id = crearDireccion(session);
        leerDireccion(session, id);
        editarDireccion(session, id);
        leerDireccion(session, id);
        eliminarDireccion(session, id);
    }

    private void crudTiposUsuario(Session session) {
        System.out.println("==================== Tipos usuarios ====================");
        int id = crearTipoUsuario(session);
        leerTipoUsuario(session, id);
        editarTipoUsuario(session, id);
        leerTipoUsuario(session, id);
        eliminarTipoUsuario(session, id);
    }

    private void crudTiposRestaurante(Session session) {
        System.out.println("==================== Tipos restaurante ====================");
        int id = crearTipoRestaurante(session);
        leerTipoRestaurante(session, id);
        editarTipoRestaurante(session, id);
        leerTipoRestaurante(session, id);
        eliminarTipoRestaurante(session, id);
    }

    private void crudTiposSubscripcion(Session session) {
        System.out.println("==================== Tipos subscripcion ====================");
        int id = crearTipoSubscripcion(session);
        leerTipoSubscripcion(session, id);
        editarTipoSubscripcion(session, id);
        leerTipoSubscripcion(session, id);
        eliminarTipoSubscripcion(session, id);
    }

    private void leerRango(Session session, int id) {
        try {
            session.getSessionFactory().openSession();
            Rangos rango = (Rangos) session.get(Rangos.class, id);
            System.out.println("\n============\nRango:");
            System.out.println("Id: " + rango.getId() + "\nNombre: " + rango.getNombre());
            System.out.println("Puntos necesarios: " + rango.getPuntosNecesarios());
            System.out.println("============\n");
        } catch (Exception e) {
            System.out.println("Error al leer un rango:\n" + e.getMessage());
        }
    }

    private int crearRango(Session session) {
        int id = Defs.INVALID_RANGO_ID;

        try {
            session.getSessionFactory().openSession();
            Rangos rango = new Rangos("Rango creado", 15);
            session.beginTransaction();
            session.persist(rango);
            session.getTransaction().commit();
            id = rango.getId();

        } catch (Exception e) {
            System.out.println("Error al crear un rango:\n" + e.getMessage());
            session.getTransaction().rollback();
        }

        return id;
    }

    private void editarRango(Session session, int id) {
        try {
            session.getSessionFactory().openSession();
            session.beginTransaction();
            Rangos rango = (Rangos) session.get(Rangos.class, id);
            rango.setNombre("Rango modificado");
            rango.setPuntosNecesarios(30);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al editar un rango:\n" + e.getMessage());
            session.getTransaction().rollback();
        }
    }

    private void eliminarRango(Session session, int id) {
        try {
            session.getSessionFactory().openSession();
            session.beginTransaction();
            Rangos rango = (Rangos) session.get(Rangos.class, id);
            session.delete(rango);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al eliminar un rango:\n" + e.getMessage());
            session.getTransaction().rollback();
        }
    }

    private void leerDireccion(Session session, int id) {
        try {
            session.getSessionFactory().openSession();
            Direcciones dir = (Direcciones) session.get(Direcciones.class, id);
            System.out.println("\n============\nDireccion:");
            System.out.println("Id: " + dir.getId() + "\nCalle: " + dir.getCalle());
            System.out.println("Ciudad: " + dir.getCiudad() + "\nPais: " + dir.getPais());
            System.out.println("============\n");
        } catch (Exception e) {
            System.out.println("Error al leer una direccion:\n" + e.getMessage());
        }
    }

    private int crearDireccion(Session session) {
        int id = Defs.INVALID_DIRECCION_ID;
        try {
            session.getSessionFactory().openSession();
            Direcciones dir = new Direcciones("Barcelona", "Barcelona", "08002", "EspaÃ±a");
            session.beginTransaction();
            session.persist(dir);
            session.getTransaction().commit();
            id = dir.getId();

        } catch (Exception e) {
            System.out.println("Error al crear una direccion:\n" + e.getMessage());
            session.getTransaction().rollback();
        }

        return id;
    }

    private void editarDireccion(Session session, int id) {
        try {
            session.getSessionFactory().openSession();
            session.beginTransaction();
            Direcciones dir = (Direcciones) session.get(Direcciones.class, id);
            dir.setCiudad("Girona");
            dir.setProvincia("Girona");
            dir.setCp("09782");
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al editar una direccion:\n" + e.getMessage());
            session.getTransaction().rollback();
        }
    }

    private void eliminarDireccion(Session session, int id) {
        try {
            session.getSessionFactory().openSession();
            session.beginTransaction();
            Direcciones dir = (Direcciones) session.get(Direcciones.class, id);
            session.delete(dir);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al eliminar una direccion:\n" + e.getMessage());
            session.getTransaction().rollback();
        }
    }

    private void leerTipoUsuario(Session session, int id) {
        try {
            session.getSessionFactory().openSession();
            UsuariosTipos tipo = (UsuariosTipos) session.get(UsuariosTipos.class, id);
            System.out.println("\n============\nTipo Usuario:");
            System.out.println("Id: " + tipo.getId() + "\nNombre: " + tipo.getNombre());
            System.out.println("============\n");
        } catch (Exception e) {
            System.out.println("Error al leer un tipo de usuario:\n" + e.getMessage());
        }
    }

    private int crearTipoUsuario(Session session) {
        int id = Defs.INVALID_USUARIO_TIPO_ID;
        try {
            session.getSessionFactory().openSession();
            UsuariosTipos tipo = new UsuariosTipos("Visitante");
            session.beginTransaction();
            session.persist(tipo);
            session.getTransaction().commit();
            id = tipo.getId();

        } catch (Exception e) {
            System.out.println("Error al crear un tipo de usuario:\n" + e.getMessage());
            session.getTransaction().rollback();
        }

        return id;
    }

    private void editarTipoUsuario(Session session, int id) {
        try {
            session.getSessionFactory().openSession();
            session.beginTransaction();
            UsuariosTipos tipo = (UsuariosTipos) session.get(UsuariosTipos.class, id);
            tipo.setNombre("Administrador");
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al editar un tipo de usuario:\n" + e.getMessage());
            session.getTransaction().rollback();
        }
    }

    private void eliminarTipoUsuario(Session session, int id) {
        try {
            session.getSessionFactory().openSession();
            session.beginTransaction();
            UsuariosTipos tipo = (UsuariosTipos) session.get(UsuariosTipos.class, id);
            session.delete(tipo);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al eliminar un tipo de usuario:\n" + e.getMessage());
            session.getTransaction().rollback();
        }
    }

    private void leerTipoRestaurante(Session session, int id) {
        try {
            session.getSessionFactory().openSession();
            RestaurantesTipos tipo = (RestaurantesTipos) session.get(RestaurantesTipos.class, id);
            System.out.println("\n============\nTipo Restaurante:");
            System.out.println("Id: " + tipo.getId() + "\nNombre: " + tipo.getNombre());
            System.out.println("============\n");
        } catch (Exception e) {
            System.out.println("Error al leer un tipo de restaurante:\n" + e.getMessage());
        }
    }

    private int crearTipoRestaurante(Session session) {
        int id = 0;
        try {
            session.getSessionFactory().openSession();
            RestaurantesTipos tipo = new RestaurantesTipos(1,"Bar-Restaurante");
            session.beginTransaction();
            session.persist(tipo);
            session.getTransaction().commit();
            id = tipo.getId();

        } catch (Exception e) {
            System.out.println("Error al crear un tipo de restaurante:\n" + e.getMessage());
            session.getTransaction().rollback();
        }

        return id;
    }

    private void editarTipoRestaurante(Session session, int id) {
        try {
            session.getSessionFactory().openSession();
            session.beginTransaction();
            RestaurantesTipos tipo = (RestaurantesTipos) session.get(RestaurantesTipos.class, id);
            tipo.setNombre("Cocktail");
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al editar un tipo de restaurante:\n" + e.getMessage());
            session.getTransaction().rollback();
        }
    }

    private void eliminarTipoRestaurante(Session session, int id) {
        try {
            session.getSessionFactory().openSession();
            session.beginTransaction();
            RestaurantesTipos tipo = (RestaurantesTipos) session.get(RestaurantesTipos.class, id);
            session.delete(tipo);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al eliminar un tipo de restaurante:\n" + e.getMessage());
            session.getTransaction().rollback();
        }
    }

    private void leerTipoSubscripcion(Session session, int id) {
        try {
            session.getSessionFactory().openSession();
            SubscripcionesTipos tipo = (SubscripcionesTipos) session.get(SubscripcionesTipos.class, id);
            System.out.println("\n============\nTipo Subscripcion:");
            System.out.println("Id: " + tipo.getId() + "\nNombre: " + tipo.getNombre());
            System.out.println("============\n");
        } catch (Exception e) {
            System.out.println("Error al leer un tipo de subscripcion:\n" + e.getMessage());
        }
    }

    private int crearTipoSubscripcion(Session session) {
        int id = Defs.INVALID_SUBSCRIPCION_TIPO_ID;
        try {
            session.getSessionFactory().openSession();
            SubscripcionesTipos tipo = new SubscripcionesTipos(1,"Plus", 30, 9.99F);
            session.beginTransaction();
            session.persist(tipo);
            session.getTransaction().commit();
            id = tipo.getId();

        } catch (Exception e) {
            System.out.println("Error al crear un tipo de subscripcion:\n" + e.getMessage());
            session.getTransaction().rollback();
        }

        return id;
    }

    private void editarTipoSubscripcion(Session session, int id) {
        try {
            session.getSessionFactory().openSession();
            session.beginTransaction();
            SubscripcionesTipos tipo = (SubscripcionesTipos) session.get(SubscripcionesTipos.class, id);
            tipo.setNombre("Advance");
            tipo.setPrecio(13.99F);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al editar un tipo de subscripcion:\n" + e.getMessage());
            session.getTransaction().rollback();
        }
    }

    private void eliminarTipoSubscripcion(Session session, int id) {
        try {
            session.getSessionFactory().openSession();
            session.beginTransaction();
            SubscripcionesTipos tipo = (SubscripcionesTipos) session.get(SubscripcionesTipos.class, id);
            session.delete(tipo);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al eliminar un tipo de subscripcion:\n" + e.getMessage());
            session.getTransaction().rollback();
        }
    }

}
