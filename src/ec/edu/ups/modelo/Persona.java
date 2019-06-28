package ec.edu.ups.modelo;


import ec.edu.ups.controladorExepcion.ErrorCedula;
import ec.edu.ups.controladorExepcion.ErrorApellidoDosApellidos;
import ec.edu.ups.controladorExepcion.ErrrorNombreLetras;
import ec.edu.ups.controladorExepcion.ErrorApellidoLetras;
import ec.edu.ups.controladorExepcion.ErrorNombreDosNomres;
import ec.edu.ups.controladorExepcion.ErrorEdad;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edison
 */
public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private Date fecha;
    private String celular;
    private Double salario;

    public Persona() {
        
    }

    public Persona(String cedula, String nombre, String apellido, int edad, Date fecha, String celular, Double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fecha = fecha;
        this.celular = celular;
        this.salario = salario;
    }
    
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) throws ErrorCedula{
        int total = 0;
        int c = 0;
        int tamanoLongitudCedula = 10;
        int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        int numeroProviancias = 24;
        int tercerdigito = 6;
        if (cedula.matches("[0-9]*") && cedula.length() == tamanoLongitudCedula) {
            int provincia = Integer.parseInt(cedula.charAt(0) + "" + cedula.charAt(1));
            int digitoTres = Integer.parseInt(cedula.charAt(2) + "");
            if ((provincia > 0 && provincia <= numeroProviancias) && digitoTres < tercerdigito) {
                int digitoVerificadorRecibido = Integer.parseInt(cedula.charAt(9) + "");
                for (int i = 0; i < coeficientes.length; i++) {
                    int valor = Integer.parseInt(coeficientes[i] + "") * Integer.parseInt(cedula.charAt(i) + "");
                    total = valor >= 10 ? total + (valor - 9) : total + valor;
                }
                int digitoVerificadorObtenido = total >= 10 ? (total % 10) != 0 ? 10 - (total % 10) : (total % 10) : total;
                if (digitoVerificadorObtenido == digitoVerificadorRecibido) {
                    this.cedula = cedula;
                    c = 1;
                }
            }
            if(c != 1){
                throw new ErrorCedula();
            }          
        }
        if(c != 1){
                throw new ErrorCedula();
            }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ErrorNombreDosNomres, ErrrorNombreLetras {
        int c = 0;
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == '0' || nombre.charAt(i) == '1' || nombre.charAt(i) == '2' || nombre.charAt(i) == '3' || nombre.charAt(i) == '4' || nombre.charAt(i) == '5' || nombre.charAt(i) == '6' || nombre.charAt(i) == '7' || nombre.charAt(i) == '8' || nombre.charAt(i) == '9') {
                c = 1;
            }
        }
        if (c != 0) {
            throw new ErrrorNombreLetras();
        }
        c = 0;
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == ' ') {
                c = 1;
            }
        }

        if (c != 1) {
            throw new ErrorNombreDosNomres();
        }

        this.nombre = nombre;

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String nombre) throws ErrorApellidoDosApellidos, ErrorApellidoLetras {
        int c = 0;
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == '0' || nombre.charAt(i) == '1' || nombre.charAt(i) == '2' || nombre.charAt(i) == '3' || nombre.charAt(i) == '4' || nombre.charAt(i) == '5' || nombre.charAt(i) == '6' || nombre.charAt(i) == '7' || nombre.charAt(i) == '8' || nombre.charAt(i) == '9') {
                c = 1;
            }
        }
        if (c != 0) {
            throw new ErrorApellidoLetras();
        }
        c = 0;
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == ' ') {
                c = 1;
            }
        }

        if (c != 1) {
            throw new ErrorApellidoDosApellidos();
        }

        this.apellido = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ErrorEdad {
        if (edad >= 20 && edad <= 35) {
            this.edad = edad;
        } else {
            throw new ErrorEdad();
        }

    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", fecha=" + fecha + ", celular=" + celular + ", salario=" + salario + '}';
    }
    
    

}
