package visitors;

import interfaces.VisitorFG;
import models.*;

public class CalculatePerimeter implements VisitorFG<String> {

    @Override
    public String visit(Circle c) {
        return String.valueOf((2 * Math.PI) * c.getRadius());
    }

    @Override
    public String visit(Triangle t) {
        return String.valueOf(t.getA() + t.getB() + t.getC());
    }

    @Override
    public String visit(Rectangle r) {
        return String.valueOf(2 * (r.getWidth() + r.getHeight()));
    }

    @Override
    public String visit(Trapezoid t) {
        return String.valueOf(t.getLargerBase() + t.getSmallerBase() + t.getSideA() + t.getSideB());
    }

}
