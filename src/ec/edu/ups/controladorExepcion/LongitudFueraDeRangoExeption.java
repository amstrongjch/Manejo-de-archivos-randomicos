package ec.edu.ups.controladorExepcion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edison
 */
public class LongitudFueraDeRangoExeption extends Exception{

    public LongitudFueraDeRangoExeption() {
        super("La longitud debe ser entre 20 y 50 caracteres");
    }
    
}
