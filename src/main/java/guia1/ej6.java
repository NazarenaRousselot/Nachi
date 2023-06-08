package guia1;
import java.util.Scanner;
//Crear un programa que dado un numero determine si es par o impar.

public class ej6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int num= leer.nextInt();
        if (num%2==0){
            System.out.println("el numero ingresado es par");
        }else{
            System.out.println("el numero ingresado es impar");
        }
    }
}
