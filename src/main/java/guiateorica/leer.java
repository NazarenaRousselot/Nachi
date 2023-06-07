package guiateorica;

import java.util.Scanner;

public class leer {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


        System.out.println("ingresa un numero decimal");
        double numero = leer.nextDouble();

        System.out.println("ingrese un caracter");
        String caracter = leer.nextLine();


        System.out.println("el numero ingresado es: " + numero + "el caracter ingresado es: " + caracter);


    }
}
