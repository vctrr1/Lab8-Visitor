package visitors;

import interfaces.VisitorFG;
import models.Circle;
import models.Rectangle;
import models.Trapezoid;
import models.Triangle;

public class Draw implements VisitorFG <String>{

    @Override
    public String visit(Circle c) {
        return "Desenhando um " + c.getClass().getSimpleName() + " de raio: " + c.getRadius();
    }

    @Override
    public String visit(Triangle t) {
        return "Desenhando um " + t.getClass().getSimpleName() + " com as medidas: " + t.getA() + " | " + t.getB() + " | " + t.getC();
    }

    @Override
    public String visit(Rectangle r) {
        return "Desenhando um " + r.getClass().getSimpleName() + " de tamanho: " + r.getHeight() + " | " + r.getWidth();
    }

	@Override
	public String visit(Trapezoid t) {
		return "Desenhando um " + t.getClass().getSimpleName() + " de tamanho : " + t.getLargerBase() + " | " + t.getSmallerBase() + " | " + t.getSideA() + " | " + t.getSideB();
	}
    
}
