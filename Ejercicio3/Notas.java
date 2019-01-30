package Ejercicio3;

import Ejercicio2.*;
import java.util.Random;

/**
 *
 * @author emendezduran
 */
public class Notas {

    int[] notas;
    String[] nombres;

    public Notas() {
    }

    public Notas(int numero) {
        notas = new int[numero];
        randnum();
        nombres = new String[numero];
        randnom();
        
    }

    public void randnum() {
        Random rand = new Random();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = rand.nextInt(10) + 1;
        }

    }
    
    public void randnom() {
        Random rand = new Random();
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = "alumno" + i;
        }
    }

    public void amosar() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println(i + " " + notas[i] + " " + nombres[i]);
        }
    }

    public void amosarAprobados() {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(i + " " + notas[i] +" "+ nombres[i]);
            }
        }
    }

    public void amosarReprobados() {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                System.out.println(i + " " + notas[i]);
            }
        }
    }

    public void amosarInverso() {
        for (int i = notas.length - 1; i >= 0; i--) {
            System.out.println(i + " " + notas[i]);
        }
    }
    
    public void ordenarAscendente() {
        for (int i = 0; i <notas.length; i++) {
            for (int j = 0; j < notas.length; j++) {
                if (notas[i] < notas[j]) {
                    int aux = notas[i];
                    String aux1 = nombres[i];
                    notas[i] = notas[j];
                    nombres[i] = nombres[j];
                    notas[j] = aux;
                    nombres[j] = aux1;
                }
            }
        }
        
    }
    
    

    public void amosarForEach() {
        for (int ele : notas) {
            System.out.println(ele);
        }
    }

    public float notaMedia(){
        int acumulador = 0;
        for (int i = 0; i < notas.length; i++) {
        acumulador+= notas[i];
        } 
        return acumulador/notas.length;
    } 
    
    public int notaMasAlta(){
        int acumulador = 0;
        for (int i = 0; i < notas.length; i++) {
        if(notas[i] > acumulador){
            acumulador = notas[i];
        }    
        }
        return acumulador;
    }
    
    public int amosarNota(String nombre){
        for(int i=0; i<nombres.length;i++){
            if(nombre.equalsIgnoreCase(nombres[i])){
            return notas[i];
            }
        } return -1;
    }
}
