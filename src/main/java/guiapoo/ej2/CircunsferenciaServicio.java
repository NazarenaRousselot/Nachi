package guiapoo.ej2;

import java.util.Scanner;

public class CircunsferenciaServicio {
    Scanner leer= new Scanner(System.in);
    public Circunsferencia CrearCircunsferencia(){
        Circunsferencia radio= new Circunsferencia();
        System.out.println("ingrese el radio de las Circunferencia");
        radio.setRadio(leer.nextInt());
        return radio;
    }
    public double CalculoArea(Circunsferencia area){
        return ((area.getRadio()* area.getRadio())*3.1416);
    }
    public double CalculoPerimetro(Circunsferencia perimetro){
        return (perimetro.getRadio()*3.1416*2);
    }
}
