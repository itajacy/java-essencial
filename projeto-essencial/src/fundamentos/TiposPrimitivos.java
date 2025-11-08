package fundamentos;

public class TiposPrimitivos {

    //todo 8 Tipos Primitivos

    // todo char
    // delimitado por aspas simples
    // e somente 1 caractere
    // char 'a'
    // char '1'
    char x= '#';

    // todo boolean
    // true ou false
    boolean falso = false;

    //todo numeros
    // 4 para numeros inteiros


    // primeiro bit, define se é negativo ou positivo
    // todo byte --> 8 bits  -128 a 127
    byte menor = 1;

    // todo short -->  16 bits 32768

    short medio =10000;

    // todo *int  --> 32 bits 2 bilhões

    // todo long --> 64 bits

    // todo float --> casas decimais 32

    // todo *double --> dobro do float 64 bits

//* --> padrão

    static void main() {
        char simbolo = '$';

        boolean estaChovendo = false;
        boolean estouComFome = true;

        byte i1 = 127;
        short i2 = 32_767;
        int i3 = 2147483647;
        long i4 = 123;

        float f1 = 123.45f;
        double f2 = 123.45;

        System.out.println(simbolo);
        System.out.println(estaChovendo);
        System.out.println(estouComFome);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(f1);
        System.out.println(f2);



    }
}
