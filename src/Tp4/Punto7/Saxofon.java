package Tp4.Punto7;

public abstract class Saxofon extends Instrumento{
    public Saxofon(String tipo){
        super(tipo);
    }

    @Override
    public void tocar(){
        System.out.println("Tocando saxofon....");
    }
}
