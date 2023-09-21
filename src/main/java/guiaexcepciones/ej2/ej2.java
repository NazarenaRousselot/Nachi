package guiaexcepciones.ej2;

import java.util.ArrayList;
import java.util.List;

public class ej2 {
    public static void main(String[] args) {
        List<Integer> myLista = new ArrayList<>();
        myLista.add(4);
        myLista.add(199);

        int [] numeros ={3, 4, 6};
        int [] nums = new int[4];



        try{
            System.out.println(numeros[3]);
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("No existe la posicion seleccionada");
        }

    }
}
