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
public class Ciudad {
    private String nombreCiudad;
    private String provinciaCiudad;

    public Ciudad(String nombreC, String provinciaC) {
        nombreCiudad = nombreC;
        provinciaCiudad = provinciaC;
        
    }

    public void establecerNombreCiudad(String n) {
        nombreCiudad= n;
    }

    public void establecerProvinciaCiudad(String n) {
        provinciaCiudad = n;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public String obtenerProvinciaCiudad() {
        return provinciaCiudad;
    }

}
