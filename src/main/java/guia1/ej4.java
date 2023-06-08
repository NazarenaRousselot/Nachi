package guia1;

import java.util.Scanner;
//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

public class ej4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese los grados en centrigrados");
        double grados= leer.nextDouble();

        double farenheit= 32 + (9 * grados / 5);
        System.out.println("los grados ingresados equivalen en farenheit a : "+farenheit);

    }
}
