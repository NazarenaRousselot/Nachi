package guiateorica;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el tipo de motor que tiene del 1 al 4");
        int motor = leer.nextInt();

        switch (motor) {
            case 1:
                System.out.println("la bomba es de agua");
                break;
            case 2:
                System.out.println("la bomba es de gasolina");
                break;
            case 3:
                System.out.println("la bomba es de hormigon");
                break;
            case 4:
                System.out.println("la bomba es de pasta alimenticia");
                break;
            default:
                System.out.println("la opcion ingresada no es valida para ninguna bomba");
        }
    }
}
