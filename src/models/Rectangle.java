package models;

import interfaces.ConcreteElement;
import interfaces.VisitorFG;

public class Rectangle implements ConcreteElement {

    private double width, height;

    public Rectangle(double width, double height) throws ArithmeticException {
        if (width <= 0 || height <= 0)
            throw new ArithmeticException("Width and Height must be greater than zero.");
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String acceptV(VisitorFG v) {
        return (String) v.visit(this);
    }
}
