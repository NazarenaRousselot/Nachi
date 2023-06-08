package guia1;

import java.util.Scanner;

//Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//pantalla el siguiente menú:
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
//pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
//opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
//programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
//seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
//del programa, caso contrario se vuelve a mostrar el menú.
public class ej11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op = 0;
        String salir = null;


        System.out.println("ingrese un numero entero y positivo");
        int num1 = leer.nextInt();

        System.out.println("Ahora ingrese otro mas");
        int num2 = leer.nextInt();


        do {
            System.out.println("MENU" + "1:SUMAR -  2:RESTAR - 3: MULTIPLICAR - 4:DIVIDIR -5:SALIR");
            System.out.println("ingrese una opcion del menu");

            op = leer.nextInt();

            switch (op) {
                case 1:
                    System.out.println("la suma de los numeros ingresados es " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("la resta de los numeros ingresados es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("la multiplicacion de los numeros es " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("el resultado de la division de los numeros es " + (num1 / num2));
                    break;

                case 5:
                    System.out.println("esta seguro que desea salir del programa? si/no");
                    salir = leer.nextLine();
                    if (salir == "si") {
                        System.out.println("Fin programa");
                    } else {
                        System.out.println("volvemo a empezar");
                        continue;
                    }
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta. Volve a empezar");
            }

        } while (op != 5 && salir != "si");


    }
}

