package guiateorica;

import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {


        String name = "nazarena";
        String gender = "";
        int edad;

        //For scan and print mi gender
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your Gender");
        gender = scan.nextLine();
        System.out.println("mi gender is :" + gender);

        System.out.println("now introduce tu edad");
        edad = scan.nextInt();

        System.out.println(" mi nombre es " + name + " tengo " + edad + " años y mi sexo es " + gender);

        if (edad < 18) {
            System.out.println("y soy menor de edad");
        } else if (edad == 18) {
            System.out.println("Ahi de pedo soy mayor");
        } else {
            System.out.println("Soy mayor de edat");
        }


    }
}
