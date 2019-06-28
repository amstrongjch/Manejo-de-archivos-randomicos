/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladorExepcion;

import ec.edu.ups.modelo.BaseDeDatos;
import ec.edu.ups.modelo.Persona;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 *
 * @author Edison
 */
public class ControladorPersona {

    private BaseDeDatos miBaseDeDatos;

    public ControladorPersona() {
        miBaseDeDatos = new BaseDeDatos();
    }

    public void create(Persona persona) throws SQLException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String sql = "INSERT INTO\"DatosPerdona\" VALUES('" + persona.getCedula() + "','" + persona.getNombre() + "','" + persona.getApellido() + "', " + persona.getEdad() + ",'" + formato.format(persona.getFecha()) + "','" + persona.getCelular() + "'," + persona.getSalario() + ")";
        System.out.println(sql);
        miBaseDeDatos.conectar();
        try {
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDeDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

}
