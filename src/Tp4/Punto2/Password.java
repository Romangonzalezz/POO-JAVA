package Tp4.Punto2;
import java.util.Random;


public class Password {
    private String contrasenia;
    private int longitud = 8;

    Random random = new Random();
    public Password() {
    }

    public Password(int longitud) {
        this.longitud = random.nextInt(longitud);
    }

    public boolean esFuerte(String contrasenia) {
        int contador_mayus = 0;
        int contador_minus = 0;
        int contador_numeros = 0;

        for (int i = 0; i < contrasenia.length(); i++) {
            char c = contrasenia.charAt(i);

            if (Character.isUpperCase(c)) {
                contador_mayus++;
            } else if (Character.isLowerCase(c)) {
                contador_minus++;
            } else if (Character.isDigit(c)) {
                contador_numeros++;
            }
        }

        System.out.println("Mayúsculas: " + contador_mayus);
        System.out.println("Minúsculas: " + contador_minus);
        System.out.println("Números: " + contador_numeros);

        if (contador_mayus > 2 && contador_minus > 1 && contador_numeros > 5) {
            System.out.println("Su contraseña es lo suficientemente fuerte. ¡Bien hecho!");
            System.out.println();
            return true;
        } else {
            System.out.println("Su contraseña es demasiado débil. ¡Inténtelo de nuevo!");
            System.out.println();
            return false;
        }
    }

    public String generarPassword(int longitud){
        Random randomPass = new Random();
        String pass = "";
        for(int i = 0; i < longitud; i++){

            int randomIndex = randomPass.nextInt(longitud);
            pass += randomIndex;
        }
        System.out.println();
        System.out.println("Su contrasenia aleatoria es: " + pass);
        return pass;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }
}
