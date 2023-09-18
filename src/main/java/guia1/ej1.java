package guia1;
import java.util.Scanner;
//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//dos. El programa deberá después mostrar el resultado de la suma

public class ej1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese 2 numeros enteros");
        int num1= leer.nextInt();
        int num2= leer.nextInt();

        int suma=num1+num2;
        System.out.println("la suma de los numeros ingresados es: "+suma);

    }
}
