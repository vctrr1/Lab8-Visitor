package visitors;

import interfaces.VisitorFG;
import models.Circle;
import models.Rectangle;
import models.Triangle;

public class CalculatePerimeter implements VisitorFG{

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

}
