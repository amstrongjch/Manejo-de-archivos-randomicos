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
public class ErrorEdad extends Exception{

    public ErrorEdad() {
        super("Ingrese la edad entre 20 y 35 años");
    }
    
}
