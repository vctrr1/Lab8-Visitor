package models;

public class Trapezoid {

    private double smallerBase, largerBase, sideA, sideB;

    public Trapezoid(double smallerBase, double largerBase, double sideA, double sideB) {
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
    
}