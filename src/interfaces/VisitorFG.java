package interfaces;

import models.*;

public interface VisitorFG <T> {
    public T visitCircle(Circle c);
    public T visitTriangle(Triangle t);
    public T visitRectangle(Rectangle r);
    public T visitTrapezoid(Trapezoid t);
}
