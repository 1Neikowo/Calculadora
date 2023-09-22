import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    void suma() {
        assertEquals(0, Calculadora.suma(1,-1));
        assertNotEquals(0, Calculadora.suma(1,1));
    }

    @Test
    void resta() {
        assertEquals(11, Calculadora.resta(10,-1));
        assertEquals(3, Calculadora.resta(5,2));
    }
    @Test
    void multi() {
        assertEquals(20, Calculadora.multi(10,2));
        assertEquals(5, Calculadora.multi(10,0.5));
    }
    @Test
    void divi() {
        assertEquals(5, Calculadora.divi(10,2));
        assertEquals(20, Calculadora.divi(10,0.5));
    }

    @Test
    void max() {
        assertEquals(10, Calculadora.max(10,2));
        assertNotEquals(10, Calculadora.max(11,10));
    }
    @Test
    void min() {
        assertEquals(2, Calculadora.min(10,2));
        assertNotEquals(11, Calculadora.min(10,10));
    }

    @Test
    void power() {
        assertEquals(100, Calculadora.power(10,2));
        assertEquals(0.5, Calculadora.power(2,-1));
    }

    @Test
    void percentage() {
        assertEquals(50, Calculadora.percentage(100,50));
        assertEquals(2, Calculadora.percentage(100,2));
    }
    @Test
      
    void perimetroCuadrado() {
        assertEquals(8, Calculadora.perimetroCuadrado(2));
        assertNotEquals(8, Calculadora.perimetroCuadrado(3));
    }

    @Test
    void areaCuadrado() {
        assertEquals(4, Calculadora.areaCuadrado(2));
        assertNotEquals(4, Calculadora.areaCuadrado(3));
    }

    @Test
    void perimetroRectangulo() {
        assertEquals(8, Calculadora.perimetroRectangulo(2, 2));
        assertNotEquals(4, Calculadora.perimetroRectangulo(3, 3));
    }

    @Test
    void areaRectangulo() {
        assertEquals(4, Calculadora.areaRectangulo(2, 2));
        assertNotEquals(4, Calculadora.areaRectangulo(3, 3));
    }

    @Test
    void circunferenciaCirculo() {
        assertEquals(Math.PI*2, Calculadora.circunferenciaCirculo(1));
        assertNotEquals(Math.PI, Calculadora.circunferenciaCirculo(3));
    }

    @Test
    void areaCirculo() {
        assertEquals(Math.PI, Calculadora.areaCirculo(1));
        assertNotEquals(Math.PI*2, Calculadora.areaCirculo(3));
    }

    @Test
    void areaEsfera() {
        assertEquals(Math.PI*4, Calculadora.areaEsfera(1));
        assertNotEquals(Math.PI*2, Calculadora.areaEsfera(3));
    }

    @Test
    void volumenEsfera() {
        assertEquals((double) 4 /3*Math.PI, Calculadora.volumenEsfera(1));
        assertNotEquals(Math.PI, Calculadora.volumenEsfera(2));
    }

    @Test
    void areaCubo() {
        assertEquals(24, Calculadora.areaCubo(2));
        assertNotEquals(30, Calculadora.areaCubo(3));
    }

    @Test
    void volumenCubo() {
        assertEquals(8, Calculadora.volumenCubo(2));
        assertNotEquals(10, Calculadora.volumenCubo(3));
    }

    @Test
    void areaCono() {
        assertEquals(24*Math.PI, Calculadora.areaCono(3,4));
        assertNotEquals(30, Calculadora.areaCono(3,3));
    }

    @Test
    void volumenCono() {
        assertEquals(12*Math.PI, Calculadora.volumenCono(3,4));
        assertNotEquals(10, Calculadora.volumenCono(3,3));
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

