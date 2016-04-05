package model;
// Generated 13-mar-2016 20:56:27 by Hibernate Tools 4.3.1

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Rangos generated by hbm2java
 */
@XmlRootElement(name = "Rangos")
public class Rangos implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Usuarios usuarios;
    private String nombre;
    private int puntosNecesarios;

    public Rangos() {
    }

    public Rangos(Usuarios usuarios, String nombre, int puntosNecesarios) {
        this.usuarios = usuarios;
        this.nombre = nombre;
        this.puntosNecesarios = puntosNecesarios;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuarios getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosNecesarios() {
        return this.puntosNecesarios;
    }

    public void setPuntosNecesarios(int puntosNecesarios) {
        this.puntosNecesarios = puntosNecesarios;
    }

}
