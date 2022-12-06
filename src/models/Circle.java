package models;

import interfaces.ConcreteElement;
import interfaces.VisitorFG;

public class Circle implements ConcreteElement {

    private double radius;

    public Circle(double radius) throws ArithmeticException {
        if(radius <= 0) throw new ArithmeticException("Radius must be greater than zero.");
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String acceptV(VisitorFG v) {
       return (String) v.visit(this);
    }

}