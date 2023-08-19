package guiapoo.ej3;

public class guiapooej3 {
    public static void main(String[] args) {

        NumerosServicios miServicios= new NumerosServicios();

        Numeros oper = miServicios.crearOperacion();

        System.out.println("la suma es: " +miServicios.suma(oper));
        System.out.println("la resta es : "+miServicios.resta(oper));
        System.out.println("la mutiplicacion es: "+miServicios.multiplicacion(oper));
        System.out.println("la division es: "+miServicios.division(oper));


    }
}
