import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ValoresConsola {
    public static void main(String[] args) {
        //Introducir valores por consola
        //Scanner consola = new Scanner(System.in); //in - input - entrada de datos
        //System.out.println("Escribe tu nombre: ");
        //var nombre = consola.nextLine(); // nextLine recupera la informacion consola
        //System.out.println("nombre = " + nombre);

        // Ejercicio Detalle de un Libro
        // Se solicita introducir la informacion del siguiente Libro (Titulo Autor)

        Scanner consola = new Scanner(System.in);
        System.out.println("Introduce el nombre del libro");
        String tituloLibro = consola.nextLine();
        System.out.println("Introduce el autor del libro");
        String autorLibro = consola.nextLine();
        System.out.println("El libro llamado "+tituloLibro+" Fue escrito por "
        + autorLibro);


    }
}
