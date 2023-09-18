package guia1;
import java.util.Scanner;
//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
//investigar la función equals() en Java.

public class ej7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese una frase");
        String frase = leer.nextLine();

        String clave = "eureka";

        if (frase.equals(clave)) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }
    }
}

