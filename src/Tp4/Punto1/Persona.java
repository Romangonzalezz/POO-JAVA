package Tp4.Punto1;

//RANDOM PARA NUMERO ALEATORIO 8 CIFRAS
import java.util.Random;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String dni = "";

    private char sexo;

    private float peso = 0.0f;

    private float altura = 0.0f;
    private static final int PESO_IDEAL = -1; // MENOR A 20
    private static final int POR_DEBAJO_PESO_IDEAL = 0; //DEBAJO PESO IDEAL
    private static final int SOBREPESO = 1; //SOBRE PESO

    final int divisor = 23;

    Random random = new Random();

    public Persona() {};

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    };
    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = "";
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    };

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
    public void comprobarSexo(char sexoChar) {
        if (sexoChar == 'H' || sexoChar == 'M') {
            this.sexo = sexoChar;
        } else {
            this.sexo = 'H';
        }
    }

    private void generarDni() {
        //Generamos un número de 8 digitos
        int numero_aleatorio = random.nextInt(90000000) + 10000000;
        int res = numero_aleatorio - (numero_aleatorio / divisor * divisor);

        //Calculamos la letra del DNI
        char letraDNI = generarLetraDNI(res);

        //Pasamos el dni a String
        dni = Integer.toString(numero_aleatorio) + letraDNI;
    }

    private char generarLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[res];
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + String.format("%.2f", altura) +
                '}';
    }

}
