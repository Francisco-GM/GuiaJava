import java.util.Scanner;
public class EjercicioPresentacion {
    public static void main(String[] args) {
        // Ejercicio Presentacion
        /*
        En este ejemplo se te solicitaran varios valores para presentarte.

- Sin embargo deberas convertir los valores al tipo de dato solicitado
* nombre -> String
* edad -> Int
* hijo unico -> Boolean
* Bebida Favorita  -> String
* Precio bebida Favorita -> float

- Al final se debe imprimir cada valor
        * */
        Scanner consola = new Scanner(System.in);
        System.out.println("Bienvenido a tu carta de presentacion");
        System.out.println("Por favor dime tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Dime tu edad: ");
        var edad = consola.nextLine();
        System.out.println("Eres hijo unico ?");
        var hijoUnico = consola.nextLine();
        System.out.println("Cual es tu bebida favorita?");
        var bebidaFavorita = consola.nextLine();
        System.out.println("Cuanto cuesta tu bebida?");
        var precioBebida = consola.nextLine();
        System.out.println("Muy bien a acontinuasion te mostramos tu carta de presentacion");
        System.out.println("Hola mi nombre es " + nombre + "\n" +
                "tengo "+ Integer.parseInt(edad) + " años" + "\n" +
                "Soy hijo unico la respuesta correcta es "+ Boolean.parseBoolean(hijoUnico) + "\n" +
                "Mi bebida favorita es "+ bebidaFavorita + "\n" +
                "La cual me costo un total de "+ Float.parseFloat(precioBebida) + "\n" +
                "Espero les haya gustado mi presentacion" + "\n" +
                "Saludos!!");
        consola.close(); // Siempre cierra el Scanner al finalizar


    }
}
