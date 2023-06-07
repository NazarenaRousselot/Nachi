package guiateorica;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una nota entre 0 y 10");
        double nota = leer.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("nota incorrecta, ingrese nuevamente la nota obtenida");
            break;

        }
    }
}
