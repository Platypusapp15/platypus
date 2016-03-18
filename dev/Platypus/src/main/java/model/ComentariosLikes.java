package model;
// Generated 13-mar-2016 20:56:27 by Hibernate Tools 4.3.1

import javax.xml.bind.annotation.XmlRootElement;

/**
 * ComentariosLikes generated by hbm2java
 */
@XmlRootElement(name = "ComentariosLikes")
public class ComentariosLikes implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private ComentariosLikesId id;
    private Comentarios comentarios;
    private Usuarios usuarios;
    private boolean like;

    public ComentariosLikes() {
    }

    public ComentariosLikes(ComentariosLikesId id, Comentarios comentarios, Usuarios usuarios, boolean like) {
        this.id = id;
        this.comentarios = comentarios;
        this.usuarios = usuarios;
        this.like = like;
    }

    public ComentariosLikesId getId() {
        return this.id;
    }

    public void setId(ComentariosLikesId id) {
        this.id = id;
    }

    public Comentarios getComentarios() {
        return this.comentarios;
    }

    public void setComentarios(Comentarios comentarios) {
        this.comentarios = comentarios;
    }

    public Usuarios getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public boolean isLike() {
        return this.like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

}
