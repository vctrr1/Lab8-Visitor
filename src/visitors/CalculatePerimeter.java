package visitors;

import interfaces.VisitorFG;
import models.*;

public class CalculatePerimeter implements VisitorFG {

    @Override
    public double visitCircle(Circle c) {
        return (2 * Math.PI) * c.getRadius();
    }

    @Override
    public double visitTriangle(Triangle t) {
        return t.getA() + t.getB() + t.getC();
    }

    @Override
    public double visitRectangle(Rectangle r) {
        return 2 * (r.getWidth() + r.getHeigth());
    }

    @Override
    public double visitTrapezoid(Trapezoid t) {
        return t.getLargerBase() + t.getSmallerBase() + t.getSideA() + t.getSideB();
    }

}
