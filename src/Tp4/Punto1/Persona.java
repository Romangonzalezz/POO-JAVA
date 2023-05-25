package Tp4.Punto1;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String dni = "";

    private Sexo sexo;

    private float peso = 0.0f;

    private float altura = 0.0f;

    private static final Sexo SEXO_POR_DEFECTO = Sexo.HOMBRE;

    private static final int PESO_IDEAL = -1; // MENOR A 20
    private static final int POR_DEBAJO_PESO_IDEAL = 0; //DEBAJO PESO IDEAL
    private static final int SOBREPESO = 1; //SOBRE PESO

    public Persona() {
        this.sexo = SEXO_POR_DEFECTO;
    }

    public Persona(String nombre, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public Persona(String nombre, int edad, String dni,Sexo sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //PESO EN KG Y ALTURA EN MTS, CALCULAR PESO IDEAL
    public int calcularIMC() {

        double alturaEnMetros = altura / 100.0;
        double imc = peso / (alturaEnMetros * alturaEnMetros);

        if (imc < 20) {
            return POR_DEBAJO_PESO_IDEAL;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    //CALCULAR SI ES MAYOR DE EDAD
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    //COMPROBAR SEXO MEDIANTE CHAR
    private void comprobarSexo(char sexoChar) {
        if (sexoChar == 'H' || sexoChar == 'M') {
            this.sexo = (sexoChar == 'H') ? Sexo.HOMBRE : Sexo.MUJER; // SI SE INGRESA H, ES HOMBRE, SI SE INGRESA M MUJER.
        } else {
            this.sexo = Sexo.HOMBRE;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

}
