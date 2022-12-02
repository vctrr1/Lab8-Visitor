package unit.visitors;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;


import models.*;
import visitors.*;

public class MaximizeFigTest {

    private static Circle circle;
    private static Rectangle rect;
    private static Trapezoid trapezoid;
    private static Triangle triangle;
    private static MaximizeFig maximizeFig;

    @Before
    public void init() throws Exception{
        circle = new Circle(5); // 62.83
        rect = new Rectangle(2, 2);        
        trapezoid = new Trapezoid(16, 26, 13, 13);
        triangle = new Triangle(3, 4, 5);
        maximizeFig = new MaximizeFig();

    }

    @Test
    public void testVisitRectangle() {
        assertEquals("New Height: 4.0 | New Widht: 4.0", maximizeFig.visitRectangle(rect));
    }

    @Test
    public void testVisitCircle() {
        
        assertEquals("New Radius: 10.0", maximizeFig.visitCircle(circle));
        //assertNotEquals(52.0, 10.0, 1000);
    }

    @Test
    public void testVisitTriangle() {
        assertEquals("New Side A: 6.0 | New Side B: 8.0 | New Side C: 10.0", maximizeFig.visitTriangle(triangle));
        //assertNotEquals(52.0, 10.0, 1000);
    }

    @Test
    public void testVisitTrapezoid() {
        
        assertEquals("New Larger Base: 52.0 | New Smaller Base: 32.0 | New Side A: 26.0 | New Side B: 26.0", maximizeFig.visitTrapezoid(trapezoid));
        //assertNotEquals(52.0, 10.0, 1000);
    }

   
}
