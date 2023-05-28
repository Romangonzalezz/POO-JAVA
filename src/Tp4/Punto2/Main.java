package Tp4.Punto2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Password> arrayPasswords = new ArrayList<>();
        ArrayList<Boolean> esFuerte = new ArrayList<>();
        Password password = new Password();
        Scanner scanner = new Scanner(System.in);

        int capacidad = 0;
        int longi = 0;

        try {
            System.out.println("De qué capacidad deseas que sea tu array de Passwords?");
            capacidad = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Recuerda que el valor debe ser entero :)");
        }

        for (int i = 0; i < capacidad; i++) {
            arrayPasswords.add(null);
        }

        System.out.println("Se ha creado un arrayList con la capacidad de " + arrayPasswords.size());

        try {
            System.out.println("Cual es la longitud de las passwords que deseas generar?");
            longi = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Recuerda que el valor debe ser entero :)");
        }

        for (int i = 0; i < arrayPasswords.size(); i ++){
            arrayPasswords.set(i, password.generarPassword(longi));

            Password currentPassword = arrayPasswords.get(i);
            System.out.println();
            System.out.print("Contraseña generada: " + currentPassword.getContrasenia() + " -> ");
            System.out.print("Es fuerte? " + currentPassword.esFuerte(currentPassword.getContrasenia()));
        }

    }
}