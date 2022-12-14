package visitors;

import interfaces.VisitorFG;
import models.*;

public class CalculateArea implements VisitorFG<String> {

    @Override
    public String visit(Circle c) {
        return String.valueOf(Math.PI * Math.pow(c.getRadius(), 2));
    }

    @Override
    public String visit(Triangle t) {
        double p = (t.getA() + t.getB() + t.getC()) / 2;
        return String.valueOf(Math.sqrt(p * (p - t.getA()) * (p - t.getB()) * (p - t.getC())));

    }

    @Override
    public String visit(Rectangle r) {
        return String.valueOf(r.getWidth() * r.getHeight());
    }

    @Override
    public String visit(Trapezoid t) {
        double a = t.getSmallerBase(), b = t.getLargerBase(), c = t.getSideA(), d = t.getSideB();
        double c2 = Math.pow(c, 2);
        double h = Math.sqrt(c2 * Math.pow((c2 - Math.pow(d, 2) + Math.pow(b - a, 2)) / 2 * (b - a), 2));

        return String.valueOf(((a + b) / 2) * h);

    }
}