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

        for (int i = 0; i < this.contrasenia.length(); i++) {
            char c = this.contrasenia.charAt(i);

            if (Character.isUpperCase(c)) {
                contador_mayus++;
            } else if (Character.isLowerCase(c)) {
                contador_minus++;
            } else if (Character.isDigit(c)) {
                contador_numeros++;
            }
        }

        if (contador_mayus > 2 && contador_minus > 1 && contador_numeros > 5) {
            return true;
        } else {
            return false;
        }
    }

    public Password generarPassword(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int randomIndex = random.nextInt(caracteres.length());
            char randomChar = caracteres.charAt(randomIndex);
            sb.append(randomChar);
        }

        Password password = new Password();
        password.setContrasenia(sb.toString());

        return password;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "\n" +
                "Password{" +
                "contrasenia='" + contrasenia + '\'' +
                '}' + "\n";
    }
}
