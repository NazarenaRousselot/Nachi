package guiapoo.ej9;

public class MatematicaServicios {
    public double devolverMayor(Matematica numero) {
        return (numero.getNumero1() > numero.getNumero2()) ? numero.getNumero1() : numero.getNumero2();
    }

    public double calcularPotencia(Matematica numero) {
        double num1 = Math.round(numero.getNumero1());
        double num2 = Math.round(numero.getNumero2());
        return (num1 > num2) ? Math.pow(num1, num2) : Math.pow(num2, num1);
    }

    public double raizCuadrada(Matematica numero) {
        double num1 = Math.round(numero.getNumero1());
        double num2 = Math.round(numero.getNumero2());
        return (num1 > num2) ? Math.sqrt(num2) : Math.sqrt(num1);
    }
}
