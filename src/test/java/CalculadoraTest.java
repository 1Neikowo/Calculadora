import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void suma() {
        assertEquals(3.2, Calculadora.suma(1, 2.2));
        assertEquals(1000, Calculadora.suma(-1000, 2000));
    }
    @Test
    void resta() {
        assertEquals(-1, Calculadora.resta(1, 2));
        assertNotEquals(5, Calculadora.resta(5, 2));
    }

    @Test
    void multi() {
        assertEquals(20000000, Calculadora.multi(10000000, 2));
        assertNotEquals(1000, Calculadora.multi(-1000, 2000));
        assertEquals(1000, Calculadora.multi(2000, 0.5));
    }

    @Test
    void divi() {
        assertEquals(500, Calculadora.divi(1000, 2));
        assertThrows(ArithmeticException.class, () -> Calculadora.divi(1000,0));
    }

    @Test
    void max() {
        assertEquals(2000, Calculadora.max(1000, 2000));
        assertNotEquals(-2000, Calculadora.max(-2000, 1000));
    }

    @Test
    void min() {
        assertEquals(-2000, Calculadora.min(-2000, 1000));
        assertNotEquals(2000, Calculadora.min(2000, -1000));
    }

    @Test
    void power() {
        assertEquals(1, Calculadora.power(1000,0));
        assertEquals(0.5, Calculadora.power(2,-1));
        assertEquals(25, Calculadora.power(5,2));
    }

    @Test
    void percentage() {
        assertEquals(50, Calculadora.percentage(100, 50));
        assertEquals(0, Calculadora.percentage(100, 0));
    }
}