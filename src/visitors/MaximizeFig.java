package visitors;

import interfaces.VisitorFG;
import models.*;


public class MaximizeFig implements VisitorFG{

    @Override
    public double visitCircle(Circle c) {
        c.setRadius(2 * c.getRadius());

        return c.getRadius();
    }

    @Override
    public double visitTriangle(Triangle t) {
        t.setA(2 * t.getA());
        t.setB(2 * t.getB());
        t.setC(2 * t.getC());
        return 0;
    }

    @Override
    public double visitRectangle(Rectangle r) {
        r.setHeight(2 * r.getHeigth());
        r.setWidth(2 * r.getWidth());
        return 0;
    }

}