/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Restaurantes;
import model.RestaurantesTipos;

/**
 *
 * @author Seix
 */
public class RestaurantesDao extends PlatypusDao {

    public List<Restaurantes> getAll() {
        List<Restaurantes> restaurantes = new ArrayList<>();
        restaurantes = (List) executeNamedQuery("model.Restaurantes.getAll");
        return restaurantes;
    }

    public boolean create(Restaurantes restaurante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(Restaurantes restaurante, Restaurantes updatedRestaurante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(Restaurantes restaurante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<RestaurantesTipos> getTiposAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean createTipo(RestaurantesTipos tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean updateTipo(RestaurantesTipos tipo, RestaurantesTipos updatedTipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean deleteTipo(RestaurantesTipos tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
