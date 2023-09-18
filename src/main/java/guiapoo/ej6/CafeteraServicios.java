package guiapoo.ej6;

import java.util.Scanner;

public class CafeteraServicios {
    Scanner leer = new Scanner(System.in);

    public void llenarCafetera(Cafetera llenar) {
        llenar.setCapacidadActual(llenar.getCapacidadMaxima());
        System.out.println("capacidad actual"+llenar.getCapacidadActual());
    }

    public void servirTaza(Cafetera servir, double medidaTaza){
        if (servir.getCapacidadActual()<medidaTaza){
            System.out.println("la taza no se pudo llenar, se completaron: "+servir.getCapacidadActual());
            servir.setCapacidadActual(0);
        }else{
            System.out.println("la taza se completo");
            servir.setCapacidadActual(servir.getCapacidadActual()-medidaTaza);
            System.out.println("Ahora la cafetera tiene: " + servir.getCapacidadActual());
        }
    }

    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCapacidadActual(0);
        System.out.println("Ahora la cafetera tiene: " + cafetera.getCapacidadActual());
    }

    public void agregarCafe(Cafetera cafetera,double cantidadAgregar){
        if(cantidadAgregar<(cafetera.getCapacidadMaxima()- cafetera.getCapacidadActual())){
        cafetera.setCapacidadActual(cafetera.getCapacidadActual()+cantidadAgregar);
        System.out.println("Ahora la cafetera tiene: " + cafetera.getCapacidadActual());
    }else{
            System.out.println("la cantidad supera el maximo de la cafetera");
        }
}
}
