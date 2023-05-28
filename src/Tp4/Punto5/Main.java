package Tp4.Punto5;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Legislador> legisladores = new ArrayList<>();

        legisladores.add(new Diputado("Roman", "Bahia blanca"));
        legisladores.add(new Senador("Noemi", "Bahia Blanca"));

        for (Legislador legislador : legisladores) {
            System.out.println(legislador.getNombre() + " trabaja en la cámara de " + legislador.getCamaraEnQueTrabaja());
        }
    }
}
