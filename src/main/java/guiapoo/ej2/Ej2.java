package guiapoo.ej2;

public class Ej2 {
    public static void main(String[] args) {
        CircunsferenciaServicio Servicio=new CircunsferenciaServicio();
        Circunsferencia Circuns= Servicio.CrearCircunsferencia();

        System.out.println("El area del circulo es: "+Servicio.CalculoArea(Circuns));
        System.out.println("El perimetro del circulo es:"+Servicio.CalculoPerimetro(Circuns));

    }
}
