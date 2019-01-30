package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        Notas clase = new Notas(30);
        clase.amosar();
        System.out.println(clase.amosarNota("alumno1"));
        clase.amosarAprobados();
        clase.ordenarAscendente();
        clase.amosar();
        Scanner scan = new Scanner(System.in);
        System.out.println(clase.amosarNota(scan.next()));
        
        
    }
}
