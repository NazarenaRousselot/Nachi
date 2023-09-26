package guiaexcepciones.ej3y4;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el primer numero");
        int n1=leer.nextInt();
        System.out.println("ingrese el segundo numero");
        String n2=leer.next();

        int num1=n1;
        int num2 =Integer.parseInt(n2);

        System.out.println("la division de los numeros es : " + num1/num2);

        try{
            n1 = leer.nextInt();
        }catch (Exception e){
            System.out.println("debe ingresar un numero");
    }


}
}
