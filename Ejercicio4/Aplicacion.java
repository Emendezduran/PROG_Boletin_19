package Ejercicio4;
//@author emendezduran

import java.util.Scanner;

public class Aplicacion {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un DNI... ");
        int dni = scan.nextInt();
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int modulo = dni % 23;
        System.out.println(dni +""+ letras[modulo]);
    }
}
    
    

