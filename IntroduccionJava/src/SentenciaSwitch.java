import java.util.Scanner;

public class SentenciaSwitch {
    public static void main(String[] args) {
        // Mejoras de la sentencia switch
        // Dia de la semana  (1 - 7)
        System.out.println("Proporciona el dia de la semana: ");
        var diaSemana = Integer.parseInt(new Scanner(System.in).nextLine()); // Aqui mismo creamos el objeto y al mismo tiempo estamos accediendo a otra funcionalidad del metodo

        // switch mejorada
        switch (diaSemana){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Valor del dia erroneo: " +diaSemana);


        }


    }
}
