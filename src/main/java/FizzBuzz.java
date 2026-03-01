/**
 * Clase que implementa el problema clásico FizzBuzz.
 * 
 * Retorna:
 * - "FizzBuzz" si el número es múltiplo de 3 y 5
 * - "Fizz" si el número es múltiplo de 3
 * - "Buzz" si el número es múltiplo de 5
 * - El número como String en cualquier otro caso
 */
public class FizzBuzz {

    // Constantes de divisores
    private static final int DIVISOR_FIZZ = 3;
    private static final int DIVISOR_BUZZ = 5;

    // Constantes de respuesta
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz";

    /**
     * Procesa un número según las reglas de FizzBuzz.
     *
     * @param numero el número a procesar
     * @return la cadena resultante según las reglas de FizzBuzz
     */
    public static String fizzBuzz(int numero) {
        if (esMultiploDe3Y5(numero)) {
            return FIZZBUZZ;
        }
        if (esMultiploDe3(numero)) {
            return FIZZ;
        }
        if (esMultiploDe5(numero)) {
            return BUZZ;
        }
        return String.valueOf(numero);
    }

    /**
     * Verifica si un número es múltiplo de 3.
     *
     * @param numero el número a verificar
     * @return true si es múltiplo de 3, false en caso contrario
     */
    private static boolean esMultiploDe3(int numero) {
        return esMultiploDe(numero, DIVISOR_FIZZ);
    }

    /**
     * Verifica si un número es múltiplo de 5.
     *
     * @param numero el número a verificar
     * @return true si es múltiplo de 5, false en caso contrario
     */
    private static boolean esMultiploDe5(int numero) {
        return esMultiploDe(numero, DIVISOR_BUZZ);
    }

    /**
     * Verifica si un número es múltiplo tanto de 3 como de 5.
     *
     * @param numero el número a verificar
     * @return true si es múltiplo de ambos, false en caso contrario
     */
    private static boolean esMultiploDe3Y5(int numero) {
        return esMultiploDe3(numero) && esMultiploDe5(numero);
    }

    /**
     * Verifica si un número es múltiplo de un divisor dado.
     *
     * @param numero el número a verificar
     * @param divisor el divisor a usar
     * @return true si numero es múltiplo de divisor, false en caso contrario
     */
    private static boolean esMultiploDe(int numero, int divisor) {
        return numero % divisor == 0;
    }
}