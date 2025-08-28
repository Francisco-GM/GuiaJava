public class Ciclos {
    public static void main(String[] args) {
        // Imprimir los valores del 1 al 5
        // Ciclos while
        /*
        var contador = 1;
        final var VALOR_MAXIMO = 5;

        while(contador <= VALOR_MAXIMO){
            System.out.println("valor:" + contador);
            contador++;
        }

         */
        // Ciclo Do while
        var contador = 1;
        final var VALOR_MAXIMO = 100;
        do {
            System.out.println("valor:" + contador++);
        } while (contador <= VALOR_MAXIMO);
    }
}
