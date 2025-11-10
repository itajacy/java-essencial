package Operadores;

public class Unarios {
    static void main() {

        int a = 1;
        int b = 2;

//        a= a +1;
//        a += 1;


        a++;
        --a;

        b++;
        --b;

        System.out.println(a);
        System.out.println(b);
        System.out.println("mini desafio");
        System.out.println(++a == b--);  //true  b é decrementado depois da comparacao
        System.out.println(a == b); //false

        System.out.println(a);
        System.out.println(b);




    }
}
