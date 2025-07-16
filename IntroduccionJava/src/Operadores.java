public class Operadores {
    public static void main(String[] args) {
        // Operadores aritmeticos
        // Cuando trabajamos con el valor primitimo INT podemos delcaras mas de una variable en una linea Ej.
        int a = 3, b = 2, resultado = 0;
        // Suma
        resultado = a + b; // Simbolo aritmetico Suma (+)
        System.out.println("Suma: " + resultado);
        // Resta
        resultado = a - b;
        System.out.println("Resta = " + resultado);// Simbolo aritmetico resta (-)
        // Multiplicacion
        resultado = a * b;
        System.out.println("Multiplicacion = " + resultado);// Simbnolo aritmetico Multiplicacion (*)
        // Division
        resultado = a / b;
        System.out.println("Division = " + resultado);// Simbolo aritmetico Division
        // Modulo
        resultado = a % b;
        System.out.println("Modulo resultado de la division = " + resultado);// Simbolo aritmetico Modulo resultado de una division (%)

        // Operadores Unarios
        int c = 3, d = -2, resultadoUnarios = 0;
        //boolean e = true;
        // Operador unario -
        resultadoUnarios = -c; // el valor de c se convirtio en negativo
        System.out.println("-c = " + resultadoUnarios);
        resultadoUnarios = -d; // si colocamos el operador - a un valor negativo pasa a positivo
        System.out.println("-d: " + resultadoUnarios);

        // operador unario ++ (incrementa en uno el valor de nuestra variable)
        c = 3;
        resultadoUnarios = ++c; // a esto se le conoce como pre-incremento
        System.out.println("Pre-Incremento ++c: " + resultadoUnarios);

        c = 3;
        resultadoUnarios = c++;//post-Incremento nos sale una advertencia esa variable no se ha utilizado
        System.out.println("post-incremnet c++:" +resultadoUnarios);// aqui vale 3
        System.out.println("c = " + c);// aqui vale 4 ya que teniamos un incremento pendiente
        // Operador Unario -- (decrementa en uno)
        d = -2;
        resultadoUnarios = --d; // pre-decremento
        System.out.println("Pre-decremento  --d: "+ d);

        d = -2;
        resultadoUnarios = d--; //post-decremento
        System.out.println("Post-decremento b--: "+resultadoUnarios); // Vale -2 hasta la siguiente vez que utilizamos el valor se va a incrementar
        System.out.println( "d" + d);// ya vale -3 ya se utilizo
        // Negacion ! (Se invierte el valor logico)
        var e = true;
        var resultadoLogico = !e;// se invirtio el valor logico de true paso a false
        System.out.println("Negacion !c" + resultadoLogico);




    }
}
