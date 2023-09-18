package guiapoo.ej7;

import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        String sex = "";
        Persona pers = new Persona();
        System.out.println("ingrese el nombre");
        pers.setNombre(leer.next());
        System.out.println("ingrese la edad");
        pers.setEdad(leer.nextInt());

        while (!sex.equalsIgnoreCase("H") && !sex.equalsIgnoreCase("M")
                && !sex.equalsIgnoreCase("O")) {
            System.out.println("ingrese el sexo: H/M/O");
            sex = leer.next();
            pers.setSexo(sex);
        }

        System.out.println("ingrese el peso");
        pers.setPeso(leer.nextDouble());
        System.out.println("ingrese la altura");
        pers.setAltura(leer.nextDouble());
        return pers;
    }

    public int cacularIMC(Persona personita) {
        double imc = personita.getPeso() / (personita.getAltura() * personita.getAltura());
        if (imc < 20) {
            return (-1);
        }
        if (imc >= 20 && imc <= 25) {
            return (0);
        }
        if (imc > 25) {
            return 1;
        }
        return 0;
    }


        public int esMayorDeEdaD(Persona personita){
           if (personita.getEdad() > 18){
               return (1);
           } else{
                   return (0);
           }




    }
}

