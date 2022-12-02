package visitors;

import interfaces.VisitorFG;
import models.*;

public class CalculatePerimeter implements VisitorFG <Double>{

    @Override
    public Double visitCircle(Circle c) {
        return (2 * Math.PI) * c.getRadius();
    }

    @Override
    public Double visitTriangle(Triangle t) {
        return t.getA() + t.getB() + t.getC();
    }

    @Override
    public Double visitRectangle(Rectangle r) {
        return 2 * (r.getWidth() + r.getHeight());
    }

    @Override
    public Double visitTrapezoid(Trapezoid t) {
        return t.getLargerBase() + t.getSmallerBase() + t.getSideA() + t.getSideB();
    }

}
