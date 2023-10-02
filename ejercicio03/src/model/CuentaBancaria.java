package model;

public class CuentaBancaria {
    private String numeroCuenta;
    private String nombre;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String nombre, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo Actual: " + this.saldo);
    }

    public void depositar(double monto) {
        System.out.println("Depositando: " + monto);
        this.saldo = saldo + monto;
    }

    public void retirar(double monto) {
        System.out.println("Retirando: " + monto);
        this.saldo = saldo - monto;
    }
}
