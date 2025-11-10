package Operadores;

import java.util.Scanner;

public class Logicos {
    static void main() {

    Scanner teclado = new Scanner(System.in);
    System.out.print("Traabalho de terca?(Sim/Não) ");
    String valorTerca = teclado.nextLine();
    boolean resultadoTerca = valorTerca.equalsIgnoreCase("sim");


    System.out.print("Traabalho de terca?(Sim/Não) ");
    String valorQuinta = teclado.nextLine();
    boolean resultadoQuinta = valorQuinta.equalsIgnoreCase("sim");

    System.out.println(resultadoTerca);
    System.out.println(resultadoQuinta);

    boolean comprarTV65 = resultadoTerca && resultadoQuinta; //e
    boolean comprarTV32 = resultadoTerca ^ resultadoQuinta;  // "^" ou exclusivo equivalente ao !=
    boolean comprarSorvete = resultadoTerca || resultadoQuinta;  //  ou
        boolean ficarEmCasa = !comprarSorvete;


    System.out.printf("Comprar TV 65: %b %n Comprar TV 32: %b %n Comprar Sorvete: %b %n Ficar em casa: %b ", comprarTV65, comprarTV32, comprarSorvete, ficarEmCasa);




    }
}
