package fundamentos;

public class ObjetosVsPrimitivos {
    static void main() {

        int a = 10;
        System.out.println(a);

        // boolean, char, byte, short, int, long, float, double
        // Boolean, Character, Byte, Short, Integer, Long, Float, Double


        String b = "teste";
        System.out.println(b.toUpperCase());

        // Wrappers  versão orientada a Objetos dos tipos primitivos
        Integer c = 1234;

        System.out.println(c.doubleValue());

        double d1 = 1234;
        System.out.println("Valor d1: " +d1);

        Double d2 = 1234.00;
        System.out.println(d2.intValue());
    }
}
