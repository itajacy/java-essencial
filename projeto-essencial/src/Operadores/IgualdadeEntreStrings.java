package Operadores;

import java.util.Scanner;

@SuppressWarnings("all")
public class IgualdadeEntreStrings {

    // Pool de String
    static void main() {

        System.out.println("olá" == "olá");
        System.out.println("olá" == new String("olá"));

        Scanner teclado = new Scanner(System.in);
        System.out.println("digite olá: ");

        String texto = teclado.nextLine();
        System.out.println("olá" == texto);  // false

        System.out.println("olá".equals(texto)); //true  - comparando conteúdo


        

    }
}
