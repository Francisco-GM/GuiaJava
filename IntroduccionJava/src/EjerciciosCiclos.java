public class EjerciciosCiclos {
    public static void main(String[] args) {
        // sumar los primeros 5 numeros
        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        //Iterar los valores
        for(var numero =1; numero <=MAXIMO; numero++){
            // Imprimir lo que se va a sumar
            System.out.println("(acumuladorSuma + numero) ->"+acumuladorSuma +" + " +numero);
            acumuladorSuma += numero;
            //imprimir el resultado parcial
            System.out.println("suma parcial acumulada: "+ acumuladorSuma);

        }
        System.out.println("suma acumulativa de los primeros 5 numeros: "+acumuladorSuma);
    }
}
