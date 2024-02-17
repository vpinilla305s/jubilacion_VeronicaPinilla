package calculadora;

/**
 * Representa a una persona con su edad y permite calcular los años que faltan hasta su jubilación.
 * La edad de jubilación se considera a los 67 años.
 * @autor Verónica Pinilla Gómez
 * @version 1.0
 */

public class Persona {
    private int edad;

    /**
     * Constructor por defecto.
     */
    public Persona() {
    }

    /**
     * Constructor que inicializa una instancia de Persona con una edad específica.
     * @param edad Edad de la persona.
     */
    public Persona(int edad) {
        this.edad = edad;
    }

    /**
     * Devuelve la edad de la persona.
     * @return Edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     * @param edad Nueva edad de la persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Calcula y muestra los años que faltan hasta la jubilación de la persona.
     * Si la persona ya alcanzó la edad de jubilación, muestra un mensaje de felicitación.
     */
    public void calcularAnosHastaJubilacion() {
        if (edad >= 67) {
            System.out.println("¡Felicidades! Ya estás jubilado.");
        } else {
            int anosRestantes = 67 - edad;

            if (anosRestantes < 10) {
            	System.out.printf("¡Solo te quedan %d años! ¡Vamos que ya queda poco!", anosRestantes);
            } else if (anosRestantes >= 10 && anosRestantes < 20) {
            	System.out.printf("Todavía te quedan %d años. ¡Ánimo!", anosRestantes);
            } else {
            	System.out.printf("Te quedan %d años. ¡A seguir trabajando gandul!", anosRestantes);
            }
        }
    }
}