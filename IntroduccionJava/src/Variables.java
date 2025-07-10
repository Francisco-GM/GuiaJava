import java.util.Arrays;

public class Variables {
    public static void main(String[] args) {

        /*
        Variables en java: Una variable es un lugar de la memoria de la computadora donde guardamos un valor
        El valor almacenado puede cambiar con el tiempo, de allí su nombre: VARIABLE
        Sintaxis variable
        Tipo_variable nombre = valor;
        Ej.
        Int edad = 30;
        Double sueldo = 20300.50;
        String nombre = “Francisco”;
        */
        /*
        El nombre de una variable debe seguir las siguientes reglas:

        Puede tener letras (mayusculas o minusculas), digitos ( 0 a 9) o los simbolos de guiones bajo ( _ ) o signo de dolar ($)
        El primer caracter No debe ser un digito
        No se permite espacios entre caracteres
        No se pueden usar palabras clave (Keywords, ej. Int, for, new, etc)
        Los nombres son sensibles a mayúsculas / minusculas
        */
        //Variables
        int edad = 30;
        Double sueldo = 20300.50;
        String nombre = "Francisco";
        // Acceder a los valores
        System.out.println("Edad: " + edad);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Nombre: " + nombre);
        // Modificar el valor de las variables
        edad = 35;
        sueldo = 6800.404;
        nombre = "Francisco Gonzalez";
        System.out.println("Edad Modificado: " + edad);
        System.out.println("Sueldo Modificado: " + sueldo);
        System.out.println("Nombre Modificacdo: " + nombre);

        // Ej. Var
        /*
        Var sirve para inferir el tipo de dato al definir variables en java
        Ej. sin var
        Int edad = 10;
        Ej. con var
        Var edad = 10:
        El tipo es in y se infiere por el valor que se uso

        Var lo podemos usar para cualquier tipo con algunas restricciones.
        */
        var edad_var = 27;
        var sueldo_var = 30000.400;
        var nombre_var = "Francisco var";
        System.out.println("Edad Modificado: " + edad_var);
        System.out.println("Sueldo Modificado: " + sueldo_var);
        System.out.println("Nombre Modificacdo: " + nombre_var);



        //La concatenación es la unión de dos o más cadenas.
        //Ej.
        var nombreLaura = "Laura";
        var apellidoLaura = "Sanchez";
        //Concatenacion
        var nombreCompleto = nombreLaura +" "+ apellidoLaura;
        //Resultado
        System.out.println(nombreCompleto);



    }
}
