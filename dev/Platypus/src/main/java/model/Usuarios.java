package model;
// Generated 21-abr-2016 16:32:05 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Usuarios generated by hbm2java
 */
@XmlRootElement(name = "Usuarios")
public class Usuarios implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private Direcciones direcciones;
    private Rangos rangos;
    private UsuariosTipos usuariosTipos;
    private String email;
    private String password;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String sexo;
    private Date fechaNacimiento;
    private Float puntos;
    private int contadorLogins;
    private Date fechaUltimoLogin;
    private Set restaurantesLikeses = new HashSet(0);
    private Set comentarioses = new HashSet(0);
    private Set reservases = new HashSet(0);
    private Set comentariosLikeses = new HashSet(0);
    private Set restauranteses = new HashSet(0);
    private Set consultases = new HashSet(0);

    public Usuarios() {
    }

    public Usuarios(Rangos rangos, UsuariosTipos usuariosTipos, String email, String password, int contadorLogins) {
        this.rangos = rangos;
        this.usuariosTipos = usuariosTipos;
        this.email = email;
        this.password = password;
        this.contadorLogins = contadorLogins;
    }

    public Usuarios(Direcciones direcciones, Rangos rangos, UsuariosTipos usuariosTipos, String email, String password, String nombre, String apellido1, String apellido2, String sexo, Date fechaNacimiento, Float puntos, int contadorLogins, Date fechaUltimoLogin, Set restaurantesLikeses, Set comentarioses, Set reservases, Set comentariosLikeses, Set restauranteses, Set consultases) {
        this.direcciones = direcciones;
        this.rangos = rangos;
        this.usuariosTipos = usuariosTipos;
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.puntos = puntos;
        this.contadorLogins = contadorLogins;
        this.fechaUltimoLogin = fechaUltimoLogin;
        this.restaurantesLikeses = restaurantesLikeses;
        this.comentarioses = comentarioses;
        this.reservases = reservases;
        this.comentariosLikeses = comentariosLikeses;
        this.restauranteses = restauranteses;
        this.consultases = consultases;
    }

    @XmlElement
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlElement
    public Direcciones getDirecciones() {
        return this.direcciones;
    }

    public void setDirecciones(Direcciones direcciones) {
        this.direcciones = direcciones;
    }
    
    @XmlElement
    public Rangos getRangos() {
        return this.rangos;
    }

    public void setRangos(Rangos rangos) {
        this.rangos = rangos;
    }

    @XmlElement
    public UsuariosTipos getUsuariosTipos() {
        return this.usuariosTipos;
    }

    public void setUsuariosTipos(UsuariosTipos usuariosTipos) {
        this.usuariosTipos = usuariosTipos;
    }

    @XmlElement
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlElement
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlElement
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlElement
    public String getApellido1() {
        return this.apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    @XmlElement
    public String getApellido2() {
        return this.apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @XmlElement
    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @XmlElement
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @XmlElement
    public Float getPuntos() {
        return this.puntos;
    }

    public void setPuntos(Float puntos) {
        this.puntos = puntos;
    }

    @XmlElement
    public int getContadorLogins() {
        return this.contadorLogins;
    }

    public void setContadorLogins(int contadorLogins) {
        this.contadorLogins = contadorLogins;
    }

    @XmlElement
    public Date getFechaUltimoLogin() {
        return this.fechaUltimoLogin;
    }

    public void setFechaUltimoLogin(Date fechaUltimoLogin) {
        this.fechaUltimoLogin = fechaUltimoLogin;
    }

    public Set getRestaurantesLikeses() {
        return this.restaurantesLikeses;
    }

    public void setRestaurantesLikeses(Set restaurantesLikeses) {
        this.restaurantesLikeses = restaurantesLikeses;
    }

    public Set getComentarioses() {
        return this.comentarioses;
    }

    public void setComentarioses(Set comentarioses) {
        this.comentarioses = comentarioses;
    }

    public Set getReservases() {
        return this.reservases;
    }

    public void setReservases(Set reservases) {
        this.reservases = reservases;
    }

    public Set getComentariosLikeses() {
        return this.comentariosLikeses;
    }

    public void setComentariosLikeses(Set comentariosLikeses) {
        this.comentariosLikeses = comentariosLikeses;
    }

    public Set getRestauranteses() {
        return this.restauranteses;
    }

    public void setRestauranteses(Set restauranteses) {
        this.restauranteses = restauranteses;
    }

    public Set getConsultases() {
        return this.consultases;
    }

    public void setConsultases(Set consultases) {
        this.consultases = consultases;
    }

}
