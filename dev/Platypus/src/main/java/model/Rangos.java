package model;
// Generated 11-may-2016 12:59:30 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Rangos generated by hbm2java
 */
@JsonIgnoreProperties(value = {"id", "usuarioses"})
public class Rangos  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private int puntosNecesarios;
     private Set usuarioses = new HashSet(0);

    public Rangos() {
    }

	
    public Rangos(String nombre, int puntosNecesarios) {
        this.nombre = nombre;
        this.puntosNecesarios = puntosNecesarios;
    }
    public Rangos(String nombre, int puntosNecesarios, Set usuarioses) {
       this.nombre = nombre;
       this.puntosNecesarios = puntosNecesarios;
       this.usuarioses = usuarioses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
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
    public Set getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set usuarioses) {
        this.usuarioses = usuarioses;
    }




}


