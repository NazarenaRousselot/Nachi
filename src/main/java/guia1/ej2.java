package guia1;
import java.util.Scanner;
//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.

public class ej2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese su nombre");
        String nombre=leer.nextLine();

        System.out.println("el nombre del usuario es: "+nombre);
    }
}
