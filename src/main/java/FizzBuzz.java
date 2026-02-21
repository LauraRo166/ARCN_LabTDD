public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz";

    public static String fizzbuzz(int numero) {
        if (esMultiploDe3Y5(numero)) return FIZZBUZZ;
        if (esMultiploDe3(numero))   return FIZZ;
        if (esMultiploDe5(numero))   return BUZZ;
        return String.valueOf(numero);
    }

    private static boolean esMultiploDe3(int numero) {
        return numero % 3 == 0;
    }

    private static boolean esMultiploDe5(int numero) {
        return numero % 5 == 0;
    }

    private static boolean esMultiploDe3Y5(int numero) {
        return esMultiploDe3(numero) && esMultiploDe5(numero);
    }
}