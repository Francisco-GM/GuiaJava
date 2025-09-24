import java.util.Scanner;

public class EjercicioMenu {
    public static void main(String[] args) {
        // Menu interactivo
        System.out.print("*** Sistema de Administracion de cuentas");

        var salir = false;
        while(!salir){
            // Para no colocar muchas veces linea de imprimir se agrega un bloque de texto con 3 comillas
            System.out.print("""
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir del sistema
                    Escoge una opcion:\s""");
            var opcion = Integer.parseInt(new Scanner(System.in).nextLine());
            switch(opcion){
                case 1 -> System.out.println("Creando tu cuenta...");
                case 2 -> System.out.println("Eliminando tu cuenta...");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto...");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida: " + opcion);
            }
            System.out.println();
        }
    }
}
