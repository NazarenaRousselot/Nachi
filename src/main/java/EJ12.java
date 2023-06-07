import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int num1 = leer.nextInt();

        System.out.println("ingrese otro numero");
        int num2 = leer.nextInt();

        esMultiplo(num1, num2);

    }


    public static void esMultiplo(int uno, int dos) {

        if (uno % dos == 0) {
            System.out.println("el numero uno es multiplo del numero dos");

        } else {
            System.out.println("los numeros no son multiplos");
        }

    }

}
