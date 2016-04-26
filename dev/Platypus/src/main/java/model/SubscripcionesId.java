package model;
// Generated 21-abr-2016 16:32:05 by Hibernate Tools 4.3.1



/**
 * SubscripcionesId generated by hbm2java
 */
public class SubscripcionesId  implements java.io.Serializable {


     private int idRestaurante;
     private int idTipoSubscripcion;

    public SubscripcionesId() {
    }

    public SubscripcionesId(int idRestaurante, int idTipoSubscripcion) {
       this.idRestaurante = idRestaurante;
       this.idTipoSubscripcion = idTipoSubscripcion;
    }
   
    public int getIdRestaurante() {
        return this.idRestaurante;
    }
    
    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }
    public int getIdTipoSubscripcion() {
        return this.idTipoSubscripcion;
    }
    
    public void setIdTipoSubscripcion(int idTipoSubscripcion) {
        this.idTipoSubscripcion = idTipoSubscripcion;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SubscripcionesId) ) return false;
		 SubscripcionesId castOther = ( SubscripcionesId ) other; 
         
		 return (this.getIdRestaurante()==castOther.getIdRestaurante())
 && (this.getIdTipoSubscripcion()==castOther.getIdTipoSubscripcion());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdRestaurante();
         result = 37 * result + this.getIdTipoSubscripcion();
         return result;
   }   


}


