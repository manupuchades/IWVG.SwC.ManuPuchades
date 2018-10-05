package es.upm.miw.iwvg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction testFraction;

    @BeforeEach
    void before() {
        testFraction = new Fraction(1, 2);
    }

    @Test
    void testNewFraction() {
        assertEquals(1, testFraction.getNumerator());
        assertEquals(2, testFraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.5, testFraction.decimal());
    }

    @Test
    void testMultiply(){
        Fraction f2 = new Fraction(2,4);
        Fraction result = this.testFraction.multiply(f2);
        assertEquals(0.25, result.decimal());
        assertEquals(0.5, this.testFraction.decimal());
        assertEquals(0.5, f2.decimal());
    }


    @Test
    void testDivides() {
        Fraction f2 = new Fraction(4, 2);
        Fraction resultado = this.testFraction.divide(f2);
    }
    @Test
    void testDivide(){
        Fraction f2 = new Fraction (4, 2);
        Fraction resultado=this.testFraction.divide(f2);
        assertEquals(0.25, resultado.decimal());
        assertEquals(0.5, this.testFraction.decimal());
        assertEquals(2, f2.decimal());
    }

    @Test
    void testSet(){
        Fraction f3 = new Fraction();
        f3.setNumerator(6);
        f3.setDenominator(5);
        assertEquals(6, f3.getNumerator());
        assertEquals(5, f3.getDenominator());
    }

}
