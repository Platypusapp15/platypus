/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.GregorianCalendar;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.City;
import model.Direcciones;
import model.Rangos;
import model.Restaurantes;
import model.RestaurantesTipos;
import model.SubscripcionesTipos;
import model.Usuarios;
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

    private Rangos rango1 = new Rangos("Principiante", 1);
    private Rangos rango2 = new Rangos("Entendido", 5);
    private Rangos rango3 = new Rangos("Avanzado", 10);

    private Direcciones direccion1 = null;
    private Direcciones direccion2 = null;
    private Direcciones direccion3 = null;

    private RestaurantesTipos tipoRest1 = new RestaurantesTipos("Bar-Restaurante");
    private RestaurantesTipos tipoRest2 = new RestaurantesTipos("Restaurante");
    private RestaurantesTipos tipoRest3 = new RestaurantesTipos("Bar-Copas");

    private SubscripcionesTipos tipoSubs1 = new SubscripcionesTipos("Simple", 30, 10.00F);
    private SubscripcionesTipos tipoSubs2 = new SubscripcionesTipos("Simple-Plus", 45, 13.00F);
    private SubscripcionesTipos tipoSubs3 = new SubscripcionesTipos("Simple-Gold", 60, 15.00F);

    private GregorianCalendar d1 = new GregorianCalendar(1991, 3, 20);
    private GregorianCalendar d2 = new GregorianCalendar(1964, 3, 27);
    private GregorianCalendar d3 = new GregorianCalendar(1991, 1, 30);

    private Usuarios usu1 = new Usuarios(direccion1, rango1, Defs.USUARIO_TIPO_ADMINISTRADOR, "seix@live.com", Utils.encriptarPassword("password"), "Iván", "Mesa", "Martín", "Hombre", d1.getTime(), 1F, 0, null, null, null, null, null, null, null);
    private Usuarios usu2 = new Usuarios(direccion2, rango2, Defs.USUARIO_TIPO_USUARIO, "pepe@live.com", Utils.encriptarPassword("password"), "Pepe", "Mesa", "Martín", "Hombre", d2.getTime(), 1F, 0, null, null, null, null, null, null, null);
    private Usuarios usu3 = new Usuarios(direccion3, rango1, Defs.USUARIO_TIPO_RESTAURANTE, "chef@live.com", Utils.encriptarPassword("password"), "Chef", "De", "Restaurante", "Mujer", d3.getTime(), 1F, 0, null, null, null, null, null, null, null);

    private Restaurantes rest1 = new Restaurantes(direccion2, tipoRest1, usu3, "Can Ramón", "Con terraza interior y 75 plazas", "canramon@gmail.com", 75, d3.getTime(), d3.getTime(), 934258712, null, null, null, null, null, null, null);
    private Restaurantes rest2 = new Restaurantes(direccion2, tipoRest2, usu3, "Picadero", "pepe", "picadero@gmail.com", 185, d3.getTime(), d3.getTime(), 934258777, null, null, null, null, null, null, null);
    private Restaurantes rest3 = new Restaurantes(direccion2, tipoRest3, usu3, "St Fost", "Con terraza exterior", "stfost@gmail.com", 150, d3.getTime(), d3.getTime(), 934258333, null, null, null, null, null, null, null);
    
    // TEST OK!
    @GET
    @Path("/database/test1")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean testDatabase() {
        boolean correcto = false;

        try {
            System.out.println("\nEjecutando pruebas CRUD...");
            crudRangos();
            crudDirecciones();
//            crudTiposUsuario(session);
            crudTiposRestaurante();
            crudTiposSubscripcion();
            correcto = true;

        } catch (Exception e) {
            System.out.println("\nUna operacion no se ha completado correctamente");
            correcto = false;
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
            crearDirecciones();
            session = sessionFactory.openSession();
            System.out.println("\nEjecutando pruebas usuarios...");
            session.beginTransaction();
            session.persist(direccion1);
            session.persist(direccion2);
            session.persist(direccion3);            
            session.persist(rango1);
            session.persist(rango2);
            session.persist(rango3);
            System.out.println("Creando usuario...");
            session.persist(usu1);
            session.getTransaction().commit();
            System.out.println("Editando usuario...");
            session.beginTransaction();
            Usuarios u = (Usuarios) session.get(Usuarios.class, usu1.getId());
            u.setNombre("Editado");
            u.setTipo("Editado");
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
            crearDirecciones();
            session = sessionFactory.openSession();
            System.out.println("\nEjecutando pruebas restaurantes...");
            session.beginTransaction();
            session.persist(direccion1);
            session.persist(direccion2);
            session.persist(direccion3);
            session.persist(rango1);
            session.persist(rango2);
            session.persist(rango3);
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
            crearDirecciones();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.persist(rango1);
            session.persist(rango2);
            session.persist(rango3);
            session.persist(direccion1);
            session.persist(direccion2);
            session.persist(direccion3);
            usu1.setDirecciones(direccion1);
            usu2.setDirecciones(direccion2);
            usu3.setDirecciones(direccion3);
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
            session.delete(usu1);
            session.delete(usu2);
            session.delete(usu3);
            session.delete(rango1);
            session.delete(rango2);
            session.delete(rango3);
            session.getTransaction().commit();
            text = "Tipos de usuario, Rangos, Direcciones y Usuarios de ejemplo eliminados correctamente " +
                   "en la base de datos.";
            
        } catch (Exception e) {
            System.out.println("Una operación no se ha completado correctamente");
            session.getTransaction().rollback();
            text = "No se ha podido completar la operación. Asegúrate de que uno o varios datos no hayan sido ya eliminados. ";
        } finally{
            session.close();
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
    
    
    private void crudRangos() {
        System.out.println("==================== Rangos ====================");
        int id = crearRango();
        leerRango(id);
        editarRango(id);
        leerRango(id);
        eliminarRango(id);
    }
    
    private void crudDirecciones() {
        System.out.println("==================== Direcciones ====================");
        int id = crearDireccion();
        leerDireccion(id);
        editarDireccion(id);
        leerDireccion(id);
        eliminarDireccion(id);
    }

    private void crudTiposRestaurante() {
        System.out.println("==================== Tipos restaurante ====================");
        int id = crearTipoRestaurante();
        leerTipoRestaurante(id);
        editarTipoRestaurante(id);
        leerTipoRestaurante(id);
        eliminarTipoRestaurante(id);
    }

    private void crudTiposSubscripcion() {
        System.out.println("==================== Tipos subscripcion ====================");
        int id = crearTipoSubscripcion();
        leerTipoSubscripcion(id);
        editarTipoSubscripcion(id);
        leerTipoSubscripcion(id);
        eliminarTipoSubscripcion(id);
    }

    private void leerRango(int id) {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            Rangos rango = (Rangos) session.get(Rangos.class, id);
            System.out.println("\n============\nRango:");
            System.out.println("Id: " + rango.getId() + "\nNombre: " + rango.getNombre());
            System.out.println("Puntos necesarios: " + rango.getPuntosNecesarios());
            System.out.println("============\n");
        } catch (Exception e) {
            System.out.println("Error al leer un rango:\n" + e.getMessage());
        } finally {
            session.close();
        }
    }

    private int crearRango() {
        int id = Defs.INVALID_RANGO_ID;
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            Rangos rango = new Rangos("Rango creado", 15);
            session.beginTransaction();
            session.persist(rango);
            session.getTransaction().commit();
            id = rango.getId();

        } catch (Exception e) {
            System.out.println("Error al crear un rango:\n" + e.getMessage());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }

        return id;
    }

    private void editarRango(int id) {
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Rangos rango = (Rangos) session.get(Rangos.class, id);
            rango.setNombre("Rango modificado");
            rango.setPuntosNecesarios(30);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al editar un rango:\n" + e.getMessage());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    private void eliminarRango(int id) {
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Rangos rango = (Rangos) session.get(Rangos.class, id);
            session.getTransaction().commit();
            session.beginTransaction();
            session.delete(rango);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al eliminar un rango:\n" + e.getMessage());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    private void leerDireccion(int id) {
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            Direcciones dir = (Direcciones) session.get(Direcciones.class, id);
            System.out.println("\n============\nDireccion:");
            System.out.println("Id: " + dir.getId() + "\nCalle: " + dir.getCalle());
            System.out.println("Ciudad: " + dir.getCity().getName()+ "\nPais: " + dir.getCity().getCountry().getName());
            System.out.println("============\n");
        } catch (Exception e) {
            System.out.println("Error al leer una direccion:\n" + e.getMessage());
        } finally {
            session.close();
        }
    }

    private int crearDireccion() {
        int id = Defs.INVALID_DIRECCION_ID;
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            City ci = (City) session.get(City.class, 1);
            Direcciones dir = new Direcciones(ci, "Barcelona", "08032");
            session.persist(dir);
            session.getTransaction().commit();
            id = dir.getId();

        } catch (Exception e) {
            System.out.println("Error al crear una direccion:\n" + e.getMessage());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }

        return id;
    }

    private void editarDireccion(int id) {
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            City ci = (City) session.get(City.class, 2);
            Direcciones dir = (Direcciones) session.get(Direcciones.class, id);
            dir.setCity(ci);
            dir.setPoblacion("Girona");
            dir.setCp("09782");
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al editar una direccion:\n" + e.getMessage());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    private void eliminarDireccion(int id) {
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Direcciones dir = (Direcciones) session.get(Direcciones.class, id);
            session.getTransaction().commit();
            session.beginTransaction();
            session.delete(dir);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al eliminar una direccion:\n" + e.getMessage());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    private void leerTipoRestaurante(int id) {
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            RestaurantesTipos tipo = (RestaurantesTipos) session.get(RestaurantesTipos.class, id);
            System.out.println("\n============\nTipo Restaurante:");
            System.out.println("Id: " + tipo.getId() + "\nNombre: " + tipo.getNombre());
            System.out.println("============\n");
        } catch (Exception e) {
            System.out.println("Error al leer un tipo de restaurante:\n" + e.getMessage());
        } finally {
            session.close();
        }
    }

    private int crearTipoRestaurante() {
        int id = 0;
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            RestaurantesTipos tipo = new RestaurantesTipos("Bar-Restaurante");
            session.beginTransaction();
            session.persist(tipo);
            session.getTransaction().commit();
            id = tipo.getId();

        } catch (Exception e) {
            System.out.println("Error al crear un tipo de restaurante:\n" + e.getMessage());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }

        return id;
    }

    private void editarTipoRestaurante(int id) {
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            RestaurantesTipos tipo = (RestaurantesTipos) session.get(RestaurantesTipos.class, id);
            tipo.setNombre("Cocktail");
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al editar un tipo de restaurante:\n" + e.getMessage());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    private void eliminarTipoRestaurante(int id) {
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            RestaurantesTipos tipo = (RestaurantesTipos) session.get(RestaurantesTipos.class, id);
            session.getTransaction().commit();
            session.beginTransaction();
            session.delete(tipo);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al eliminar un tipo de restaurante:\n" + e.getMessage());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    private void leerTipoSubscripcion(int id) {
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            SubscripcionesTipos tipo = (SubscripcionesTipos) session.get(SubscripcionesTipos.class, id);
            System.out.println("\n============\nTipo Subscripcion:");
            System.out.println("Id: " + tipo.getId() + "\nNombre: " + tipo.getNombre());
            System.out.println("============\n");
        } catch (Exception e) {
            System.out.println("Error al leer un tipo de subscripcion:\n" + e.getMessage());
        } finally {
            session.close();
        }
    }

    private int crearTipoSubscripcion() {
        int id = Defs.INVALID_SUBSCRIPCION_TIPO_ID;
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            SubscripcionesTipos tipo = new SubscripcionesTipos("Plus", 30, 9.99F);
            session.beginTransaction();
            session.persist(tipo);
            session.getTransaction().commit();
            id = tipo.getId();

        } catch (Exception e) {
            System.out.println("Error al crear un tipo de subscripcion:\n" + e.getMessage());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }

        return id;
    }

    private void editarTipoSubscripcion(int id) {
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            SubscripcionesTipos tipo = (SubscripcionesTipos) session.get(SubscripcionesTipos.class, id);
            tipo.setNombre("Advance");
            tipo.setPrecio(13.99F);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al editar un tipo de subscripcion:\n" + e.getMessage());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    private void eliminarTipoSubscripcion(int id) {
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            SubscripcionesTipos tipo = (SubscripcionesTipos) session.get(SubscripcionesTipos.class, id);
            session.getTransaction().commit();
            session.beginTransaction();
            session.delete(tipo);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Error al eliminar un tipo de subscripcion:\n" + e.getMessage());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }
    
    private void crearDirecciones(){
        Session session = null;
        
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            City c1 = (City) session.get(City.class, 1);
            City c2 = (City) session.get(City.class, 2);
            City c3 = (City) session.get(City.class, 3);
            session.getTransaction().commit();
            direccion1 = new Direcciones(c1, "Barcelona", "08032");
            direccion2 = new Direcciones(c2, "Girona", "08752");
            direccion3 = new Direcciones(c3, "Madrid", "02148");
            
        } catch (Exception e) {
            System.out.println("Error al crear una direccion:\n" + e.getMessage());
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }
}
