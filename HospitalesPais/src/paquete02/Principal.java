/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;
import java.util.Scanner;
import paquete01.EntidadHospitalaria;
import paquete01.Ciudad;
import paquete01.Medico;
import paquete01.Enfermero;
/**
 *
 * @author spart
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        String nombreHospital, ciudadHospital, provinciaHospital, direccion;
        int numeroMedicos, numeroEnfermeros;
        
        System.out.println("Ingrese el nombre del Hospital: ");
        nombreHospital = sc.nextLine();
        
        EntidadHospitalaria h1 = new EntidadHospitalaria(nombreHospital);
        
        System.out.println("Ingrese la ciudad: ");
        ciudadHospital = sc.nextLine();
        
        System.out.println("Ingrese la provincia: ");
        provinciaHospital = sc.nextLine();
        
        Ciudad c1 = new Ciudad(ciudadHospital, provinciaHospital);
        
        h1.establecerCiudadHospital(c1);
        
        System.out.println("¿Cuantos medicos/as existe en el hospital?: ");
        numeroMedicos = sc.nextInt();
        
        System.out.println("¿Cuantos enfermeros/as existe en el hospital?: ");
        numeroEnfermeros = sc.nextInt();
        sc.nextLine();
        
        
        Medico[] conjuntoMedicos = new Medico[numeroMedicos];
        sc.nextLine();
        
        for (int i = 0; i < numeroMedicos; i++) {
            
            String nombreMed, especialidadM;
            double sueldoMed;
                  
            System.out.println("Ingrese el nombre del medico " + (i+1) + ":");
            nombreMed = sc.nextLine();
            
            System.out.println("Ingrese la especialidad del Medico " + (i+1) + ":");
            especialidadM = sc.nextLine();
            
            System.out.println("Ingrese el sueldo mensual del Medico " + (i+1) + ":");
            sueldoMed = sc.nextDouble();
            sc.nextLine();
            
            Medico med = new Medico(nombreMed,especialidadM, sueldoMed);  
            conjuntoMedicos[i] = med;
            sc.nextLine();
        }

        
        Enfermero[] conjuntoEnfermeros = new Enfermero[numeroEnfermeros]; 
        
        for (int i = 0; i < numeroEnfermeros; i++) {
            
            String nombreEnf, tipo;
            double sueldoEnf;
            
            
            System.out.println("Ingrese el nombre del Enfermero " + (i+1) + ":");
            nombreEnf = sc.nextLine();
            
            
            System.out.println("Ingrese el tipo (Nombramiento/Contrato)" + (i+1) + ":");
            tipo = sc.nextLine();
            
            
            System.out.println("Ingrese el sueldo mensual del Enfermero " + (i+1) + ":");
            sueldoEnf = sc.nextDouble();
            sc.nextLine();
            
            Enfermero enf = new Enfermero(nombreEnf, tipo, sueldoEnf);
            conjuntoEnfermeros[i] = enf;
            sc.nextLine();
        }
        
        h1.establecerConjuntoMedicos(conjuntoMedicos);
        h1.establecerConjuntoEnfermeros(conjuntoEnfermeros);
        h1.establecerTotalSueldos();
        
        System.out.println("Ingrese la direccion del hospital: ");
        direccion = sc.nextLine();
        sc.nextLine();
        
        h1.establecerDireccionHospital(direccion);
        h1.establecerNumeroEspecialidades();
        
        System.out.println(h1);    
    }
}

