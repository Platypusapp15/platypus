package model;
// Generated 21-abr-2016 16:32:05 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Subscripciones generated by hbm2java
 */
@XmlRootElement(name = "Subscripciones")
public class Subscripciones implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

     private SubscripcionesId id;
     private Restaurantes restaurantes;
     private SubscripcionesTipos subscripcionesTipos;
     private Date fechaInicio;
     private Date fechaFinal;
     private boolean activa;

    public Subscripciones() {
    }

    public Subscripciones(SubscripcionesId id, Restaurantes restaurantes, SubscripcionesTipos subscripcionesTipos, Date fechaInicio, Date fechaFinal, boolean activa) {
       this.id = id;
       this.restaurantes = restaurantes;
       this.subscripcionesTipos = subscripcionesTipos;
       this.fechaInicio = fechaInicio;
       this.fechaFinal = fechaFinal;
       this.activa = activa;
    }
   
    public SubscripcionesId getId() {
        return this.id;
    }
    
    public void setId(SubscripcionesId id) {
        this.id = id;
    }
    public Restaurantes getRestaurantes() {
        return this.restaurantes;
    }
    
    public void setRestaurantes(Restaurantes restaurantes) {
        this.restaurantes = restaurantes;
    }

    public SubscripcionesTipos getSubscripcionesTipos() {
        return this.subscripcionesTipos;
    }
    
    public void setSubscripcionesTipos(SubscripcionesTipos subscripcionesTipos) {
        this.subscripcionesTipos = subscripcionesTipos;
    }

    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return this.fechaFinal;
    }
    
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public boolean isActiva() {
        return this.activa;
    }
    
    public void setActiva(boolean activa) {
        this.activa = activa;
    }

}
