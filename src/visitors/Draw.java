package visitors;

import interfaces.VisitorFG;
import models.Circle;
import models.Rectangle;
import models.Trapezoid;
import models.Triangle;

public class Draw implements VisitorFG{

    @Override
    public double visitCircle(Circle c) {
        System.out.println("Desenhando um " + c.getClass() + " de raio: " + c.getRadius());
        return 0;
    }

    @Override
    public double visitTriangle(Triangle t) {
        System.out.println("Desenhando um " + t.getClass() + " com as medidas: " + t.getA() + "|" + t.getB() + "|" + t.getC());
        return 0;
    }

    @Override
    public double visitRectangle(Rectangle r) {
        System.out.println("Desenhando um " + r.getClass() + " de area: " + (r.getWidth() * r.getHeight()));
        return 0;
    }

	@Override
	public double visitTrapezoid(Trapezoid t) {
		System.out.println("Desenhando um " + t.getClass() + " de perimetro : " + (t.getLargerBase() + t.getSmallerBase() + t.getSideA() + t.getSideB()));
		return 0;
	}
    
}
