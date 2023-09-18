package guiapoo.ej1;
//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.

import java.util.Scanner;

public class guiapooej1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        libros l1=new libros();
        System.out.println(" Ingrese ISBN");
         l1.setISBN(leer.nextInt());
        System.out.println("ingrese el titulo del libro");
         l1.setTitulo(leer.next());
        System.out.println("ingrese el autor del libro");
         l1.setAutor(leer.next());
        System.out.println("ingrese el numero de paginas");
         l1.setPaginas(leer.nextInt());

        System.out.println(l1);

    }
}
