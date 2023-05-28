package Tp4.Punto2;

public class Main {
    public static void main(String[] args) {

        Password password = new Password();
        password.setContrasenia("PruAbSFrueba");
        password.esFuerte(password.getContrasenia());

        Password password2 = new Password();
        password2.setContrasenia("PruAbruEba123456");
        password2.esFuerte(password2.getContrasenia());

        Password password3 = new Password();
        password3.generarPassword(8);
        password3.generarPassword(3);
        password3.generarPassword(10);


    }
}
