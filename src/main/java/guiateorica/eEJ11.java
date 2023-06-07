package guiateorica;

import java.util.Scanner;

public class eEJ11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese una frase");
        String frase = leer.next();

        decodificar(frase);
    }

    public static void decodificar(String palabra) {
        String codigo = " ";
        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.charAt(i)) {
                case 'a':
                    codigo = codigo + "œ";
                    break;
                case 'e':
                    codigo = codigo + "#";
                    break;
                case 'i':
                    codigo = codigo + "$";
                    break;
                case 'o':
                    codigo = codigo + "%";
                    break;
                case 'u':
                    codigo = codigo + "*";
                    break;
                default:
                    codigo = Concat(codigo + palabra.charAt(i));
            }
        }
        System.out.println(codigo);
    }

    private static String Concat(String letra) {
        return letra;
    }


}

