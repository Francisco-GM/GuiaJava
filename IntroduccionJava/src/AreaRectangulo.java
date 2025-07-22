import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        // Definicion de variables
        Scanner console = new Scanner(System.in);
        System.out.println("Bienvenido este programa calcula el area de un Rectangulo");
        System.out.print("Introduce la altura del rectangulo");
        var altura = Double.parseDouble(console.nextLine());
        System.out.println("Introduce la base del rectangulo");
        var base = Double.parseDouble(console.nextLine());
        // Realizamos el calculo del area
        var areaRectangulo = (base * altura );
        System.out.println("El area del Rectangulo es "+ areaRectangulo);
        // calculo perimetro de un Rectangulo
        var perimetroRectangulo = (base + altura) * 2;
        System.out.println("PerimetroRectangulo "+ perimetroRectangulo);

    }
}
