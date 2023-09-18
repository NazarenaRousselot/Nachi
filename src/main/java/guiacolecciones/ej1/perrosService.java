package guiacolecciones.ej1;

import java.util.*;

public class perrosService {
    Scanner leer = new Scanner(System.in);
    ArrayList<String> perros = new ArrayList<>();

    public ArrayList<String> crearPerros() {
        String rta;
        do {
            System.out.println("ingrese la raza del perro");
            String raza = leer.next();
            perros.add(raza);
            System.out.println("quiere guardar otra raza?si/salir");
            rta = leer.next();

        } while (rta.equals("si"));

        return perros;
    }

    public void mostrarLista(ArrayList<String> lista) {
        lista.forEach(animal-> System.out.println(animal));

    }

    public void alterarLista(ArrayList<String> lista) {
        System.out.println("ingrese un raza a buscar");
        String raza = leer.next();
         int tamaño=lista.size();

        for (int i = 0; i < tamaño-1; i++) {
            String r = lista.get(i);
            if (r.equals(raza)) {
                lista.remove(r);
                }
            }

        if (tamaño == lista.size()) System.out.println("la raza no esta en la lista");

        Collections.sort(lista);

        lista.forEach(animal-> System.out.println(animal));
        }
    }

