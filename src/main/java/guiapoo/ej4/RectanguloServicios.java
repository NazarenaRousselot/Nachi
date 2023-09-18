package guiapoo.ej4;

import java.util.Scanner;

public class RectanguloServicios {
    Scanner leer= new Scanner(System.in );
    public Rectangulo crearRectangulo(){
        Rectangulo crear=new Rectangulo();
        System.out.println("ingrese la base del rectangulo");
        crear.setBase(leer.nextDouble());
        System.out.println("ingrese la altura del rectangulo");
        crear.setAltura(leer.nextDouble());
        return crear;
    }
    public double superficie(Rectangulo sup){
        return (sup.getAltura()* sup.getBase());
    }
    public double area(Rectangulo area){
        return ((area.getAltura()+area.getBase())*2);
    }
    public void dibujar (Rectangulo dib){
        for (int i=0;i<dib.getAltura();i++){
            for(int j=0;j<dib.getBase();j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
