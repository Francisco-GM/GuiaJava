import java.util.Objects;
import java.util.Scanner;
public class EjerIdentificarNumeroMayor {
    public static void main(String[] args) {
        // Identificar el Mayor de 2 numeros
        // Se solicita hacer un programa que solicite 2 numeros y que identifique el mayor de ellos
        // Ej. numero1 = 5  numero2 = 20  El numero mayor es : 20

        var consola = new Scanner(System.in);
        System.out.println("*** Binvenido al programa para saber que nuemero es mayor que otr ***");
        System.out.println("Ingrese el primer numero");
        var numero1 = Double.parseDouble(consola.nextLine());
        System.out.println("Ingrese el segundo numero");
        var numero2 = Double.parseDouble(consola.nextLine());

        if(numero1 > numero2){
            System.out.println("El numero mayor es: "+numero1);
        } else if(numero1 == numero2){
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("El numero mayor es: "+numero2);
        }
        consola.close();

        // Operador ternadiro
        System.out.println("Valor con operador ternario :" + (numero1 > numero2 ? numero1 : numero2));
    }
}
