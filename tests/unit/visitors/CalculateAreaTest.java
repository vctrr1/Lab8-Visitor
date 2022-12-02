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
        assertEquals(300, calculateArea.visitRectangle(rect), 1000);

    }

    @Test
    public void testVisitCircle() {
        assertEquals(Math.PI * Math.pow(circle.getRadius(), 2), calculateArea.visitCircle(circle), 1000);
    }

    @Test
    public void testVisitTriangle() {
        triangle.acceptV(calculateArea);
        assertEquals(24, calculateArea.visitTriangle(triangle), 1000);
        // assertNotEquals(52.0, 10.0, 1000);
    }

    @Test
    public void testVisitTrapezoid() {
        assertEquals((double) 136500, calculateArea.visitTrapezoid(trapezoid), 1000);
    }

}
