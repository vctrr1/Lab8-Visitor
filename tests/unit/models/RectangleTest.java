package unit.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import models.Rectangle;

public class RectangleTest {    

    @Test
    public void testGetWidth() throws ArithmeticException {
        Rectangle rectangle = new Rectangle(10, 20);
        
        assertEquals(10, rectangle.getWidth(), 0.1);
    }

    @Test
    public void testGetHeight() throws ArithmeticException {
        Rectangle rectangle = new Rectangle(10, 20);
        
        assertEquals(20, rectangle.getHeight(), 0.1);
    }

    @Test
    public void testSetWidth() throws ArithmeticException {
        Rectangle rectangle = new Rectangle(52, 30);
        rectangle.setWidth(12);
        
        
        assertEquals(12, rectangle.getWidth(), 0.1);
        //assertNotEquals(12.0, 10.0, 0.1);
    }

    @Test
    public void testSetHeight() throws ArithmeticException {
        Rectangle rectangle = new Rectangle(52, 30);
        rectangle.setHeight(22);
        
        
        assertEquals(22, rectangle.getHeight(), 1000);
        //assertNotEquals(22.0, 10.0, 1000);
    }

    @Test(expected = ArithmeticException.class)
    public void testNegativeWidth() throws ArithmeticException {
        Rectangle rectangle = new Rectangle(-5, 10);
   
    }

    @Test(expected = ArithmeticException.class)
    public void testNegativeHeight() throws ArithmeticException {
        Rectangle rectangle = new Rectangle(5, -10);
   
    }

    @Test(expected = ArithmeticException.class)
    public void testNegativeHeightAndWidth() throws ArithmeticException {
        Rectangle rectangle = new Rectangle(-5, -10);
   
    }

    @Test(expected = ArithmeticException.class)
    public void testZeroWidthAndHeight() throws ArithmeticException {
        Rectangle rectangle = new Rectangle(0, 0);
   
    }

   
}
