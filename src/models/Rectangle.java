package models;

import interfaces.ConcreteElement;
import interfaces.VisitorFG;

public class Rectangle implements ConcreteElement{
    
    private double width, height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeigth(){
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void acceptV(VisitorFG v) {
        v.visitRectangle(this);
    }
}
