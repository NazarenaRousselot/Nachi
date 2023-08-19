package guiapoo.ej4;

public class Ej4 {
    public static void main(String[] args) {
        RectanguloServicios servicio= new RectanguloServicios();
        Rectangulo rect=servicio.crearRectangulo();

        System.out.println("la superficie del rectangulo es:"+servicio.superficie(rect));
        System.out.println("el area del rectangulo es: "+servicio.area(rect));
        servicio.dibujar(rect);
    }
}
