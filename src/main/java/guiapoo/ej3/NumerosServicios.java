package guiapoo.ej3;

import java.util.Scanner;

public class NumerosServicios {
    Scanner leer = new Scanner(System.in);

    public Numeros crearOperacion(){
        Numeros op=new Numeros();
        System.out.println("Ingrese el primer numero");
        op.setNumero1( leer.nextInt());
        System.out.println("ingrese el segundo numero");
        op.setNumero2( leer.nextInt());
        return op;
    }

    public int suma (Numeros ope){
        return ope.getNumero1()+ope.getNumero2();
    }
    //f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public double resta(Numeros ope) {
        return  ope.getNumero1()-ope.getNumero2();
    }

    //g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.Si no, se hace la multiplicación y se devuelve el resultado al main
    public int multiplicacion(Numeros op) {
        if (op.getNumero1() != 0 && op.getNumero2() != 0) {
            return  op.getNumero1()*op.getNumero2();
        } else {
            System.out.println("error");
            return 0;
        }
    }

    //h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    public float division(Numeros num) {
        if ( num.getNumero2() == 0) {
            System.out.println("error");
            return 0;
        } else {
            return (float) num.getNumero1()/ num.getNumero2();
        }

    }
}
