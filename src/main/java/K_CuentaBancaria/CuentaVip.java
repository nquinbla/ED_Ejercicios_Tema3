package K_CuentaBancaria;

import java.util.Date;

public class CuentaVip extends CuentaBancaria {
    private double saldoNegativoMaximo;

    public CuentaVip(String nombreTitular, Date fechaApertura, String numeroCuenta, double saldo, double saldoNegativoMaximo) {
        super(nombreTitular, fechaApertura, numeroCuenta, saldo);
        this.saldoNegativoMaximo = saldoNegativoMaximo;
    }

    @Override
    public void retirarDinero(double cantidad) {
        if (saldo - cantidad >= -saldoNegativoMaximo) {
            saldo -= cantidad;
        }
    }
}
