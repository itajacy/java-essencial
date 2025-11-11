package fundamentos.desafio;

import java.util.Scanner;

public class DesafioCalculadora {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com o primeiro número: ");
        double n1 = Double.parseDouble(teclado.nextLine().replace(",", "."));

        System.out.print("Entre com o primeiro número: ");
        double n2 = Double.parseDouble(teclado.nextLine().replace(",", "."));


        System.out.print("Entre com a operação desejada (+-*/%): ");
        String op = teclado.nextLine();

        double resultado = (op.equals("+")) ? (n1 + n2) :
                            (op.equals("-")) ? (n1 - n2) :
                                (op.equals("*")) ? (n1 * n2) :
                                    (op.equals("/")) ? (n1 / n2) :
                                            op.equals("%") ? (n1 % n2) : 0.0;
        String operacao = (op.equals("+")) ? "soma" :
                            (op.equals("-")) ? "subtração" :
                                (op.equals("*")) ? "multiplicação" :
                                    (op.equals("/")) ? "divisão" :
                                            op.equals("%") ? "módulo" : "operação inválida";



        System.out.printf("O Resultado da %s entre %.2f e %.2f é: %.2f ",operacao,n1, n2, resultado);

    }
}
