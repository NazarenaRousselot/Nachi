package guiacolecciones.ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoService {
    Scanner leer = new Scanner(System.in);
    ArrayList<Alumnos> listaAlumnos = new  ArrayList();

    public Alumnos crearAlumno() {
        Alumnos a = new Alumnos();
        ArrayList<Integer> aux = new ArrayList();

        System.out.println("Ingrese Nombre del Alumno: ");
        a.setNombre(leer.next());
        System.out.println("Ingrese primera Nota ");
        aux.add(leer.nextInt());
        System.out.println("Ingrese segunda Nota ");
        aux.add(leer.nextInt());
        System.out.println("Ingrese tercera Nota ");
        aux.add(leer.nextInt());

        a.setNotas(aux);
        return a;
    }
    public void crearLista(){
        String respuesta;
        do{
            listaAlumnos.add(crearAlumno());
            System.out.println("Desea agregar otro Alumno? S/N");
            respuesta = leer.next().toUpperCase();
        }while(respuesta.equals("S"));

    }

    public void mostrarLista(){

        System.out.println(listaAlumnos.toString());

    }

    public void calcularPromedio(){

        System.out.println("Ingrese nombre del Alumno");
        String aux = leer.next();
        double suma = 0;
        for (Alumnos listaAlumno : listaAlumnos) {
            if(listaAlumno.getNombre().equals(aux)){

                for (int i = 0; i < listaAlumno.getNotas().size(); i++) {
                    suma = suma + listaAlumno.getNotas().get(i);
                }
            }
        }
        System.out.println("El promedio es" + (suma/ 3));

    }

}



