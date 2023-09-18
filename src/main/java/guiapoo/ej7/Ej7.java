package guiapoo.ej7;

import java.util.Arrays;
import java.util.Vector;

public class Ej7 {
    public static void main(String[] args) {
        PersonaServicio servicio = new PersonaServicio();
        Persona persona1 = servicio.crearPersona();

        System.out.println(persona1);
        System.out.println("el imc de la persona es :" + servicio.cacularIMC(persona1));
        System.out.println("la persona es mayor de edad? " + servicio.esMayorDeEdaD(persona1));


        Persona persona2 = new Persona("pedro", 30, "h", 200, 1.5);
        System.out.println(persona2);
        System.out.println("el imc de la persona es :" + servicio.cacularIMC(persona2));
        System.out.println("la persona es mayor de edad? " + servicio.esMayorDeEdaD(persona2));


        Persona persona3 = new Persona("maria", 15, "m", 20, 1.5);
        System.out.println(persona3);
        System.out.println("el imc de la persona es :" + servicio.cacularIMC(persona3));
        System.out.println("la persona es mayor de edad? " + servicio.esMayorDeEdaD(persona3));


        Persona persona4 = new Persona("leo", 45, "o", 80, 1.9);
        System.out.println(persona4);
        System.out.println("el imc de la persona es :" + servicio.cacularIMC(persona4));
        System.out.println("la persona es mayor de edad? " + servicio.esMayorDeEdaD(persona4));


        int[] vector = new int[4];
        vector[0] = servicio.cacularIMC(persona1);
        vector[1] = servicio.cacularIMC(persona2);
        vector[2] = servicio.cacularIMC(persona3);
        vector[3] = servicio.cacularIMC(persona4);

        double bajo = 0;
        double ideal = 0;
        double sobrepeso = 0;


        for (int i = 0; i < 4; i++) {
            if (vector[i] == 0) {
                ideal = ideal + 1;
            }
            if (vector[i] == 1) {
                    sobrepeso = sobrepeso + 1;
                }
            if (vector[i] == -1) {
                        bajo = bajo + 1;
                    }
                }


        System.out.println("el "+(bajo/4)*100+" % estan por debajo de su peso");
        System.out.println("el "+(ideal/4)*100+" % estan en su peso ideal");
        System.out.println("el "+(sobrepeso/4) *100+" % tiene sobrepeso");

        int[] vector1 = new int[4];
        vector1[0] = servicio.esMayorDeEdaD(persona1);
        vector1[1] = servicio.esMayorDeEdaD(persona2);
        vector1[2] = servicio.esMayorDeEdaD(persona3);
        vector1[3] = servicio.esMayorDeEdaD(persona4);

        double mayor=0;
        double menor=0;

        for (int i = 0; i < 4; i++) {
            if(vector1[i]== 0){
                menor= menor+1;
            }if(vector1[i]== 1){
                mayor= mayor+1;
            }
        }

        System.out.println("el" +(menor/4)*100+ " % son menores de edad");
        System.out.println("el"+(mayor/4)*100 + " % son mayores de edad");




    }
}

