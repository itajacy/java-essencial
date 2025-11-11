package Operadores;

import java.util.Scanner;

@SuppressWarnings("all")
public class Ternario {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual é a média do aluno? ");
        String valorNota = teclado.nextLine().replace(',', '.');
        double nota = Double.parseDouble(valorNota);

        System.out.print("Teve bom comportamento? (s/n) ");
        String valorComportamento = teclado.nextLine();
        boolean bomComportamento = valorComportamento.equalsIgnoreCase("S") ? true : false;

        // Uso do operador ternario
        // (expressao boolean) ?  true  :  false
        // Atribuição condicional
        String resultadoEscolar = (nota >= 7) ? "Aprovado": "Em Recuperação" ;

        double valorDesconto = nota >= 9 && bomComportamento ? 0.35 : 0.15;

        System.out.printf("Resultado: %s %nDesconto: %.0f%%   ", resultadoEscolar, valorDesconto * 100);
    }
}
