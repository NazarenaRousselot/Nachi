package guia1;
import java.util.Scanner;
//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere el
//límite inicial.

public class ej10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese un valor limite positivo");
        int limite= leer.nextInt();

        int suma=0;

        do{
            System.out.println("ingrese un numero");
            int num= leer.nextInt();
            suma=suma+num;
        }while (suma < limite);

    }
}
