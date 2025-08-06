import java.util.Scanner;

public class ProgramaMayorEdad {
    public static void main(String[] args) {
        /*
        Crea un programa para saber si una persona es mayor de edad
        Utiliza una constante para indicar el valor cuando una persona se considera mayor de edad

        Una persona se considera mayor de edad si ha cumplido 18 años

        si es mayor de edad debe imprimir:
        La persona con x años es mayor de edad

        si es menor de edad debe imprimir:
        La persona con x años es menor de edad
         */


        final int MAYOR_EDAD = 18;
        System.out.println("Ingrese su edad por favor: ");
        var edad = Integer.parseInt(new Scanner(System.in).nextLine());

        String mensaje = (edad >= MAYOR_EDAD) ? "La persona con " + edad + " años es mayor de edad." : "La persona con " + edad + " años es menor de edad.";
        System.out.println(mensaje);
    }
}
