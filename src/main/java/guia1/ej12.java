package guia1;
import java.util.Scanner;
//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
//ser X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
//distinta de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
//e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().

public class ej12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String cadena;
        int correctas=0;
        int incorrectas=0;
        do {
            System.out.println("ingrese la cadena");
            cadena = leer.next();

            String primera = cadena.substring(0, 1);
            String ultima = cadena.substring(cadena.length()-1, cadena.length());


            if (cadena.length() == 5 && primera.equals("X") && ultima.equals("O")) {
                correctas = correctas + 1;
            } else {
                incorrectas = incorrectas + 1;
            }
        } while (!cadena.equals("&&&&&"));
        System.out.println("Cantidad de cadenas correctas " + correctas + " cantidad incorrectas" + incorrectas);
    }
}

