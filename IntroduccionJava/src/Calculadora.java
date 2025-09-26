import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //Titulo del programa
        System.out.println("*** Calculadora en java ***");

        //Declaracion de variables
        var resultado = 0.0;
        var salir = false;

        while (!salir){
            System.out.print("""
                    Menu:
                    1. Sumar
                    2. Restar
                    3. Dividir
                    4. Salir
                    Escoge una opcion \s""");
            var opcion = Integer.parseInt(new Scanner(System.in).nextLine());

            switch (opcion){
                case 1 -> {
                    System.out.println(" *** Ingresaste a la seccion de Suma *** ");
                    System.out.println("Ingrese el primer numero");
                    var numero1 = Double.parseDouble(new Scanner(System.in).nextLine());
                    System.out.println("Ingrese el segundo numero");
                    var numero2 = Double.parseDouble(new Scanner(System.in).nextLine());
                    resultado = numero1 + numero2;
                    System.out.println("La suma de los 2 numeros es: "+resultado);
                }

                case 2 -> {
                    System.out.println(" *** Ingresaste a la seccion de Resta *** ");
                    System.out.println("Ingrese el primer numero");
                    var numero1 = Double.parseDouble(new Scanner(System.in).nextLine());
                    System.out.println("Ingrese el segundo numero");
                    var numero2 = Double.parseDouble(new Scanner(System.in).nextLine());
                    resultado = numero1 - numero2;
                    System.out.println("El resultado de la resta es: "+resultado);
                }

                case 3 -> {
                    System.out.println(" *** Ingresaste a la seccion de Division *** ");
                    System.out.println("Ingrese el primer numero");
                    var numero1 = Double.parseDouble(new Scanner(System.in).nextLine());
                    System.out.println("Ingrese el segundo numero");
                    var numero2 = Double.parseDouble(new Scanner(System.in).nextLine());
                    resultado = numero1 / numero2;
                    System.out.println("La division entre los 2 numeros es "+resultado);
                }
                case 4 -> {
                    System.out.println("Saliendo de la calculadora....");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida... "+ opcion);
            }
            System.out.println();
        }

    }
}
