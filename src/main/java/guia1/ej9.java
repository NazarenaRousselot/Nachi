package guia1;
import java.util.Scanner;
//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
//que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
//investigar la función Substring y equals() de Java.

public class ej9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese una frase ");
        String frase = leer.nextLine();

        String primer = frase.substring(0,1);
        String letra="a";

        if (primer.equals(letra)) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
    }
}