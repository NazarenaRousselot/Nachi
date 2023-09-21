package guiaexcepciones.ej2;

import guiacolecciones.ej3.Alumnos;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnosServicio {
    Scanner leer = new Scanner(System.in);
    ArrayList<Alumnos> listaAlumnos = new  ArrayList();
    public Alumnos crearAlumno() {
        Alumnos a = new Alumnos();
        ArrayList<Integer> aux = new ArrayList();

        System.out.println("Ingrese Nombre del Alumno: ");
        a.setNombre(leer.next());
        System.out.println("Ingrese la nota  ");
        a.setNotas(aux);
        return a;

}
}
