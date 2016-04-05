package model;
// Generated 13-mar-2016 20:56:27 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ReservasId generated by hbm2java
 */
@XmlRootElement(name = "ReservasId")
public class ReservasId implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int idUsuario;
    private int idRestaurante;
    private Date fecha;

    public ReservasId() {
    }

    public ReservasId(int idUsuario, int idRestaurante, Date fecha) {
        this.idUsuario = idUsuario;
        this.idRestaurante = idRestaurante;
        this.fecha = fecha;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRestaurante() {
        return this.idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof ReservasId)) {
            return false;
        }
        ReservasId castOther = (ReservasId) other;

        return (this.getIdUsuario() == castOther.getIdUsuario())
                && (this.getIdRestaurante() == castOther.getIdRestaurante())
                && ((this.getFecha() == castOther.getFecha()) || (this.getFecha() != null && castOther.getFecha() != null && this.getFecha().equals(castOther.getFecha())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getIdUsuario();
        result = 37 * result + this.getIdRestaurante();
        result = 37 * result + (getFecha() == null ? 0 : this.getFecha().hashCode());
        return result;
    }

}
