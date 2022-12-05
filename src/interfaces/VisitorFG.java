package interfaces;

import models.*;

public interface VisitorFG <T> {
    public T visit(Circle c);
    public T visit(Triangle t);
    public T visit(Rectangle r);
    public T visit(Trapezoid t);
}
