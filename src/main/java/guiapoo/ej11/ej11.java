package guiapoo.ej11;

import java.util.Scanner;
import java.util.Date;

public class ej11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

            // Obtener la fecha actual
            Date fechaActual = new Date();
            System.out.println("La fecha actual es: " + fechaActual);

            // Pedir al usuario el día, mes y año
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el día: ");
            int dia = scanner.nextInt();

            System.out.print("Ingrese el mes: ");
            int mes = scanner.nextInt() - 1;  // Restar 1 al mes, ya que en la clase Date los meses comienzan desde 0

            System.out.print("Ingrese el año: ");
            int anio = scanner.nextInt();
// Crear la fecha utilizando el constructor de la clase Date
            Date fechaIngresada = new Date(anio - 1900, mes, dia);  // Restar 1900 al año, ya que en la clase Date los años se cuentan a partir de 1900

            // Mostrar la fecha ingresada
            System.out.println("Fecha ingresada: " + fechaIngresada);

            // Calcular la diferencia de años entre la fecha ingresada y la fecha actual
            int diferenciaAnios = fechaActual.getYear() - fechaIngresada.getYear();

            //Mostrar la diferencia de años
           System.out.println("Diferencia de años: " + diferenciaAnios);

        }

    }
