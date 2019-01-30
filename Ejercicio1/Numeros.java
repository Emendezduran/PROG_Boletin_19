package Ejercicio1;

import java.util.Random;

/**
 *
 * @author emendezduran
 */
public class Numeros {
    
    int[] numeros;

    public Numeros() {
    }
    
    public Numeros(int numero) {
        numeros = new int[numero];
        randnum();
    }
    
    public void randnum(){
        Random rand = new Random();
        for(int i = 0; i<numeros.length; i++){
            numeros[i]= rand.nextInt(50);
        }
        
    }

    public void amosar(){
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }
    
       public void amosarInverso(){
        for(int i=numeros.length-1;i>=0;i--){
            System.out.println(numeros[i]);
        }
    }
       
    public void amosarForEach(){
        for(int ele : numeros)
            System.out.println(ele);
    }
    
    
    
    
    
}
