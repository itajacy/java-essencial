package fundamentos;

import fundamentos.dados.Usuario;

import java.util.Date;

public class ExemploImport {
    static void main() {

        // importar biblioteca do java
        Date data = new Date();
        System.out.println(data);


        java.lang.String texto = "Exempo de import!!";

        System.out.println(texto);

        Usuario usuario = null;
        System.out.println(usuario);


    }
}
