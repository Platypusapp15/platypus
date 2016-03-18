package model;
// Generated 13-mar-2016 20:56:27 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Comentarios generated by hbm2java
 */
@XmlRootElement(name = "Comentarios")
public class Comentarios implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Comentarios comentarios;
    private Restaurantes restaurantes;
    private Usuarios usuarios;
    private String comentario;
    private Date fechaHora;
    private Set comentarioses = new HashSet(0);
    private Set comentariosLikeses = new HashSet(0);

    public Comentarios() {
    }

    public Comentarios(Restaurantes restaurantes, Usuarios usuarios, Date fechaHora) {
        this.restaurantes = restaurantes;
        this.usuarios = usuarios;
        this.fechaHora = fechaHora;
    }

    public Comentarios(Comentarios comentarios, Restaurantes restaurantes, Usuarios usuarios, String comentario, Date fechaHora, Set comentarioses, Set comentariosLikeses) {
        this.comentarios = comentarios;
        this.restaurantes = restaurantes;
        this.usuarios = usuarios;
        this.comentario = comentario;
        this.fechaHora = fechaHora;
        this.comentarioses = comentarioses;
        this.comentariosLikeses = comentariosLikeses;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Comentarios getComentarios() {
        return this.comentarios;
    }

    public void setComentarios(Comentarios comentarios) {
        this.comentarios = comentarios;
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

    public String getComentario() {
        return this.comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaHora() {
        return this.fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Set getComentarioses() {
        return this.comentarioses;
    }

    public void setComentarioses(Set comentarioses) {
        this.comentarioses = comentarioses;
    }

    public Set getComentariosLikeses() {
        return this.comentariosLikeses;
    }

    public void setComentariosLikeses(Set comentariosLikeses) {
        this.comentariosLikeses = comentariosLikeses;
    }

}