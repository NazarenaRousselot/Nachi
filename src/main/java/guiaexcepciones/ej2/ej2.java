package guiaexcepciones.ej2;

public class ej2 {
    public static void main(String[] args) {
        AlumnosServicio alumno1= new AlumnosServicio();

        try{
            alumno1.crearAlumno();
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("indice del arreglo fuera de rango");
        }

    }
}
