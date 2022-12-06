package unit.visitors;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

import models.*;
import visitors.Draw;

public class DrawTest {

    private static Circle circle;
    private static Rectangle rect;
    private static Trapezoid trapezoid;
    private static Triangle triangle;
    private static Draw draw;

    @Before
    public void init() throws Exception {
        circle = new Circle(5); // 62.83
        rect = new Rectangle(2, 2);        
        trapezoid = new Trapezoid(16, 26, 13, 13);
        triangle = new Triangle(3, 4, 5);
        draw = new Draw();

    }

    @Test
    public void testVisitRectangle() {
        rect.acceptV(draw);
        assertEquals("Desenhando um Rectangle de tamanho: 2.0 | 2.0", draw.visit(rect));

    }

    @Test
    public void testVisitCircle() {
        circle.acceptV(draw);
        assertEquals("Desenhando um Circle de raio: 5.0", draw.visit(circle));
    }

    @Test
    public void testVisitTriangle() {
        triangle.acceptV(draw);
        assertEquals("Desenhando um Triangle com as medidas: 3.0 | 4.0 | 5.0", draw.visit(triangle));
        // assertNotEquals(52.0, 10.0, 1000);
    }

    @Test
    public void testVisitTrapezoid() {
        trapezoid.acceptV(draw);
        assertEquals("Desenhando um Trapezoid de tamanho : 26.0 | 16.0 | 13.0 | 13.0", draw.visit(trapezoid));
    }

}
