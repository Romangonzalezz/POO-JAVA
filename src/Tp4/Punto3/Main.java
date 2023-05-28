package Tp4.Punto3;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Roman");

        cuenta1.ingresarCantidad();
        System.out.println(cuenta1.getCantidad());

        cuenta1.retirarDinero();
        System.out.println(cuenta1.getCantidad());

    }
}
