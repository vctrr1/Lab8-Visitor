package unit.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import models.Triangle;

public class TriangleTest {

    @Test
    public void testGetA() throws ArithmeticException {
        Triangle triangle = new Triangle(5, 4, 3);
        assertEquals(8, triangle.getA(), 1000);
    }

    @Test
    public void testGetB() throws ArithmeticException {
        Triangle triangle = new Triangle(5, 4, 3);
        assertEquals(5, triangle.getB(), 1000);
    }

    @Test
    public void testGetC() throws ArithmeticException {
        Triangle triangle = new Triangle(5, 4, 3);
        assertEquals(6, triangle.getC(), 1000);
    }

    @Test
    public void testSetA() throws ArithmeticException {
        Triangle triangle = new Triangle(10, 8, 6);

        triangle.setA(11);

        assertEquals(11, triangle.getA(), 1000);
        assertNotEquals(((int) 10 * 1000), ((int) triangle.getA() * 1000));
    }

    @Test
    public void testSetB() throws ArithmeticException {
        Triangle triangle = new Triangle(10, 8, 6);

        triangle.setB(11);

        assertEquals(11, triangle.getB(), 1000);
        assertNotEquals(((int) 10 * 1000), ((int) triangle.getB() * 1000));
    }

    @Test
    public void testSetC() throws ArithmeticException {
        Triangle triangle = new Triangle(10, 8, 6);

        triangle.setC(11);

        assertEquals(11, triangle.getC(), 1000);
        assertNotEquals(((int) 10 * 1000), ((int) triangle.getC() * 1000));
    }

    @Test(expected = ArithmeticException.class)
    public void testNegativeA() throws ArithmeticException {
        Triangle triangle = new Triangle(-5, 4, 3);

    }

    @Test(expected = ArithmeticException.class)
    public void testNegativeB() throws ArithmeticException {
        Triangle triangle = new Triangle(5, -6, 3);

    }

    @Test(expected = ArithmeticException.class)
    public void testNegativeC() throws ArithmeticException {
        Triangle triangle = new Triangle(5, 4, -3);

    }

    @Test(expected = ArithmeticException.class)
    public void testNegativeSides() throws ArithmeticException {
        Triangle triangle = new Triangle(-5, -4, -3);

    }

    @Test(expected = ArithmeticException.class)
    public void testInvalidTriangle() throws ArithmeticException {
        Triangle triangle = new Triangle(20, 3, 2);

    }

    @Test(expected = ArithmeticException.class)
    public void testNullSides() throws ArithmeticException {
        Triangle triangle = new Triangle(0, 0, 0);

    }

}
