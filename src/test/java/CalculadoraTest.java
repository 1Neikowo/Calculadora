import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    public void ingresarAValidoTest() {
        // Simular entrada de usuario (por ejemplo, "2.0\n")
        String input = "hola\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Ejecutar el método y verificar si devuelve el valor correcto
        double a = Calculadora.ingresarA(0.0);
        assertEquals(2.0, a, 0.0001); // Verifica que el valor ingresado sea igual a 2.0

        // Restaurar la entrada estándar original
        System.setIn(System.in);
    }
    @Test
    public void calcularCuadratica1Test() {
        double x1 = Calculadora.calcularCuadratica1(0, 1.0, -3.0, 2.0, 1.0);
        assertEquals(2.0, x1, 0.0001); // Verifica que el cálculo de la primera raíz sea correcto
    }

    @Test
    public void calcularCuadratica2Test() {
        double x2 = Calculadora.calcularCuadratica2(0, 1.0, -3.0, 2.0, 1.0);
        assertEquals(1.0, x2, 0.0001); // Verifica que el cálculo de la segunda raíz sea correcto
    }


}
