package fundamentos;


@SuppressWarnings("all")
public class TipoString {
    static void main() {
        final String texto = "Boa tarde";
        System.out.println(texto.concat("!!!"));
        System.out.println(texto + "!!!");
        System.out.println(texto.startsWith("tarde"));
        System.out.println(texto.endsWith("tarde"));
        System.out.println(texto.toLowerCase().startsWith("boa"));
        System.out.println(texto.equals("boa tarde"));
        System.out.println(texto.equalsIgnoreCase("boa tarde"));
        System.out.println(texto.length());
        System.out.println(texto.trim()); //elimina espaços

        String nome = "Pedro";
        String sobrenome = "Santos";
        int idade = 33;
        double salario = 12345.98;

        System.out.println("Nome: " + nome + "\nSobrenome: "
                + sobrenome + "\nIdade: "
                + idade + "\nSalario: " + salario); //elimina espaços

        String frase = String.format("O senhor %s %s tem %d anos e ganha %.2f",
                nome, sobrenome, idade, salario);

        System.out.println(frase);
//        System.out.println(texto);
    }
}
