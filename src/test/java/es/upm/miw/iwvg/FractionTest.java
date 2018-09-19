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
}
