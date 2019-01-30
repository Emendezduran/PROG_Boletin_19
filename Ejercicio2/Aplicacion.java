package Ejercicio2;

/**
 *
 * @author emendezduran
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        Notas clase = new Notas(30);
        clase.amosar();
        System.out.println("Aprobados: ");
        clase.amosarAprobados();
        System.out.println("Reprobados: ");
        clase.amosarReprobados();
        System.out.println("Nota media de la clase: " + clase.notaMedia());
        System.out.println("Nota mas alta de la clase: " + clase.notaMasAlta());
    }
}
