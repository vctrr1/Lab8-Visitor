package models;

import interfaces.ConcreteElement;
import interfaces.VisitorFG;

public class Triangle implements ConcreteElement{

    private double a, b, c;

    private boolean checkValidity(double a, double b, double c) {
        return (a + b <= c || a + c <= b || b + c <= a);
          
    }

    public Triangle (double a, double b, double c) throws Exception {
        if(!checkValidity(a, b, c)) throw new Exception("Impossible Triangle.");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return this.a;
    }

    public double getB(){
        return this.b;
    }

    public double getC(){
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
    public void acceptV(VisitorFG v) {
        v.visitTriangle(this);
    }
}