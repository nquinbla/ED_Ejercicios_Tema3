package K_CuentaBancaria;

import java.util.Date;

public class CuentaPlazoFijo extends CuentaBancaria {
    private Date fechaVencimiento;

    public CuentaPlazoFijo(String nombreTitular, Date fechaApertura, String numeroCuenta, double saldo, Date fechaVencimiento) {
        super(nombreTitular, fechaApertura, numeroCuenta, saldo);
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public void retirarDinero(double cantidad) {
        if (saldo >= cantidad) {
            if (new Date().before(fechaVencimiento)) {
                saldo -= cantidad * 1.05;  // Penalización del 5%
            } else {
                saldo -= cantidad;
            }
        }
    }
}
