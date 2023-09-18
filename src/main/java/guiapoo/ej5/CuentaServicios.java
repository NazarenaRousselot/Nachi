package guiapoo.ej5;

import java.util.Scanner;

public class CuentaServicios {
    Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("ingrese el numero de cuenta");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese su dni");
        cuenta.setDNI(leer.nextFloat());
        System.out.println("ingrese el saldo inicial");
        cuenta.setSaldoInicial(leer.nextInt());
        return cuenta;
    }

    public double ingresar(double ingreso, CuentaBancaria cuenta) {
        return ingreso + cuenta.getSaldoInicial();
    }

    public double retirar(double retiro, CuentaBancaria cuenta) {
        if (retiro < cuenta.getSaldoInicial()) {
            return (cuenta.getSaldoInicial() - retiro);

        } else {
            return 0;
        }
    }

    public void extraccionRapida(double retiro, CuentaBancaria cuenta) {
        if (retiro <= 0.20 * cuenta.getSaldoInicial()) {
            System.out.println("dinero extraido");
        } else {
            System.out.println("imposible extraer");
        }

    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("su saldo es:" + cuenta.getSaldoInicial());

    }
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println(cuenta.toString());
    }
}
