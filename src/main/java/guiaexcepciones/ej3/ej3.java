package guiaexcepciones.ej3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        String n1=leer.next();
        System.out.println("ingrese el segundo numero");
        String n2=leer.next();

        int num1=Integer.parseInt(n1);
        int num2 =Integer.parseInt(n2);

        System.out.println("la division de los numeros es : " + num1/num2);

        try{
            System.out.println(n1);
        }catch (InputMismatchException e){
            System.out.println("ingreso invalido");

    }


}
}
