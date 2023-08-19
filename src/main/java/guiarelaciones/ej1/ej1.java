package guiarelaciones.ej1;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Person p, p1;
        Dog d, d1;
        d = new Dog("Fer", "Pitbull", 2, "Mediano");
        d1 = new Dog("Lola", "Labrador", 1, "Grande");
        System.out.println(d.toString());
        System.out.println(d1.toString());
        p = new Person("Claudio", "Tolosa", 24, 30241575, d1);
        p1 = new Person("Germán", "Himmelfreundpointner", 28, 30240570, d);
        System.out.println(p.toString());
        System.out.println(p1.toString());
    }
    }

