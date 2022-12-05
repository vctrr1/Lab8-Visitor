package unit.visitors;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

import models.*;
import visitors.CalculatePerimeter;

public class CalculatePerimeterTest {

    private static Circle circle;
    private static Rectangle rect;
    private static Trapezoid trapezoid;
    private static Triangle triangle;
    private static CalculatePerimeter calculatePerimeter;

    @Before
    public void init() throws Exception {
        circle = new Circle(5); // 62.83 = 10 radius
                                // 31.4 = 5 radius
        rect = new Rectangle(10, 30);
        trapezoid = new Trapezoid(10, 20, 5, 30);
        triangle = new Triangle(10, 8, 6);
        calculatePerimeter = new CalculatePerimeter();

    }

    @Test
    public void testVisitRectangle() throws ArithmeticException {
        assertEquals("80.0", calculatePerimeter.visit(rect));
    }

    @Test
    public void testVisitCircle() {
        assertEquals("31.41592653589793", (calculatePerimeter.visit(circle)));
        // assertNotEquals(52.0, 10.0, 1000);
    }

    @Test
    public void testVisitTriangle() {
        assertEquals("24.0", calculatePerimeter.visit(triangle));
        // assertNotEquals(52.0, 10.0, 1000);
    }

    @Test
    public void testVisitTrapezoid() {
        assertEquals("65.0", calculatePerimeter.visit(trapezoid));
        // assertNotEquals(52.0, 10.0, 1000);
    }

}
