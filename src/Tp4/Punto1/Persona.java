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

    public Persona() {
        generarDni();
    };

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        generarDni();
    };
    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        generarDni();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    };

    //PESO EN KG Y ALTURA EN MTS, CALCULAR PESO IDEAL
    public int calcularIMC(Persona persona) {

        double alturaEnMetros = persona.getAltura() / 100.0;
        double imc = persona.getPeso() / (alturaEnMetros * alturaEnMetros);

        if (persona.getAltura() == 0 || persona.getPeso() == 0){
            System.out.println("\n Imposible calcular sin el valor altura o peso. \n");
            return 0;
        }

        if (imc < 20) {
            System.out.println(persona.getNombre() + " Esta por debajo del peso ideal");
            return POR_DEBAJO_PESO_IDEAL;
        } else if (imc >= 20 && imc <= 25) {
            System.out.println(persona.getNombre() + " Esta en su peso ideal");
            return PESO_IDEAL;
        } else {
            System.out.println(persona.getNombre() + " Esta en sobrepeso");
            return SOBREPESO;
        }
    }

    //CALCULAR SI ES MAYOR DE EDAD
    public boolean esMayorDeEdad() {
        boolean esMayor = edad >= 18;
        if (esMayor) {
            System.out.println("Es mayor de edad!");
        } else {
            System.out.println("Es menor de edad!");
        }
        return esMayor;
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

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return  "\n" +
                "Nombre=" + nombre + "\n" +
                " Edad=" + edad + "\n" +
                " Dni=" + dni + "\n" +
                " Sexo=" + sexo + "\n" +
                " Peso=" + peso + "\n" +
                " Altura=" + String.format("%.2f", altura);
    }

}
