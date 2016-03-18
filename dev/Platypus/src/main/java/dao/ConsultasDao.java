/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Consultas;

/**
 *
 * @author Seix
 */

public class ConsultasDao extends PlatypusDao{
    
    public List<Consultas> getAll(){
        
        List<Consultas> consultas = new ArrayList<>();
        consultas = (List) executeNamedQuery("model.Consultas.getAll");
        return consultas;
    }

    public boolean create(Consultas consulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(Consultas consulta, Consultas updatedConsulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(Consultas consulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
