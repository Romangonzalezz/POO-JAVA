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

            System.out.println("Ingrese su altura en centímetros:");
            float altura = scanner.nextFloat();

            System.out.println();

            Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

            Persona persona2 = new Persona(nombre, edad, sexo);

            Persona persona3 = new Persona();
            persona3.setNombre("Jeremias");
            persona3.setEdad(18);
            persona3.setSexo('H');
            persona3.setPeso(60);
            persona3.setAltura(150);


            persona1.calcularIMC(persona1);
            persona2.calcularIMC(persona2);
            persona3.calcularIMC(persona3);
            System.out.println();

            persona1.esMayorDeEdad();
            persona2.esMayorDeEdad();
            persona3.esMayorDeEdad();
            System.out.println();

            System.out.println(persona1.toString());
            System.out.println(persona2.toString());
            System.out.println(persona3.toString());

        }
}
