package Tp4.Punto6;

public class Superheroe extends Persona{
    private String nombFicticio;
    private String tipoPoder;

    public Superheroe(String nombre, Float altura, String nombFicticio, String tipoPoder) {
        super(nombre,altura);
        this.nombFicticio = nombFicticio;
        this.tipoPoder = tipoPoder;
    }

    @Override
    public String toString() {
        return "Superheroe{" +
                "nombFicticio='" + nombFicticio + '\'' +
                ", tipoPoder='" + tipoPoder + '\'' +
                ", nombre='" + nombre + '\'' +
                ", altura=" + altura +
                '}';
    }
}
