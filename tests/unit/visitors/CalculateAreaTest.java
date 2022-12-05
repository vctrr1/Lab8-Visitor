package unit.visitors;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

import models.*;
import visitors.CalculateArea;

public class CalculateAreaTest {

    private static Circle circle;
    private static Rectangle rect;
    private static Trapezoid trapezoid;
    private static Triangle triangle;
    private static CalculateArea calculateArea;

    @Before
    public void init() throws Exception {
        circle = new Circle(10); // 62.83
        rect = new Rectangle(10, 30);
        trapezoid = new Trapezoid(16, 26, 13, 13);
        triangle = new Triangle(10, 8, 6);
        calculateArea = new CalculateArea();

    }

    @Test
    public void testVisitRectangle() {
        assertEquals("300.0", calculateArea.visit(rect));

    }

    @Test
    public void testVisitCircle() {
        assertEquals(String.valueOf(Math.PI * Math.pow(circle.getRadius(), 2)), calculateArea.visit(circle));
    }

    @Test
    public void testVisitTriangle() {
        triangle.acceptV(calculateArea);
        assertEquals("24.0", calculateArea.visit(triangle));
        // assertNotEquals(52.0, 10.0, 1000);
    }

    @Test
    public void testVisitTrapezoid() {
        assertEquals("136500.0", calculateArea.visit(trapezoid));
    }

}
