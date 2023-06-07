import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese 4 numeros entre 1 y 20");
            int num = leer.nextInt();
            int aux = num;
            String ast = " ";
            while (num > 0 && num < 20) {
                ast = ast + "*";
                num = num - 1;
            }
            System.out.println("el numero de digitos ingresados es :" + aux + ast);

        }


    }
}
