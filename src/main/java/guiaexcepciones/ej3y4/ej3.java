package guiaexcepciones.ej3y4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej3 {
    private static int num2;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leer4 = new Scanner(System.in);

        String n2="as";
        int num2 =0;

        System.out.println("ingrese el primer numero");
        int n1 = 0;
        try{
            n1 = leer.nextInt();
        }catch (InputMismatchException nb) {
            System.out.println("debe ingresar un numero");
        }


        System.out.println("ingrese el segundo numero");
        try{
            n2=leer4.next();
            num2=Integer.parseInt(n2);

        }catch (NumberFormatException nb) {
            System.out.println("No se puede convertir a entero");
        }


        try{
            System.out.println("la division de los numeros es"+n1/num2);

        }catch (ArithmeticException nb) {
            
            System.out.println("No se puede dividir por cero");
        }












}
}
