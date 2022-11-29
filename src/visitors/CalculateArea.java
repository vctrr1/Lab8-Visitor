package visitors;

import java.util.Arrays;

import interfaces.VisitorFG;
import models.Circle;
import models.Rectangle;
import models.Triangle;

public class CalculateArea implements VisitorFG {

    @Override
    public double visitCircle(Circle c) {
        return Math.PI * Math.pow(c.getRadius(), 2);
    }

    @Override
    public double visitTriangle(Triangle t) {
        double arr[] = { t.getA(), t.getB(), t.getC() };

        Arrays.sort(arr);
        //equilateral 
        if(arr[0] == arr[1] && arr[0] == arr[2])
            return (Math.sqrt(3) / 4) * Math.pow(arr[0], 2);

        //rectangle
        else if (Math.pow(arr[2], 2) == Math.pow(arr[1], 2) + Math.pow(arr[0], 2))
            return t.getA() + t.getB() + t.getC();

        //isosceles scalene
        else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[3]){
            double base = arr[0] / 2;
            double height = Math.sqrt(Math.pow(base, 2) + Math.pow(arr[1], 2));

            return base * height / 2;
        }
        
        else {
            
        }
       

    }

    @Override
    public double visitRectangle(Rectangle r) {
        return r.getWidth() * r.getHeigth();
    }
}