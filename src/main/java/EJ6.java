import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {

        numeros();

    }

    public static void numeros() {
        int num = 25;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int num1 = leer.nextInt();
        System.out.println("ingrese otro numero entero");
        int num2 = leer.nextInt();

        if (num1 > num && num2 > num) {
            System.out.println("ambos numeros son mayores a 25");
        } else if (num < num1 || num2 > num) {
            System.out.println("uno de los numeros ingresados es mayor a 25");
        } else {
            System.out.println("Ninguno de los numeros es mayor a 25");
        }
    }
}
