package guiapoo.ej5;

public class CuentaBancaria {
    private int NumeroCuenta;
    private float DNI;
    private int SaldoInicial;
    private double interes;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, float DNI, int saldoInicial, double interes) {
        NumeroCuenta = numeroCuenta;
        this.DNI = DNI;
        SaldoInicial = saldoInicial;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        NumeroCuenta = numeroCuenta;
    }

    public float getDNI() {
        return DNI;
    }

    public void setDNI(float DNI) {
        this.DNI = DNI;
    }

    public int getSaldoInicial() {
        return SaldoInicial;
    }

    public void setSaldoInicial(int saldoInicial) {
        SaldoInicial = saldoInicial;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "NumeroCuenta=" + NumeroCuenta +
                ", DNI=" + DNI +
                ", SaldoInicial=" + SaldoInicial +
                '}';
    }
}
