package Tp4.Punto7;

public abstract class Instrumento {
    protected String tipo;

    public Instrumento(String tipo) {
        this.tipo = tipo;
    }

    public abstract void tocar();
}
