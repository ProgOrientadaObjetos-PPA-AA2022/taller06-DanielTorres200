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
public class EntidadHospitalaria {
    private String nombreHospital;
    private Ciudad ciudadHospital;
    private int numeroEspecialidades;
    private Medico[] conjuntoMedicos;
    private Enfermero[] conjuntoEnfermeros;
    private double totalSueldos;
    private String direccionHospital;

    public EntidadHospitalaria(String nombreH) {
        nombreHospital = nombreH;       
    }

    public void establecerNombreHospital(String n) {
        nombreHospital = n;
    }

    public void establecerCiudadHospital(Ciudad n) {
        ciudadHospital = n;
    }
    
    public void establecerNumeroEspecialidades() {
        int suma = conjuntoMedicos.length + conjuntoEnfermeros.length;
        numeroEspecialidades = suma; 
    }
    
    public void establecerConjuntoMedicos(Medico[] n) {
        conjuntoMedicos = n;
    }

    public void establecerConjuntoEnfermeros(Enfermero[] n) {
        conjuntoEnfermeros = n;
    }
    
    public void establecerTotalSueldos() {
        double suma = 0;

        for (int i = 0; i < conjuntoMedicos.length; i++) {
            suma = suma + conjuntoMedicos[i].obtenerSueldoMensualM();
        }

        for (int i = 0; i < conjuntoEnfermeros.length; i++) {
            suma = suma + conjuntoEnfermeros[i].obtenerSueldoMensualE();
        }

        totalSueldos = suma;
    }
    
    public void establecerDireccionHospital(String n) {
        direccionHospital = n;
    }

    public String obtenerNombreHospital() {
        return nombreHospital;
    }

    public Ciudad obtenerCiudadHospital() {
        return ciudadHospital;
    }
    
    public int obtenerNumeroEspecialidades() {
        return numeroEspecialidades;
    }
    
    public Medico[] obtenerConjuntoMedicos() {
        return conjuntoMedicos;
    }

    public Enfermero[] obtenerConjuntoEnfermeros() {
        return conjuntoEnfermeros;
    }
    
    public double obtenerTotalSueldos() {
        return totalSueldos;
    }
    
    public String obtenerDireccionHospital() {
        return direccionHospital;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Hospital %s\n", obtenerNombreHospital());
        cadena = String.format("%s\nDireccion: %s\nCiudad: %s\nProvincia: %s\nNumero de Especialidades: %d\n", cadena, 
                obtenerDireccionHospital(), ciudadHospital.obtenerNombreCiudad(), ciudadHospital.obtenerProvinciaCiudad(),
                obtenerNumeroEspecialidades());
        
        cadena = String.format("%s\nListados de medicos/as\n", cadena);
        
        for (int i = 0; i < obtenerConjuntoMedicos().length; i++) {
            cadena = String.format("%s- %s - Sueldo: %.2f - %s\n", cadena, 
                    obtenerConjuntoMedicos()[i].obtenerNombreDoctor(),
                    obtenerConjuntoMedicos()[i].obtenerSueldoMensualM(),
                    obtenerConjuntoMedicos()[i].obtenerEspecialidad());
        }
        
        cadena = String.format("%s\nListados de Enfermeros/as\n", cadena);
        
        for (int i = 0; i < obtenerConjuntoEnfermeros().length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n", cadena, 
                    obtenerConjuntoEnfermeros()[i].obtenerNombreEnfermero(),
                    obtenerConjuntoEnfermeros()[i].obtenerSueldoMensualE(),
                    obtenerConjuntoEnfermeros()[i].obtenerTipo());
        }
        
        cadena = String.format("%s\nTotal de sueldos a pagar por mes: %.2f",cadena
        ,obtenerTotalSueldos());

        return cadena;
    }
}
