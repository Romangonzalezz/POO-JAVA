package Tp4.Punto7;

public abstract class Violin extends Instrumento{
    public Violin(String tipo){
        super(tipo);
    }

    @Override
    public void tocar(){
        System.out.println("Tocando violin....");
    }
}
