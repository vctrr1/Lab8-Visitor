import models.*;
import visitors.*;

public class App {
    public static void main(String[] args) throws Exception {

        CalculateArea calculateArea = new CalculateArea();
        CalculatePerimeter calculatePerimeter = new CalculatePerimeter();
        MaximizeFig maximizeFig = new MaximizeFig();
        Draw draw = new Draw();

        System.out.println("\n~~~~~~~~~~~~~~~~~ Output ~~~~~~~~~~~~~~~~~~~~~");

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(2, 2);
        Triangle triangle = new Triangle(3, 4, 5);
        Trapezoid trapezoid = new Trapezoid(16, 26, 13, 13);

        System.out.println("Draw visitor: ");
        System.out.println(circle.acceptV(draw));
        System.out.println(rectangle.acceptV(draw));
        System.out.println(trapezoid.acceptV(draw));
        System.out.println(triangle.acceptV(draw));

        System.out.println("\nCalculateArea visitor: ");
        System.out.println("A área do círculo é: " + circle.acceptV(calculateArea));
        System.out.println("A área do retângulo é: " + rectangle.acceptV(calculateArea));
        System.out.println("A área do trapézio é: " + trapezoid.acceptV(calculateArea));
        System.out.println("A área do triângulo é: " + triangle.acceptV(calculateArea));

        System.out.println("\nCalculatePerimeter visitor: ");
        System.out.println("O perímetro do círculo é: " + circle.acceptV(calculatePerimeter));
        System.out.println("O perímetro do retângulo é: " + rectangle.acceptV(calculatePerimeter));
        System.out.println("O perímetro do trapézio é: " + trapezoid.acceptV(calculatePerimeter));
        System.out.println("O perímetro do triângulo é: " + triangle.acceptV(calculatePerimeter));

        System.out.println("\nMaximizeFig visitor: ");
        System.out.println(circle.acceptV(maximizeFig));
        System.out.println(rectangle.acceptV(maximizeFig));
        System.out.println(trapezoid.acceptV(maximizeFig));
        System.out.println(triangle.acceptV(maximizeFig));

    }
}