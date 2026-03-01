import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void testRetornaNumeroComoString() {
        // Arrange
        int numero = 1;

        // Act
        String resultado = FizzBuzz.fizzBuzz(numero);

        // Assert
        assertEquals("1", resultado);
    }

    @Test
    void testRetornaFizzParaMultiploDe3() {
        // Arrange
        int numero = 3;

        // Act
        String resultado = FizzBuzz.fizzBuzz(numero);

        // Assert
        assertEquals("Fizz", resultado);
    }

    @Test
    void testRetornaBuzzParaMultiploDe5() {
        // Arrange
        int numero = 5;

        // Act
        String resultado = FizzBuzz.fizzBuzz(numero);

        // Assert
        assertEquals("Buzz", resultado);
    }

    @Test
    void testRetornaFizzBuzzParaMultiploDe3Y5() {
        // Arrange
        int numero = 15;

        // Act
        String resultado = FizzBuzz.fizzBuzz(numero);

        // Assert
        assertEquals("FizzBuzz", resultado);
    }

    // --- Pruebas adicionales ---

    @Test
    void testRetornaFizzParaMultiploDe3NoObvio() {
        // Arrange
        int numero = 9;

        // Act
        String resultado = FizzBuzz.fizzBuzz(numero);

        // Assert
        assertEquals("Fizz", resultado);
    }

    @Test
    void testRetornaBuzzParaMultiploDe5NoObvio() {
        // Arrange
        int numero = 25;

        // Act
        String resultado = FizzBuzz.fizzBuzz(numero);

        // Assert
        assertEquals("Buzz", resultado);
    }

    @Test
    void testRetornaFizzBuzzParaMultiploDe3Y5NoObvio() {
        // Arrange
        int numero = 30;

        // Act
        String resultado = FizzBuzz.fizzBuzz(numero);

        // Assert
        assertEquals("FizzBuzz", resultado);
    }

    @Test
    void testRetornaNumeroParaValorNoMultiplo() {
        // Arrange
        int numero = 7;

        // Act
        String resultado = FizzBuzz.fizzBuzz(numero);

        // Assert
        assertEquals("7", resultado);
    }

    @Test
    void testRetornaFizzBuzzParaNumero45() {
        // Arrange
        int numero = 45;

        // Act
        String resultado = FizzBuzz.fizzBuzz(numero);

        // Assert
        assertEquals("FizzBuzz", resultado);
    }

    @Test
    void testRetornaNumeroParaUno() {
        // Arrange
        int numero = 1;

        // Act
        String resultado = FizzBuzz.fizzBuzz(numero);

        // Assert
        assertEquals("1", resultado);
    }
}