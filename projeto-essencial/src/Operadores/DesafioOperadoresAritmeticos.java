package Operadores;

public class DesafioOperadoresAritmeticos {

    static void main() {


        final double resultado;
        final double cima;
        final double cima1;
        final double cima2;
        final double baixo;

        cima1 = (Math.pow(6*(3+2),2))/(3*2);
        IO.println(cima1);
        cima2 = Math.pow((((1-5)*(2-7))/2),2);
        IO.println(cima2);
        cima = Math.pow((cima1 -cima2),3);
        baixo = Math.pow(10,3);
        resultado = cima /baixo;

        IO.println("Resultado: "+ (int)resultado);
    }
}
