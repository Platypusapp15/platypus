package model;
// Generated 13-mar-2016 20:56:27 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Consultas generated by hbm2java
 */
@XmlRootElement(name = "Consultas")
public class Consultas implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private ConsultasId id;
    private Restaurantes restaurantes;
    private Usuarios usuarios;
    private Date fecha;

    public Consultas() {
    }

    public Consultas(ConsultasId id, Restaurantes restaurantes, Usuarios usuarios, Date fecha) {
        this.id = id;
        this.restaurantes = restaurantes;
        this.usuarios = usuarios;
        this.fecha = fecha;
    }

    public ConsultasId getId() {
        return this.id;
    }

    public void setId(ConsultasId id) {
        this.id = id;
    }

    public Restaurantes getRestaurantes() {
        return this.restaurantes;
    }

    public void setRestaurantes(Restaurantes restaurantes) {
        this.restaurantes = restaurantes;
    }

    public Usuarios getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}