package es.upm.miw.iwvg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
    void testSet(){
        Integer oldNumerator = testFraction.getNumerator();
        Integer oldDenominator = testFraction.getDenominator();
        testFraction.setNumerator(5);
        testFraction.setDenominator(8);
        assertNotEquals(oldNumerator, testFraction.getNumerator());
        assertNotEquals(oldDenominator, testFraction.getDenominator();
    }
}
