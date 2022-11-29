package interfaces;

import models.*;

public interface VisitorFG {
    public double visitCircle(Circle c);
    public double visitTriangle(Triangle t);
    public double visitRectangle(Rectangle r);
}
