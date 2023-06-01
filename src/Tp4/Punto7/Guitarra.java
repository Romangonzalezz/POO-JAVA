package Tp4.Punto7;

public abstract class Guitarra extends Instrumento{
    public Guitarra(String tipo) {
        super(tipo);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra...");
    }
}
