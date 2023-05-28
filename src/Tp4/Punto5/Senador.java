package Tp4.Punto5;

public class Senador extends Legislador{
    public Senador(String nombre, String provinciaQueRepresenta) {
        super(nombre, provinciaQueRepresenta);
    }
    @Override
    public String getCamaraEnQueTrabaja() {
        return "Senado";
    }
}
