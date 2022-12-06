package models;

import interfaces.*;

public class Trapezoid implements ConcreteElement {

    private double smallerBase, largerBase, sideA, sideB;

    public Trapezoid(double smallerBase, double largerBase, double sideA, double sideB) throws ArithmeticException {
        if (smallerBase == largerBase || smallerBase == largerBase && sideA == sideB)
            throw new ArithmeticException("These value does not make a trapezoid.");

        if (smallerBase <= 0 || largerBase <= 0 || sideA <= 0 || sideB <= 0)
            throw new ArithmeticException("Each side must be greater than zero.");

        if (smallerBase > largerBase) {
            double temp = smallerBase;
            smallerBase = largerBase;
            largerBase = temp;
        }
    
        this.smallerBase = smallerBase;
        this.largerBase = largerBase;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSmallerBase() {
        return this.smallerBase;
    }

    public double getLargerBase() {
        return this.largerBase;
    }

    public double getSideA() {
        return this.sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public void setLargerBase(double largerBase) {
        this.largerBase = largerBase;
    }

    public void setSmallerBase(double smallerBase) {
        this.smallerBase = smallerBase;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public String acceptV(VisitorFG v) {
        return (String) v.visit(this);
    }

}