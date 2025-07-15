import java.util.Scanner;

public class RegistroEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Registro Empleador ***");
        Scanner consola = new Scanner(System.in);
        System.out.print("Proporciona tu nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Proporciona tu edad: ");
        var edad = consola.nextLine();
        System.out.print("Proporciona tu sueldo (USD): ");
        var sueldo = consola.nextLine();
        System.out.print("Eres un empleado de confianza (true/false): ");
        var empleado = consola.nextLine();

        System.out.println("La informacion proporcionada es: "+"\n"+
        "Nombre: " + nombre + "\n" +
                "Edad: " + Integer.parseInt(edad) + "\n" +
                "Sueldo: " + Double.parseDouble(sueldo) + "\n" +
                "Empleado de confianza: " + Boolean.parseBoolean(empleado) + "\n");
    }
}
