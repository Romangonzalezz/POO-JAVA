package Tp4.Punto5;

public class Diputado extends Legislador{
    public Diputado(String nombre, String provinciaQueRepresenta) {
        super(nombre, provinciaQueRepresenta);
    }
    @Override
    public String getCamaraEnQueTrabaja() {
        return "Diputados";
    }
}
