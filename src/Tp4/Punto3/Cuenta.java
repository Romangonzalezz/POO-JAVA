package Tp4.Punto3;

import java.util.Scanner;

public class Cuenta {
    private String titular;
    private double cantidad;

    public void ingresarCantidad(){
        double cantidad_a_ingresar;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Cantidad a ingresar?: ");
            cantidad_a_ingresar = scanner.nextFloat();
            if (cantidad_a_ingresar < 0){
                return;
            }
            this.cantidad = cantidad_a_ingresar;
        }catch(Exception e){
            System.out.println("Algo salio mal...");
        }
    }

    public void retirarDinero(){
        double cantidad_a_retirar;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Cantidad que deseas retirar?: ");
            cantidad_a_retirar = scanner.nextFloat();
            this.cantidad = this.cantidad - cantidad_a_retirar;
            if (this.cantidad - cantidad_a_retirar < 0){
                System.out.println("Error tu cuenta no puede retirar esa cantidad.");
                return;
            }
        }catch(Exception e){
            System.out.println("Algo salio mal...");
        }
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        System.out.print("$");
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}