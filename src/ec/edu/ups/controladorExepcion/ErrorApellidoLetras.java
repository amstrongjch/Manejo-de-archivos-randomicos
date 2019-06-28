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
public class ErrorApellidoLetras extends Exception{

    public ErrorApellidoLetras() {
        super("Ingrese solo letras en el apellido");
    }
    
}
