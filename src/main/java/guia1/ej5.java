package guia1;
import java.util.Scanner;
//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//Math.sqrt().

public class ej5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese un numero entero");
        double num1= leer.nextDouble();

        double doble=2*num1;
        double triple=3*num1;
        double raiz= Math.sqrt(num1);

        System.out.println("el doble de su numero es: "+doble);
        System.out.println("el triple de su numero es: "+triple);
        System.out.println("la raiz cuadrada es: "+raiz);
    }
}
