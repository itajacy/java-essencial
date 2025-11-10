package Operadores;

@SuppressWarnings("all")
public class TabelaVerdade {
    static void main() {
        // Taabela verdade AND

        System.out.println("Tabela Verdade AND");
        System.out.println(true && true); //True
        System.out.println(true && false); //False
        System.out.println(false && true); //False
        System.out.println(false && false); //False

System.out.println("\nTabela Verdade OR");
        System.out.println(true || true); //True
        System.out.println(true || false); //True
        System.out.println(false || true); //True
        System.out.println(false || false); //False

System.out.println("\nTabela Verdade XOR v1");
        System.out.println(true ^ true); //False
        System.out.println(true ^ false); //True
        System.out.println(false ^ true); //True
        System.out.println(false ^ false); //False

System.out.println("\nTabela Verdade XOR v2");
        System.out.println(true != true); //False
        System.out.println(true != false); //True
        System.out.println(false != true); //True
        System.out.println(false != false); //False

System.out.println("\nTabela Verdade NOT");
        System.out.println(!true); //False
        System.out.println(!false); //True


    }

}
