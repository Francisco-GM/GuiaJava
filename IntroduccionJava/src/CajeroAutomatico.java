import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        System.out.print("*** Cajero Automatico***");

        var salir = false;
        var saldoActual = 1000;

        while(!salir){
            System.out.print("""
                    Menu:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opcion: \s""");
            var opcion = Integer.parseInt(new Scanner(System.in).nextLine());

            switch (opcion){
                case 1-> System.out.println("Tu saldo actual es: "+saldoActual);
                case 2-> {
                    System.out.println("Ingrese cuanto desea retirar");
                    var retiro = Double.parseDouble(new Scanner(System.in).nextLine());
                    var nuevoSaldo = saldoActual - retiro;
                    System.out.println("Tu Saldo actual es de "+ nuevoSaldo);
                }
                case 3 -> {
                    System.out.println("Ingrese cuanto desea Depositar");
                    var deposito = Double.parseDouble(new Scanner(System.in).nextLine());
                    var nuevoSaldo = saldoActual + deposito;
                    System.out.println("Tu Saldo actual es de "+ nuevoSaldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto...");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida: " + opcion);
            }
            System.out.println();
        }
    }
}
