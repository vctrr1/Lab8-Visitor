package visitors;

import interfaces.VisitorFG;
import models.*;


public class MaximizeFig implements VisitorFG <String> {

    @Override
    public String visitCircle(Circle c) {
        c.setRadius(2 * c.getRadius());
        return "New Radius: " + c.getRadius();
    }

    @Override
    public String visitTriangle(Triangle t) {
        t.setA(2 * t.getA());
        t.setB(2 * t.getB());
        t.setC(2 * t.getC());
        return "New Side A: " + t.getA() + " |" + " New Side B: " + t.getB() + " |" + " New Side C: " + t.getC();
    }

    @Override
    public String visitRectangle(Rectangle r) {
        r.setHeight(2 * r.getHeight());
        r.setWidth(2 * r.getWidth());
        return "New Height: " + r.getHeight() + " |" + " New Widht: " + r.getWidth();
    }

	@Override
	public String visitTrapezoid(Trapezoid t) {
		t.setLargerBase(2 * t.getLargerBase());
        t.setSmallerBase(2 * t.getSmallerBase());
        t.setSideA(2 * t.getSideA());
        t.setSideB(2 * t.getSideB());
		return "New Larger Base: " + t.getLargerBase() + " |" + " New Smaller Base: " + t.getSmallerBase() + " |" + " New Side A: " + t.getSideA() + " |" + " New Side B: " + t.getSideB();
	}

}