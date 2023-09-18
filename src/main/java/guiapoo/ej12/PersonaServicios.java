package guiapoo.ej12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicios {
    Scanner leer = new Scanner(System.in);

    public Persona crearPersona(){
        Date date = new Date();

        Persona personita=new Persona();
        String fechanac= "";
        System.out.println("ingrese el nombre de la persona");
        personita.setNombre(leer.next());
        System.out.println("ingrese la fecha de nacimiento en formato año/mes/dia");
        fechanac=leer.next();
        SimpleDateFormat DateFor = new SimpleDateFormat(fechanac);
        String stringDate= DateFor.format(date);
        personita.setFechaNacimiento(stringDate);

        return personita;
    }
}
