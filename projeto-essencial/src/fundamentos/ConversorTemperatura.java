package fundamentos;

public class ConversorTemperatura {
    static void main() {
        final double TempF = 71;
        final double TempCelsius;

        TempCelsius = (TempF -32) * 5/9;

        System.out.println("Temperatura em Fahrenheit: "+ TempF);
        System.out.println("Temperatura convertida em Celsius: "+ TempCelsius);


    }
}
