/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Subscripciones;
import model.SubscripcionesTipos;

/**
 *
 * @author Seix
 */
public class SubscripcionesDao extends PlatypusDao {

    public List<Subscripciones> getAll() {
        List<Subscripciones> subscripciones = new ArrayList<>();
        subscripciones = (List) executeNamedQuery("model.Subscripciones.getAll");
        return subscripciones;
    }

    public boolean create(Subscripciones subscripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(Subscripciones subscripcion, Subscripciones updatedSubscripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(Subscripciones subscripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<SubscripcionesTipos> getTiposAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean createTipo(SubscripcionesTipos tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean updateTipo(SubscripcionesTipos tipo, SubscripcionesTipos updatedTipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean deleteTipo(SubscripcionesTipos tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
