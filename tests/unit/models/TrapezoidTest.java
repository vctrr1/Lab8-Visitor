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

    @Test
    public void testSetSideA() throws ArithmeticException {
        Trapezoid trapezoid = new Trapezoid(16, 26, 13, 13);
        trapezoid.setSideA(15);
        assertEquals(15, trapezoid.getSideA(), 0.1);
        assertNotEquals(((int) 16 * 1000), ((int) trapezoid.getSideA() * 1000));
    }

    @Test
    public void testSetSideB() throws ArithmeticException {
        Trapezoid trapezoid = new Trapezoid(16, 26, 13, 13);
        trapezoid.setSideB(15);
        assertEquals(15, trapezoid.getSideB(), 0.1);
        assertNotEquals(((int) 26 * 1000), ((int) trapezoid.getSideB() * 1000));
    }

    @Test
    public void testSetSmallerBase() throws ArithmeticException {
        Trapezoid trapezoid = new Trapezoid(16, 26, 13, 13);
        trapezoid.setSmallerBase(15);
        assertEquals(15, trapezoid.getSmallerBase(), 0.1);
        assertNotEquals(((int) 16 * 1000), ((int) trapezoid.getSmallerBase() * 1000));
    }

    @Test
    public void testSetLargerBase() throws ArithmeticException {
        Trapezoid trapezoid = new Trapezoid(16, 26, 13, 13);
        trapezoid.setLargerBase(25);
        assertEquals(25, trapezoid.getLargerBase(), 0.1);
        assertNotEquals(((int) 26 * 1000), ((int) trapezoid.getLargerBase() * 1000));
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
        Trapezoid trapezoid = new Trapezoid(1, 1,500, 3);

    }

    @Test(expected = ArithmeticException.class)
    public void testNullSides() throws ArithmeticException {
        Trapezoid trapezoid = new Trapezoid(0, 0, 0, 0);

    }

}
