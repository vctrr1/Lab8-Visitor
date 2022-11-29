package visitors;

import interfaces.VisitorFG;
import models.*;


public class CalculateArea implements VisitorFG {

    @Override
    public double visitCircle(Circle c) {
        return Math.PI * Math.pow(c.getRadius(), 2);
    }

    @Override
    public double visitTriangle(Triangle t) {
        double p = (t.getA() + t.getB() + t.getC()) / 2;
        return Math.sqrt(p - (p - t.getA()) * (p - t.getB()) * (p - t.getC()));

    }

    @Override
    public double visitRectangle(Rectangle r) {
        return r.getWidth() * r.getHeigth();
    }
    @Override
    public double visitTrapezoid(Trapezoid t){
        double h = 0;
        
        return ((t.getSmallerBase() + t.getLargerBase()) / 2) * h;
        
    }
}