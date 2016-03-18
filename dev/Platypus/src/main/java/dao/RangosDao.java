/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Rangos;

/**
 *
 * @author Seix
 */
public class RangosDao extends PlatypusDao {

    public List<Rangos> getAll() {
        List<Rangos> rangos = new ArrayList<>();
        rangos = (List) executeNamedQuery("model.Rangos.getAll");
        return rangos;
    }

    public boolean create(Rangos rango) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(Rangos rango, Rangos updatedRango) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(Rangos rango) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
