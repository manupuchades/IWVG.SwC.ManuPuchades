package es.upm.miw.iwvg;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DecimalCollectionTest {
    private DecimalCollection decimalCollection;

    @BeforeEach
    void before() {
        this.decimalCollection = new DecimalCollection();
        this.decimalCollection.add(2.0);
        this.decimalCollection.add(-1.0);
        this.decimalCollection.add(3.0);
        this.decimalCollection.add(2.0);
    }

    @Test
    void testDecimalCollection() {
        this.decimalCollection = new DecimalCollection();
        assertEquals(0, this.decimalCollection.size());
    }

    @Test
    void testAdd() {
        assertEquals(4, this.decimalCollection.size());
    }

    @Test
    void testSum() {
        assertEquals(6.0, this.decimalCollection.sum(), 10e-5);
    }

    @Test
    void testSumArithmeticExceptionIfEmpty() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> new DecimalCollection().sum());
        LogManager.getLogger(this.getClass()).debug(exception.getMessage());
    }

    @Test
    void testHigher() {
        assertEquals(3.0, this.decimalCollection.higher(), 10e-5);
    }

    @Test
    void testHigherArithmeticExceptionIfEmpty() {
        assertThrows(ArithmeticException.class, () -> new DecimalCollection().higher());
    }
    @Test
    void testSetNumber_in_Pos(){
        double expected_number=8;
        double obtained_number;
        int position_insert=1;
        int previous_size=this.decimalCollection.size();
        this.decimalCollection.setNumber_in_Pos(position_insert, expected_number);
        assertEquals(previous_size+1, this.decimalCollection.size());
        obtained_number = this.decimalCollection.getNumber_in_Pos(position_insert);
        assertEquals(expected_number, obtained_number);
    }

    @Test
    void testSetCollection(){
        List<Double> collection_to_insert = new ArrayList<>();
        Double double_inserted= Double.valueOf(99);
        collection_to_insert.add(0, double_inserted);
        decimalCollection.setCollection(collection_to_insert);
        assertEquals(double_inserted, (Double) decimalCollection.getNumber_in_Pos(0));
    }

}
