package Tp4.Punto5;

public abstract class Legislador extends Persona {
    private String provinciaQueRepresenta;

    public Legislador(String nombre,String provinciaQueRepresenta) {
        super(nombre);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public abstract String getCamaraEnQueTrabaja();


}
