import java.util.Scanner;

public class PromedioCalificacion {
    public static void main(String[] args) {
        System.out.println("*** Promedio de Calificacion ***");

        //Declaracion del objeto Scanner y variables
        var consola = new Scanner(System.in);
        var suma = 0;
        var promedio = 0;
        System.out.print("Cuantas Calificaciones desea ingresar ?");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        int[] calificaciones = new int[largoArreglo];

        for(int i = 0; i < largoArreglo; i++){
            System.out.print("Calificaciones["+ i + "] = ");
            calificaciones[i] = Integer.parseInt(consola.nextLine());

        }

        for(int j = 0; j < calificaciones.length; j++){
            suma += calificaciones[j];
            promedio = suma/largoArreglo;
        }
        System.out.println(" El promedio de las calificaciones es: " +promedio);



    }
}
