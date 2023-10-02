import model.CuentaBancaria;

public class Ejercicio03 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("100000020", "Cuenta 01", 500);
        cuenta.mostrarSaldo();
        cuenta.depositar(150);
        cuenta.mostrarSaldo();
        cuenta.retirar(200);
        cuenta.mostrarSaldo();
    }
}
