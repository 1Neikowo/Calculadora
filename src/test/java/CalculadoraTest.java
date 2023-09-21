import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @org.junit.jupiter.api.Test
    void perimetroCuadrado() {
        assertEquals(8, Calculadora.perimetroCuadrado(2));
        assertNotEquals(8, Calculadora.perimetroCuadrado(3));
    }

    @org.junit.jupiter.api.Test
    void areaCuadrado() {
        assertEquals(4, Calculadora.areaCuadrado(2));
        assertNotEquals(4, Calculadora.areaCuadrado(3));
    }

    @org.junit.jupiter.api.Test
    void perimetroRectangulo() {
        assertEquals(8, Calculadora.perimetroRectangulo(2, 2));
        assertNotEquals(4, Calculadora.perimetroRectangulo(3, 3));
    }

    @org.junit.jupiter.api.Test
    void areaRectangulo() {
        assertEquals(4, Calculadora.areaRectangulo(2, 2));
        assertNotEquals(4, Calculadora.areaRectangulo(3, 3));
    }

    @org.junit.jupiter.api.Test
    void circunferenciaCirculo() {
        assertEquals(Math.PI*2, Calculadora.circunferenciaCirculo(1));
        assertNotEquals(Math.PI, Calculadora.circunferenciaCirculo(3));
    }

    @org.junit.jupiter.api.Test
    void areaCirculo() {
        assertEquals(Math.PI, Calculadora.areaCirculo(1));
        assertNotEquals(Math.PI*2, Calculadora.areaCirculo(3));
    }

    @org.junit.jupiter.api.Test
    void areaEsfera() {
        assertEquals(Math.PI*4, Calculadora.areaEsfera(1));
        assertNotEquals(Math.PI*2, Calculadora.areaEsfera(3));
    }

    @org.junit.jupiter.api.Test
    void volumenEsfera() {
        assertEquals((double) 4 /3*Math.PI, Calculadora.volumenEsfera(1));
        assertNotEquals(Math.PI, Calculadora.volumenEsfera(2));
    }

    @org.junit.jupiter.api.Test
    void areaCubo() {
        assertEquals(24, Calculadora.areaCubo(2));
        assertNotEquals(30, Calculadora.areaCubo(3));
    }

    @org.junit.jupiter.api.Test
    void volumenCubo() {
        assertEquals(8, Calculadora.volumenCubo(2));
        assertNotEquals(10, Calculadora.volumenCubo(3));
    }

    @org.junit.jupiter.api.Test
    void areaCono() {
        assertEquals(24*Math.PI, Calculadora.areaCono(3,4));
        assertNotEquals(30, Calculadora.areaCono(3,3));
    }

    @org.junit.jupiter.api.Test
    void volumenCono() {
        assertEquals(12*Math.PI, Calculadora.volumenCono(3,4));
        assertNotEquals(10, Calculadora.volumenCono(3,3));
    }
}