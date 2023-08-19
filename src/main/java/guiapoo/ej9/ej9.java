package guiapoo.ej9;

public class ej9 {
    public static void main(String[] args) {
        MatematicaServicios servicio=new MatematicaServicios();
        Matematica numeros= new Matematica();

        numeros.setNumero1( Math.random()*10);
        numeros.setNumero2(Math.random()*10);

        System.out.println(numeros);
        System.out.println(" el mayor de los numeros es: "+servicio.devolverMayor(numeros));
        System.out.println("la potencia del mayor numero elevado al menor es "+servicio.calcularPotencia(numeros));
        System.out.println("la raiz cuadrada del menor de los numeros es : "+servicio.raizCuadrada(numeros));
    }
}
