package guiapoo.ej6;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double medida;
        double cantidad;

        CafeteraServicios servicio = new CafeteraServicios();
        Cafetera rilo = new Cafetera(1.2, 0.8);
        System.out.println(rilo);

        servicio.llenarCafetera(rilo);


        System.out.println("ingrese el tamaño de la taza");
        medida= leer.nextDouble();

        servicio.servirTaza(rilo, medida);

        servicio.vaciarCafetera(rilo);


        System.out.println("ingrese la cantidad de cafe a agregar");
        cantidad= leer.nextDouble();

        servicio.agregarCafe(rilo,cantidad);

    }
}
