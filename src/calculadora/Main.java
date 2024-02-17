package calculadora;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase principal que ejecuta la aplicación. Pide al usuario su edad y calcula los años que faltan
 * hasta su jubilación usando la clase Persona.
 * @autor Verónica Pinilla Gómez
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    boolean edadValida = false;
	while (!edadValida) {
        try {
            System.out.println("Ingrese su edad actual: ");
            int edad = scanner.nextInt();
            if (edad >= 0) {
                Persona persona = new Persona(edad);
                persona.calcularAnosHastaJubilacion();
                edadValida = true;
            } else {
                System.out.println("El número introducido no es correcto, debe ser mayor o igual a 0");
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, introduce un número entero válido.");
        scanner.next();
        }
    }
	scanner.close();
    }
}
