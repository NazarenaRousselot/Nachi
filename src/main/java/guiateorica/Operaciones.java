package guiateorica;

public class Operaciones {
    public static void main(String[] args) {
        int num1 = 200;
        int num2 = 2;

        int suma = num1 + num2;
        int resta = num1 - num2;
        double div = (double) num2 / num1;
        int mult = num1 * num2;
        boolean bandera = num1 > num2;

        System.out.println("la suma es " + suma + ". la resta es " + resta + ". la division es " + div + ". la multiplicacion es " + mult + "la bandera es" + bandera);
    }
}
