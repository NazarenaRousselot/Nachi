import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cont = 0;
        double suma = 0;
        double num = 0;
        do {
            System.out.println("ingrese un numero");
            num = leer.nextDouble();
            if (num == 0) {
                System.out.println("se capturo el numero 0");
                break;
            } else {
                cont = cont + 1;
                suma = suma + num;
            }
        }
        while (cont < 20);
        System.out.println("la suma de los numeros ingresados es : " + suma);

    }
}

