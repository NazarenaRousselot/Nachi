package guiacolecciones.ej1;

import java.util.ArrayList;
import java.util.List;

public class ej1 {
    public static void main(String[] args) {

        perrosService serv=new perrosService();
        List<String> perros=serv.crearPerros();

        serv.mostrarLista((ArrayList<String>) perros);

        serv.alterarLista((ArrayList<String>) perros);

    }
}
