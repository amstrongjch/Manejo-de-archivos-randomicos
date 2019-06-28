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
public class ErrrorNombreLetras extends Exception{

    public ErrrorNombreLetras() {
        super("El nombre solo puede contener letras");
    }
    
}
