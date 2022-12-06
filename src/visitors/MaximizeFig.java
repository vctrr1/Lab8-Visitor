package visitors;

import interfaces.VisitorFG;
import models.*;

public class MaximizeFig implements VisitorFG<String> {

    @Override
    public String visit(Circle c) {
        c.setRadius(2 * c.getRadius());
        return "New Radius: " + c.getRadius();
    }

    @Override
    public String visit(Triangle t) {
        Triangle t2 = new Triangle(2 * t.getA(), 2 * t.getB(), 2 * t.getC());

        return "New Side A: " + t2.getA() + " |" + " New Side B: " + t2.getB() + " |" + " New Side C: " + t2.getC();
    }

    @Override
    public String visit(Rectangle r) {
        r.setHeight(2 * r.getHeight());
        r.setWidth(2 * r.getWidth());
        return "New Height: " + r.getHeight() + " |" + " New Widht: " + r.getWidth();
    }

    @Override
    public String visit(Trapezoid t) {
        Trapezoid t2 = new Trapezoid(2 * t.getLargerBase(), 2 * t.getSmallerBase(), 2 * t.getSideA(), 2 * t.getSideB());

        return "New Larger Base: " + t2.getLargerBase() + " |" + " New Smaller Base: " + t2.getSmallerBase() + " |"
                + " New Side A: " + t2.getSideA() + " |" + " New Side B: " + t2.getSideB();
    }

}