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
public class Medico {
    private String nombreDoctor;
    private String especialidad;
    private double sueldoMensualD;

    public Medico(String nomM, String nombreEspecialidad, double sueldoM) {
        nombreDoctor = nomM;
        especialidad = nombreEspecialidad;
        sueldoMensualD = sueldoM;  
    }

    public void establecerNombreDoctor(String n) {
        nombreDoctor = n;
    }

    public void establecerEspecialidad(String n) {
        especialidad = n;
    }
    
    public void establecerSueldoMensualM(double n) {
        sueldoMensualD = n;
    }

    public String obtenerNombreDoctor() {
        return nombreDoctor;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }
    
    public double obtenerSueldoMensualM() {
        return sueldoMensualD;
    }

}