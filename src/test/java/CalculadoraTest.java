import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void ecuacionRecta() {
        double[] a= new double[]{0, 2};
        double[] b= new double[]{0, 1};


        assertThrows( ArithmeticException.class, () -> Calculadora.validacionpuntos(a, b));

    }
    @Test
    void ecuacionRecta2() {
        double[] c= new double[]{3, 4};
        double[] d= new double[]{5, 6};
        assertNull( Calculadora.validacionpuntos(c, d));
    }
}