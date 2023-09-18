package guiapoo.ej8;

import java.util.Scanner;

public class CadenaServicios {
    Scanner leer = new Scanner(System.in);

    public Cadena crearFrase() {
        Cadena frase = new Cadena();
        System.out.println("ingrese la frase");
        frase.setFrase(leer.nextLine());
        frase.setLongitud(frase.getFrase().length());
        return frase;

    }

    public int contarVocales(Cadena cade) {
        int vocales = 0;
        for (int i = 0; i < cade.getFrase().length(); i++) {
            char letra = cade.getFrase().charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales = vocales + 1;
            }
        }
        return vocales;
    }

    public void invertirFrase(Cadena cade) {
        for (int i = cade.getFrase().length() - 1; i >= 0; i--) {
            System.out.print(cade.getFrase().charAt(i));
        }
    }


    public int vecesRepetido(Cadena cade) {
        System.out.println("ingrese un caracter");
        char letra = leer.next().charAt(0);

        int caracter = 0;
        for (int i = 0; i < cade.getFrase().length(); i++) {
            char letrai = cade.getFrase().charAt(i);

            if (letra == letrai) {
                caracter = caracter + 1;
            }
        }
        return caracter;
    }

    public void compararLongitud(Cadena cade) {
        System.out.println("ingrese una nueva frase");
        String frase = leer.next();

        if (frase.length() >= cade.getFrase().length()) {
            System.out.println("La nueva frase posee mas caracteres que la original");
        } else {
            System.out.println("La nueva frase posee menos caracteres que la original");
        }


    }

    public void unirFrases(Cadena cade) {
        System.out.println("ingrese una nueva frase");
        String frase = leer.next();

        System.out.println(cade.getFrase() + frase);
    }

    public void reemplazar(Cadena cade) {
        System.out.println("ingrese el caracter por el que desea reemplazar");
        char caracter = leer.next().charAt(0);

        System.out.println(cade.getFrase().replace('a', caracter));
    }



    public boolean contiene(Cadena cade) {
        System.out.println("ingrese el caracter a buscar");
        char caracter = leer.next().charAt(0);
        for (int i = 0; i < cade.getFrase().length(); i++) {
            char letra = cade.getFrase().charAt(i);
            if (letra == caracter) {
                return true;
            }

        }
        return false;
    }
}


            

