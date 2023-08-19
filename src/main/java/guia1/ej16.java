package guia1;
import guiateorica.leer;

import java.util.Scanner;
//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
//al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//numero y si se encuentra repetido

public class ej16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero a buscar");
        int numero=leer.nextInt();
        int contador = 0;


        int[] vector = new int[(int) (Math.random() * 100 + 1)];
        System.out.println(vector.length);

        for (int i =0; i < vector.length-1; i++) {
            vector[i]=(int) (Math.random() * 10 + 1);
            System.out.println("[" + vector[i] + "]");
        }

        for (int i =0; i < vector.length-1; i++) {
            if (vector[i] == numero && contador==0) {
                System.out.println("la primera posicion en la que se encuentra el numero es " + i);
                contador++;
            }else if (vector[i] == numero && contador!=0){
                contador++;
            }
        }

        if (contador > 1) {
            System.out.println("el numero se encuentra repetido");
        }
}}
