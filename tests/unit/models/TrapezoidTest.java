package unit.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import models.Trapezoid;

public class TrapezoidTest {

    @Test
    public void testGetSmallerBase() throws ArithmeticException {
        Trapezoid trapezoid = new Trapezoid(16, 26, 13, 13);
        assertEquals(16, trapezoid.getSmallerBase(), 0.1);
    }

    @Test
    public void testGetLargerBase() throws ArithmeticException {
        Trapezoid trapezoid = new Trapezoid(16, 26, 13, 13);
        assertEquals(26, trapezoid.getLargerBase(), 0.1);
    }

    @Test
    public void testGetSideA() throws ArithmeticException {
        Trapezoid trapezoid = new Trapezoid(16, 26, 13, 13);
        assertEquals(13, trapezoid.getSideA(), 0.1);
    }

    @Test
    public void testGetSideB() throws ArithmeticException {
        Trapezoid trapezoid = new Trapezoid(16, 26, 13, 13);
        assertEquals(13, trapezoid.getSideB(), 0.1);
    }

    @Test(expected = ArithmeticException.class)
    public void testNegativeSmallerBase() throws ArithmeticException {
        Trapezoid trapezoid = new Trapezoid(-16, 26, 13, 13);

    }

    @Test(expected = ArithmeticException.class)
    public void testNegativeLargerBase() throws ArithmeticException {
        Trapezoid trapezoid = new Trapezoid(16, -26, 13, 13);

    }

    @Test(expected = ArithmeticException.class)
    public void testNegativeSideA() throws ArithmeticException {
        Trapezoid trapezoid = new Trapezoid(16, 26, -13, 13);

    }

    @Test(expected = ArithmeticException.class)
    public void testNegativeSideB() throws ArithmeticException {
        Trapezoid trapezoid = new Trapezoid(16, 26, 13, -13);

    }

    @Test(expected = ArithmeticException.class)
    public void testNegativeSides() throws ArithmeticException {
        Trapezoid trapezoid = new Trapezoid(-16, -26, -13, -13);

    }

    @Test(expected = ArithmeticException.class)
    public void testInvalidTrapezoid() throws ArithmeticException {
        Trapezoid trapezoid = new Trapezoid(1, 1, 500, 3);

    }

    @Test(expected = ArithmeticException.class)
    public void testNullSides() throws ArithmeticException {
        Trapezoid trapezoid = new Trapezoid(0, 0, 0, 0);

    }

}
