package K_CuentaBancaria;

import java.util.Date;

public class CuentaBancaria {
    protected String nombreTitular;
    protected Date fechaApertura;
    protected String numeroCuenta;
    protected double saldo;

    public CuentaBancaria(String nombreTitular, Date fechaApertura, String numeroCuenta, double saldo) {
        this.nombreTitular = nombreTitular;
        this.fechaApertura = fechaApertura;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void retirarDinero(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        }
    }

    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    public void transferirDinero(CuentaBancaria cuentaDestino, double cantidad) {
        if (saldo >= cantidad) {
            retirarDinero(cantidad);
            cuentaDestino.ingresarDinero(cantidad);
        }
    }
}
