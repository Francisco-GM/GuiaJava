import java.util.InputMismatchException; // Importar para manejar errores de tipo de entrada
import java.util.Scanner;
public class EjercicioPresentacionMejora {

        public static void main(String[] args) {
            Scanner consola = new Scanner(System.in);

            System.out.println("🌟 Bienvenido a tu carta de presentación 🌟\n");

            // --- Solicitar y validar nombre (String) ---
            System.out.print("Por favor, dime tu nombre: ");
            String nombre = consola.nextLine();

            // --- Solicitar y validar edad (int) ---
            int edad = 0;
            boolean edadValida = false;
            while (!edadValida) {
                System.out.print("Dime tu edad: ");
                try {
                    edad = consola.nextInt();
                    edadValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("⚠️ ¡Error! Por favor, ingresa un número entero para la edad.");
                    consola.next(); // Consumir la entrada no válida para evitar un bucle infinito
                }
            }
            consola.nextLine(); // Consumir el salto de línea pendiente después de nextInt()

            // --- Solicitar y validar si es hijo único (boolean) ---
            boolean hijoUnico = false;
            boolean hijoUnicoValido = false;
            while (!hijoUnicoValido) {
                System.out.print("¿Eres hijo único? (responde 'true' o 'false'): ");
                String respuestaHijoUnico = consola.nextLine();
                if (respuestaHijoUnico.equalsIgnoreCase("true") || respuestaHijoUnico.equalsIgnoreCase("false")) {
                    hijoUnico = Boolean.parseBoolean(respuestaHijoUnico);
                    hijoUnicoValido = true;
                } else {
                    System.out.println("⚠️ ¡Error! Por favor, responde 'true' o 'false'.");
                }
            }

            // --- Solicitar bebida favorita (String) ---
            System.out.print("¿Cuál es tu bebida favorita? ");
            String bebidaFavorita = consola.nextLine();

            // --- Solicitar y validar precio bebida favorita (float) ---
            float precioBebida = 0.0f;
            boolean precioValido = false;
            while (!precioValido) {
                System.out.print("¿Cuánto cuesta tu bebida? (ej. 15.50): ");
                try {
                    precioBebida = consola.nextFloat();
                    precioValido = true;
                } catch (InputMismatchException e) {
                    System.out.println("⚠️ ¡Error! Por favor, ingresa un número decimal para el precio (ej. 12.34).");
                    consola.next(); // Consumir la entrada no válida
                }
            }
            consola.nextLine(); // Consumir el salto de línea pendiente

            // --- Imprimir la carta de presentación ---
            System.out.println("\n--- 🎉 Tu Carta de Presentación 🎉 ---");
            System.out.println("Hola, mi nombre es " + nombre + ".");
            System.out.println("Tengo " + edad + " años.");
            System.out.println("¿Soy hijo único? La respuesta es: " + hijoUnico + ".");
            System.out.println("Mi bebida favorita es " + bebidaFavorita + ".");
            System.out.printf("La cual me costó un total de $%.2f.\n", precioBebida); // Formato para el precio
            System.out.println("¡Espero les haya gustado mi presentación!\nSaludos 👋");

            consola.close(); // Siempre cierra el Scanner al finalizar
        }

}
