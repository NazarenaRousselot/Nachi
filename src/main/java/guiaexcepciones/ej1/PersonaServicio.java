package guiaexcepciones.ej1;

import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in);

    public void esMayorDeEdad(){
        System.out.println("ingrese la edad de la persona");
         int age= leer.nextInt();


        Persona personita= new Persona(age);

        if (personita.getAge()>=18){
            System.out.println("es mayor de edad");
        } else if (personita.getAge()<18) {
            System.out.println("es menor de edad");
        } else if (personita.getAge()<0) {
            System.out.println("error, edad invalida");

        }


    }
}
