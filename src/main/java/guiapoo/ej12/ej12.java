package guiapoo.ej12;

import java.util.Scanner;

public class ej12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicios servicio=new PersonaServicios();
        Persona persona1=new Persona();

        System.out.println(servicio.crearPersona());

    }


}
