package guia1;
import java.util.Scanner;
public class ej13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String fila2=" ";
        String fila1="* ";

        System.out.println("ingrese el tamaño del cuadraro");
        int tamaño=leer.nextInt();

        for (int i = 2; i == tamaño; i++){
            fila1=fila1+"* ";
        }
        for (int j = 4; j == tamaño; j++){
            fila2= fila2+" ";
        }
        fila2="* "+fila2;
        fila2=fila2+"*";
        System.out.println(fila1);
        if (3<=tamaño){
            for (int k = 2; k == 3; k++){
                System.out.println(fila2);
            }
            System.out.println(fila1);

        }else
            if (2 == tamaño){
                System.out.println(fila1);
            }else{
                System.out.println("");
            }




        }



    }

