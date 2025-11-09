package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    static void main(){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com o primeiro salário: ");
        String sal1 = teclado.nextLine().replace(",",".");
        double s1 = Double.parseDouble(sal1);
        System.out.print("Entre com o segundo salário: ");
        String sal2 = teclado.nextLine().replace(",",".");
        double s2 = Double.parseDouble(sal2);
        System.out.print("Entre com o terceiro salário: ");
        String sal3 = teclado.nextLine().replace(",",".");
        double s3 = Double.parseDouble(sal3);

        double mediaSal = (s1+s2+s3)/3;
        System.out.printf("Media Salarial: %.2f",mediaSal);


    }
}
