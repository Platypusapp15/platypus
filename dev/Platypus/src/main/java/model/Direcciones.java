package model;
// Generated 05-may-2016 12:10:04 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Direcciones generated by hbm2java
 */
public class Direcciones  implements java.io.Serializable {


     private Integer id;
     private City city;
     private String calle;
     private String numero;
     private String provincia;
     private String cp;
     private Set restauranteses = new HashSet(0);
     private Set usuarioses = new HashSet(0);

    public Direcciones() {
    }

	
    public Direcciones(City city, String provincia, String cp) {
        this.city = city;
        this.provincia = provincia;
        this.cp = cp;
    }
    public Direcciones(City city, String calle, String numero, String provincia, String cp, Set restauranteses, Set usuarioses) {
       this.city = city;
       this.calle = calle;
       this.numero = numero;
       this.provincia = provincia;
       this.cp = cp;
       this.restauranteses = restauranteses;
       this.usuarioses = usuarioses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public City getCity() {
        return this.city;
    }
    
    public void setCity(City city) {
        this.city = city;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getCp() {
        return this.cp;
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }
    public Set getRestauranteses() {
        return this.restauranteses;
    }
    
    public void setRestauranteses(Set restauranteses) {
        this.restauranteses = restauranteses;
    }
    public Set getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set usuarioses) {
        this.usuarioses = usuarioses;
    }




}


