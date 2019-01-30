package Ejercicio2;

import java.util.Random;

/**
 *
 * @author emendezduran
 */
public class Notas {

    int[] notas;

    public Notas() {
    }

    public Notas(int numero) {
        notas = new int[numero];
        randnum();
    }

    public void randnum() {
        Random rand = new Random();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = rand.nextInt(10) + 1;
        }

    }

    public void amosar() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println(i + " " + notas[i]);
        }
    }

    public void amosarAprobados() {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(i + " " + notas[i]);
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
}
