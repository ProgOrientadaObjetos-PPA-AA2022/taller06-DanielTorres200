/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author spart
 */
public class Enfermero {
    private String nombreEnfermero;
    private String tipo;
    private double sueldoMensualE;

    public Enfermero(String nomE, String nombreTipo, double sueldoM) {
        nombreEnfermero = nomE;
        tipo = nombreTipo;
        sueldoMensualE = sueldoM;
        
    }

    public void establecerNombreEnfermero(String n) {
        nombreEnfermero = n;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }
    
    public void establecerSueldoMensualE(double n) {
        sueldoMensualE = n;
    }

    public String obtenerNombreEnfermero() {
        return nombreEnfermero;
    }

    public String obtenerTipo() {
        return tipo;
    }
    
    public double obtenerSueldoMensualE() {
        return sueldoMensualE;
    }

}
