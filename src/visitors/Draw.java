package visitors;

import interfaces.VisitorFG;
import models.Circle;
import models.Rectangle;
import models.Trapezoid;
import models.Triangle;

public class Draw implements VisitorFG <String>{

    @Override
    public String visitCircle(Circle c) {
        return "Desenhando um " + c.getClass().getSimpleName() + " de raio: " + c.getRadius();
    }

    @Override
    public String visitTriangle(Triangle t) {
        return "Desenhando um " + t.getClass().getSimpleName() + " com as medidas: " + t.getA() + "|" + t.getB() + "|" + t.getC();
    }

    @Override
    public String visitRectangle(Rectangle r) {
        return "Desenhando um " + r.getClass().getSimpleName() + " de area: " + (r.getWidth() * r.getHeight());
    }

	@Override
	public String visitTrapezoid(Trapezoid t) {
		return "Desenhando um " + t.getClass().getSimpleName() + " de perímetro : " + (t.getLargerBase() + t.getSmallerBase() + t.getSideA() + t.getSideB());
	}
    
}
