import java.util.Scanner;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        // Operadores Relacionales (Comparacion)

        int a = 3, b = 2;
        // igualdad ==
        var resultado = a ==b; // regresara un valor logico
        System.out.println("Resultado a == b: " +resultado);
        // Distinto !=
        resultado = a != b;
        System.out.println("Resultado de a !=b: "+resultado);
        // Mayor que
        resultado = a > b;
        System.out.println("El resultado de a >b: "+ resultado);
        // mayor o igual que
        resultado = a >=b;
        System.out.println("Resultado de a >=b:" +resultado);
        //Menor que
        resultado = a<b;
        System.out.println("Resultado de a<b : "+ resultado);
        // Menor o igual que
        resultado = a<=b;
        System.out.println("Resultado de a<=b : "+resultado);

        //Operadores Logicos
        //Operador And (&&)
        boolean a1 = true, b1 =false;
        // and (regresa true si ambos valores son true)
        var resultadoAnd = a1 && b1;
        System.out.println("Resultado de a1 && b1 " +resultadoAnd);

        // Operador || (OR)
        boolean a2 = true, b2 = false;
        var resultadoOr = a2 || b2;
        System.out.println("Resultado de a2 || b2: "+resultadoOr);

        // Operador ! (not) (invierte el valor logico)

       var resultadoNot =!a2;
        System.out.println("!a2: "+resultadoNot);

        // Asignacion =
        var miNumero = 10;
        int miNumero2; // Declaracion
        miNumero2 = 5;
        // Asignacion Compuesto
        // +=
        miNumero += 5; // miNumero = miNumero +5;
        System.out.println("miNumero =" + miNumero);
        // -=, *=, /=, <=, >=
        miNumero *=2; // miNumero = miNumero *2 = 50
        System.out.println("miNumero *=2: "+miNumero);

        //Ejercicio determinar un numero si esta en rango de 0 a 5
        //Definir variables
        final int MINIMO = 0;
        final int MAXIMO = 5;
        var consola = new Scanner(System.in);
        System.out.print("proporciona un dato entre 0 y 5");
        // vamos a verificar si el numero esta dentro del rango
        var dato = Integer.parseInt(consola.nextLine());
        var dentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.print("valor dentro rango? "+dentroRango);

        // precedencia Operadores en java
        // 1. parentesis y corchetes
        // 2. Operadores unarios -, ++, --
        // 3. Operadores aritmeticos  *, /, y %
        // 4. Operadores aritmeticos + y -
        // 5. Relacionales <, <=, >, >=
        // 6. Equivalencia == y !=
        // 7. Logicos && y ||
        // 8. Asignacion =, +=,-=,*=, etc




    }
}
