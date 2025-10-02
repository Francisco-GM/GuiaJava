import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        //Un arreglo nos permite almacenar multiples valores en una sola variable

        // Declarar un arreglo

        int[] enteros;
        // Inicializamos
        enteros = new int[5];

        // declarar el arreglo e inicializarlo
        int [] numeros = new int[3];

        // Modificacion valores en arreglos
        enteros[0] = 50;
        enteros[1] = 21;

        // Nota: no es necesario modificar todos los valores del arreglo.

        // Lectura de valores
        System.out.println("Valor 1 " + enteros[0]);
        System.out.println("Valor 2 " + enteros[1]);


        // Sintaxis simplificada de arreglos

        int[] enteros02 = {100,200,300,400,500};
        // accedemos a los elementos del arreglo
        System.out.println("Valor 1: " + enteros02[0]);
        System.out.println("Valor 2: " + enteros02[1]);
        System.out.println("Valor 3: " + enteros02[2]);
        System.out.println("Valor 4: " + enteros02[3]);
        System.out.println("Valor 5: " + enteros02[4]);

        // Imprime la direccion en memoria del arreglo
        System.out.println(enteros02);

        // Iterar los elementos de arreglo
        for(int i=0; i < enteros.length; i++ ) //.length regresa la longitud de nuestro arreglo
            System.out.println("Valor del indice " + i +" = "+enteros[i]);


        // Introducir valores a un arreglo
        var consola = new Scanner(System.in);
        // Declarar el arreglo
        System.out.print("Proporcionar el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        int[] enteros03 = new int[largoArreglo];
        //solicitamos los valores del arreglo
        for(int i = 0; i< largoArreglo; i ++) {
            System.out.println("Proporciona enteros[" + i + "] = ");
            enteros03[i] = Integer.parseInt(consola.nextLine());
        }
        // imprimir los valores del arreglo
        System.out.println("\nImpresion del Arreglo");

        for(int i=0; i<largoArreglo; i++){
            System.out.println("Enteros["+ i+"] = "+ enteros03[i]);
        }

    }
}
