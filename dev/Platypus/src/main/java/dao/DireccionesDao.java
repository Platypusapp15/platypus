/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Direcciones;

/**
 *
 * @author Seix
 */
public class DireccionesDao extends PlatypusDao {

    public List<Direcciones> getAll() {
        
        List<Direcciones> direcciones = new ArrayList<>();
        direcciones = (List) executeNamedQuery("model.Direcciones.getAll");
        return direcciones;
    }

    public boolean create(Direcciones direccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(Direcciones direccion, Direcciones updatedDireccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(Direcciones direccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
