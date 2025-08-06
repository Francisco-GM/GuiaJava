import java.util.Scanner;
public class EstacionYear {
    public static void main(String[] args) {
        // Identificar la estacion del año
        /* Se solicita proporcionar el valor de un mes (valor numerico entre 1 y 12)
        e indicar la estacion del año segun lo siguiente

        meses 1,2, o 12 -> Invierno
        meses 3,4 o 5 -> primavera
        meses 6,7 u 8 -> Verano
        meses 9,10 o 11 -> Otoño
        Cualquier otro valor -> estacion desconocida
         */
        System.out.println("Estacion del año");
        var consola = new Scanner(System.in);
        System.out.println("Favor de ingresar el numero de mes que te encuentras actualmente");
        var mes = Integer.parseInt(consola.nextLine());

        // Sentencia Switch
        switch(mes){ //agregamos el valor a evaluar
            case 1: case 2: case 12:
                System.out.println("La estacion es invierno");
                break;
            case 3: case 4: case 5:
                System.out.println("La estacion es primavera");
                break;
            case 6: case 7: case 8:
                System.out.println("La estacion es verado");
                break;
            case 9: case 10: case 11:
                System.out.println("La estacion es Otoño");
                break;

            default:
                System.out.println("Estacion desconocida...");
        }




        /*
            Ejemplo de la sentencia IF

        if (mes >= 1 || mes <= 2 || mes == 12){
            System.out.println("El mes "+ mes +" Pertenece a la estacion de Invierno");
        }else if(mes >= 3 && mes <= 5){
            System.out.println("El mes "+ mes +" Pertenece a la estacion de Primavera");

        } else if(mes >= 6 && mes <= 8){
            System.out.println("El mes "+ mes +" Pertenece a la estacion de Verano");
        } else if(mes >= 9 && mes <= 11){
            System.out.println("El mes "+ mes +" Pertenece a la estacion de Otoño");
        } else {
            System.out.println("Estacion desconocida");
        }

         */
    }
}
