import java.sql.SQLOutput;
import java.util.Scanner;
public class ConversionDatos {
    public static void main(String[] args) {
        // Conversion de tipos de datos
        var consola = new Scanner(System.in);
        //El usuario al momento de introducir el numero se guarda como String
        System.out.print("Numero 1: ");
        // El valor numero1 es String lo queremos convertir a int
        //var numero1 = Integer.parseInt(consola.nextLine()); Opcion 1 no la mejor
        var numero1 = consola.nextLine();
        System.out.print("Numero 2: ");
        var numero2 = consola.nextLine();
        // Opcion 2 la mejor recomendacion se realizo el parseo en una linea de codigo
        var resultado = Integer.parseInt(numero1) + Integer.parseInt(numero2);
        System.out.println("Resultado: "+ resultado);

        // Sin el parseo solo se concatena los valores Ej.
        var concatenacion = numero1 + numero2;
        System.out.print("Concatenacion: "+ concatenacion);
    }
}
