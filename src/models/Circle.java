package models;

import interfaces.ConcreteElement;
import interfaces.VisitorFG;

public class Circle implements ConcreteElement {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void acceptV(VisitorFG v) {
        v.visitCircle(this);
    }

}