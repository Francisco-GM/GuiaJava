import java.util.Arrays;

public class Variables {
    public static void main(String[] args) {

        /*
        Variables en java: Una variable es un lugar de la memoria de la computadora donde guardamos un valor
        El valor almacenado puede cambiar con el tiempo, de allí su nombre: VARIABLE
        Sintaxis variable
        Tipo_variable nombre = valor;
        Ej.
        Int edad = 30;
        Double sueldo = 20300.50;
        String nombre = “Francisco”;
        */
        //Variables
        int edad = 30;
        Double sueldo = 20300.50;
        String nombre = "Francisco";
        // Acceder a los valores
        System.out.println("Edad: " + edad);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Nombre: " + nombre);
        // Modificar el valor de las variables
        edad = 35;
        sueldo = 6800.404;
        nombre = "Francisco Gonzalez";
        System.out.println("Edad Modificado: " + edad);
        System.out.println("Sueldo Modificado: " + sueldo);
        System.out.println("Nombre Modificacdo: " + nombre);

    }
}
