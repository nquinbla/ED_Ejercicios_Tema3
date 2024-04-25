package K_CuentaBancaria;

import java.util.Date;
import java.util.Random;

public class Main_K {
    public static void main(String[] args) {
        Random random = new Random();
        CuentaBancaria[] cuentas = new CuentaBancaria[3];

        cuentas[0] = new CuentaBancaria("Titular 1", new Date(), "1234567890", 1000);
        cuentas[1] = new CuentaPlazoFijo("Titular 2", new Date(), "2345678901", 2000, new Date(System.currentTimeMillis() + 86400000));  // Vence en 1 día
        cuentas[2] = new CuentaVip("Titular 3", new Date(), "3456789012", 3000, 500);

        for (int i = 0; i < 3; i++) {
            cuentas[i].ingresarDinero(random.nextDouble() * 1000);
            cuentas[i].retirarDinero(random.nextDouble() * 1000);
            cuentas[i].transferirDinero(cuentas[(i + 1) % 3], random.nextDouble() * 1000);
            System.out.println("Saldo de la cuenta " + (i + 1) + ": " + cuentas[i].saldo);
        }
    }
}