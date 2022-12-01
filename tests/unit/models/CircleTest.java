package tests.unit.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import models.Circle;

public class CircleTest {    

    @Test
    public void testGetRadius() throws ArithmeticException {
        Circle circle = new Circle(52);
        assertEquals(52, circle.getRadius(), 1000);
    }

    @Test
    public void testSetRadius() throws ArithmeticException {
        Circle circle = new Circle(52);
        circle.setRadius(12);
        
        
        assertEquals(12, circle.getRadius(), 1000);
        //assertNotEquals(52.0, 10.0, 1000);
    }

    @Test(expected = ArithmeticException.class)
    public void testNegativeRadius() throws ArithmeticException {
        Circle circle = new Circle(-5);
   
    }

    @Test(expected = ArithmeticException.class)
    public void testZeroRadius() throws ArithmeticException {
        Circle circle = new Circle(0);
   
    }

   
}
