package guia1;
import java.util.Scanner;
//Crea una aplicación que a través de una función nos convierta una cantidad de euros
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
public class ej14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de euros a convertir");
        int euros = leer.nextInt();
        System.out.println("ingrese a que moneda lo quiere convertir: yenes,dolares o libras");
        String moneda = leer.next();
        convertir(moneda,euros);

    }

    public static void convertir(String moneda, int euros) {
        if (moneda.equals("libras")) {
            double conversion = (double) (euros * 0.86);
            System.out.println("la conversion es: "+conversion);
        } else {
            if (moneda.equals("dolares")) {
                double conversion = (double) (euros * 1.28611);
                System.out.println("la conversion es: "+conversion);
            } else {
                double conversion = (double) (euros * 129.852);
                System.out.println("la conversion es: "+conversion);
            }


        }
    }
}
