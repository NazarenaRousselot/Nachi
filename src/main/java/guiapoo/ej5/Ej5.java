package guiapoo.ej5;

public class Ej5 {
    public static void main(String[] args) {
        CuentaServicios servicio=new CuentaServicios();
        CuentaBancaria cuenta=servicio.crearCuenta();

        System.out.println("saldo actual:"+servicio.ingresar(200,cuenta));
        System.out.println("saldo actual:"+servicio.retirar(200,cuenta));
        servicio.extraccionRapida(200,cuenta);
        servicio.consultarSaldo(cuenta);
        servicio.consultarDatos(cuenta);
    }
}
