package guiapoo.desafio3;

import java.util.ArrayList;
import java.util.List;

public class desafio3 {
    public static void main(String[] args) {
        Cliente cliente1=new Cliente();
        ServicioCliente servCliente=new ServicioCliente();
        List<Cliente> lista=new ArrayList<>();

        lista.add(servCliente.crearCliente());
        servCliente.obtenerCliente(lista);





    }
}
