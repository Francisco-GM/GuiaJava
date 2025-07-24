import java.sql.SQLOutput;
import java.util.Scanner;

public class SentenciasDecision {
    public static void main(String[] args) {
        // sentencias Decision if /else if/ else
        // Revisar si un numero es positivo / negativo / cero
        //################################################################
        /*
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese un numero");
        var numero = Integer.parseInt(consola.nextLine());
        if (numero == 0){
            System.out.println(" El numero es cero "+numero);
        } else if (numero > 0) {
            System.out.println("El numero es positivo "+numero);
        } else {
            System.out.println("El numero es negativo "+numero);
        }
        consola.close();
        */



        //###############################################################
        /*
        // Comparacion  de cadenas en java
        var cadena1 = "Juan";
        var cadena2 = "Juan";
        Scanner consolaCadena = new Scanner(System.in);
        System.out.print("proporciona una cadena: ");
        var cadena3 = consolaCadena.nextLine();
        // Si proporcionamos juan dira que son distintas esto debido al == valida que sean el mismo objeto en memoria
        // como la cadena3 viene de consola se crea un nuevo objeto de memoria son diferentes
        // la solucion es compararlo con el metodo equals
        if (cadena1 == cadena3){

            System.out.println("Las cadenas son iguales (en referencia de memoria)");
        } else {
            System.out.println("Las cadenas son distintas (en referencia de memoria)");
        }


        //###################################################################
        // Comparacion usando el metopdo equals
        // Java es sensible en minusculas y Mayusculas
        // para comparar una cadena sin depender de minusculas y Mayusculas usamos equalsIgnoreCase
        if(cadena1.equalsIgnoreCase(cadena3)){
            System.out.println(" Las cademas son iguales en contenido");
        } else {
            System.out.println("las cadenas son distintas en contenido");
        }
        consolaCadena.close();
        */


        //###################################################################
        /*
        // Revisar si el usuario y password son correctos
        var consola = new Scanner(System.in);
        System.out.print("Cual es tu Susuario?");
        var usuario = consola.nextLine();
        System.out.print("Cual es tu Password?");
        var password = consola.nextLine();

        // Revisamos usuario = admin y password = 123
        var usuarioValido = "admin";
        var passwordValido = "123";
        if (usuarioValido.equals(usuario) && passwordValido.equals(password)){
            System.out.println("Sus credenciales son validas");
        } else if(usuarioValido.equals(usuario) && !passwordValido.equals(password)){
            System.out.println("El password es incorrecto");
        } else if(!usuarioValido.equals(usuario) && passwordValido.equals(password)){
            System.out.println("Usuario es incorrecto");
        } else {
            System.out.println("Credenciales Invalidas");
        }
        consola.close();

         */

        // ######################################################################
        //sentencia if y operador logico or
        //Sergio quiere asistir al juego de su hijo
        // pero solo puede asistir si tiene vacaciones o un dia de descanso

        var diaDescanso = true;
        var vacaciones = false;

        if(diaDescanso || vacaciones){
            System.out.println("Sergio puede asistir al juego de Mateo...");
        } else {
            System.out.println("Sergio esta ocupado, no puede ir al juego...");
        }

    }
}
