package guiapoo.ej10;


import java.util.Arrays;

public class ej10 {

    public static void main(String[] args) {
        double vectorA[] = new double[50];
        double vectorB[] = new double[20];
        llenarVector(vectorA);
        ordenarVectorA(vectorA);
        rellenoVectorB(vectorA,vectorB);

    }

    public static void llenarVector(double[] vector) {
        int i;
        System.out.println("----El primer vector es : ----");
        for (i = 0; i < vector.length; i++) {
            vector[i] = Math.random() * 10;
            System.out.println("|" + vector[i] + "|");

        }
    }

    public static void ordenarVectorA(double[] vectorA) {
        System.out.println("----El vector ordenado es : ----");
        Arrays.sort(vectorA);

        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("|" + vectorA[i] + "|");
        }
    }

    public static void rellenoVectorB(double[] vectorA,double[] vectorB) {
        System.out.println("----El vector b es : ----");
        Arrays.sort(vectorA);
        for (int i = 0; i < vectorB.length; i++) {
            if (i < 10) {
                vectorB[i] = vectorA[i];
            } else {
                vectorB[i] = 0.5;

            }
            System.out.println("|" + vectorB[i] + "|");
        }
    }
}