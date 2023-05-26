package Tp4.Punto1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            ingresarDatos();

        }


        public static void ingresarDatos(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Cual es tu nombre?");
            String nombre = scanner.next();

            System.out.println("Cual es tu edad?");
            int edad = scanner.nextInt();

            System.out.println("Sexo? (H/M)");
            char sexo = scanner.next().charAt(0);

            System.out.println("Peso?");
            float peso = scanner.nextFloat();

            System.out.println("Altura?");
            float altura = scanner.nextFloat();

            Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

            Persona persona2 = new Persona(nombre, edad, sexo);

            Persona persona3 = new Persona();
            persona3.setNombre("Jeremias");
            persona3.setEdad(18);
            persona3.setSexo('H');
            persona3.setPeso(60);
            persona3.setAltura(1.70f);



        }
}
