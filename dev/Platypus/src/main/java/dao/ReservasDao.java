/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Reservas;

/**
 *
 * @author Seix
 */
public class ReservasDao extends PlatypusDao {

    public List<Reservas> getAll() {
        List<Reservas> reservas = new ArrayList<>();
        reservas = (List) executeNamedQuery("model.Reservas.getAll");
        return reservas;
    }

    public boolean create(Reservas reserva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(Reservas reserva, Reservas updatedReserva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(Reservas reserva) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
