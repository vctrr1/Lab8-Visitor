package models;

import java.util.Arrays;

import interfaces.ConcreteElement;
import interfaces.VisitorFG;

public class Triangle implements ConcreteElement {

    private double a, b, c;

    private boolean checkValidity(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public Triangle(double a, double b, double c) throws ArithmeticException {
        if (!checkValidity(a, b, c))
            throw new ArithmeticException("Impossible Triangle.");
        if (a <= 0 || b <= 0 || c <= 0)
            throw new ArithmeticException("Each side must be greater than zero.");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String acceptV(VisitorFG v) {
        return (String) v.visit(this);
    }
}