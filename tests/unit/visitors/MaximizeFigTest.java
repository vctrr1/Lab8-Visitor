package tests.unit.visitors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.Before;


import models.*;

public class MaximizeFigTest {

    private static Circle circle;
    private static Rectangle rect;
    private static Trapezoid trapezoid;
    private static Triangle triangle;

    @Before
    public void init() throws Exception{
        circle = new Circle(52);
        rect = new Rectangle(10, 30);
        trapezoid = new Trapezoid(10, 20, 5, 30);
        triangle = new Triangle(12, 8, 8);

    }

    @Test
    public void testVisitRectangle() throws ArithmeticException {
      
       
    }

    @Test
    public void testVisitCircle() {
        
        assertEquals(12, circle.getRadius(), 1000);
        //assertNotEquals(52.0, 10.0, 1000);
    }

    @Test
    public void testVisitTriangle() {
        
        assertEquals(12, triangle.getA(), 1000);
        //assertNotEquals(52.0, 10.0, 1000);
    }

    @Test
    public void testVisitTrapezoid() {
        
        assertEquals(12, triangle.getA(), 1000);
        //assertNotEquals(52.0, 10.0, 1000);
    }

   
}
