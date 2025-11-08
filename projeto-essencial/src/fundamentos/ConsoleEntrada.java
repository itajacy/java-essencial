package fundamentos;

import java.util.Scanner;

public class ConsoleEntrada {
    static void main() {
        Scanner teclado = new Scanner(System.in);


        System.out.print("qual é a sua idade: ");
        int idade = teclado.nextInt();
        teclado.nextLine();  // caputurar o \n extra


        System.out.print("qual é o seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("qual é o seu sobrenome: ");
        String sobrenome = teclado.nextLine();


        System.out.printf("Nome: %s %s, Idade: %d ", nome, sobrenome,  idade);

        teclado.close();
    }
}
