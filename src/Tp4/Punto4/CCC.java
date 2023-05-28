package Tp4.Punto4;

import java.util.Random;

public class CCC {
    private double saldoDeCuenta;
    private String nombreTitular;
    private long numeroDeCuenta;

    public void setIngreso(double cantidad) {
        saldoDeCuenta += cantidad;
        System.out.println("Se ha realizado un ingreso de " + cantidad + "$ en la cuenta de " + nombreTitular);
    }

    public void setReintegro(double cantidad) {
        if (saldoDeCuenta >= cantidad) {
            saldoDeCuenta -= cantidad;
            System.out.println("Se ha realizado un reintegro de " + cantidad + "$ de la cuenta de " + nombreTitular);
        } else {
            System.out.println("Saldo insuficiente en la cuenta de " + nombreTitular);
        }
    }

    public void RealizarTransferenciaEntreCuentas(CCC titular1, CCC titular2, double cantidad){
        titular1.setReintegro(cantidad);
        titular2.setIngreso(cantidad);
    }

    public double getSaldoDeCuenta() {
        return saldoDeCuenta;
    }

    public String getDatosCuenta() {
        String getDatosCuenta = "Titular: " + nombreTitular + "\nSaldo: " + saldoDeCuenta + "\nNumero de cuenta: " + numeroDeCuenta;
        return getDatosCuenta;
    }


    public CCC(double saldoDeCuenta, String nombreTitular) {
        Random random = new Random();
        long numeroRandom = random.nextLong(10);

        this.saldoDeCuenta = saldoDeCuenta;
        this.nombreTitular = nombreTitular;
        this.numeroDeCuenta = numeroRandom;
    }

}
