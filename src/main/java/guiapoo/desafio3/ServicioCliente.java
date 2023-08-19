package guiapoo.desafio3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioCliente {
    Scanner leer = new Scanner(System.in);

    public void obtenerCliente(List listaClientes){
        System.out.println(listaClientes);
    }

    public Cliente crearCliente(){
        Cliente clie=new Cliente();

        System.out.println("ingrese el id");
        clie.setId(leer.nextInt());

        System.out.println("ingrese el nombre de la persona");
        clie.setNombre(leer.next());

        System.out.println("ingrese la edad");
        clie.setEdad(leer.nextInt());

        System.out.println("ingrese la altura");
        clie.setAltura(leer.nextDouble());

        System.out.println("ingrese el peso");
        clie.setPeso(leer.nextDouble());

        System.out.println("ingrese sus objetivos");
        clie.setObjetivos(leer.next());

        return clie;
    }
    public void actualizarCliente(){

    }

}
