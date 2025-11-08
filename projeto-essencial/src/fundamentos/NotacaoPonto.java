package fundamentos;

public class NotacaoPonto {
    /*
    * Dados + Comportamentos
    *
    * Notação .(ponto)
    *
    * exemplo:  dados.comportamentos
    * */
    static void main() {
        String texto = "Bom dia X";
        texto = texto.replace("X","Senhora");
        texto = texto.toUpperCase();
        System.out.println(texto);

        final String nome = "Leonardo".toUpperCase().replace("N","P");
        System.out.println(nome);


    }
}
