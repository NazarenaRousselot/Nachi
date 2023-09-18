package guiapoo.ej8;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CadenaServicios servicio=new CadenaServicios();
        Cadena frase1=servicio.crearFrase();

        System.out.println(frase1);
        System.out.println("la cantidad de vocales es: "+servicio.contarVocales(frase1));
        servicio.invertirFrase(frase1);
        System.out.println("el caracter se repite : "+servicio.vecesRepetido(frase1)+"veces");
        servicio.compararLongitud(frase1);
        servicio.unirFrases(frase1);
        System.out.println("la frase contiene el caracter?"+servicio.contiene(frase1));
        servicio.reemplazar(frase1);


    }

}
