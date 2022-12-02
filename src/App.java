import models.*;
import visitors.*;
public class App {
    public static void main(String[] args) throws Exception {

    CalculateArea calculateArea = new CalculateArea();
    CalculatePerimeter calculatePerimeter = new CalculatePerimeter();
    MaximizeFig maximizeFig = new MaximizeFig();
    Draw draw = new Draw();
    //System.out.printf("%2.f", calculatePerimeter.visitTrapezoid(trapezoid));
    System.out.println("~~~~~~~~~~~~~~~~~ Create Circle ~~~~~~~~~~~~~~~~~~~~~");

    Circle circle = new Circle(5);

    System.out.println(draw.visitCircle(circle));
    System.out.println("A área do círculo é: ");
    System.out.printf("%.2f",calculateArea.visitCircle(circle));
    System.out.println("\nO perímetro do círculo é: ");
    System.out.println(calculatePerimeter.visitCircle(circle));
    System.out.println("Maximizando o tamanho do círculo: ");
    System.out.println(maximizeFig.visitCircle(circle));

    System.out.println("~~~~~~~~~~~~~~~~~ Create Rectangle ~~~~~~~~~~~~~~~~~~");

    Rectangle rectangle = new Rectangle(2, 2);

    rectangle.acceptV(calculateArea);

    System.out.println(draw.visitRectangle(rectangle));
    System.out.println("A área do retângulo é: ");
    System.out.println(calculateArea.visitRectangle(rectangle));
    System.out.println("O perímetro do retângulo é: ");
    System.out.println(calculatePerimeter.visitRectangle(rectangle));
    System.out.println("Maximizando o tamanho do retângulo: ");
    System.out.println(maximizeFig.visitRectangle(rectangle));

    System.out.println("~~~~~~~~~~~~~~~~~ Create Trapezoid ~~~~~~~~~~~~~~~~~~");

    Trapezoid trapezoid = new Trapezoid(16, 26, 13, 13);

    System.out.println(draw.visitTrapezoid(trapezoid));
    System.out.println("A área do trapézio é: ");
    System.out.println(calculateArea.visitTrapezoid(trapezoid));
    System.out.println("O perímetro do trapézio é: ");
    System.out.println(calculatePerimeter.visitTrapezoid(trapezoid));
    System.out.println("Maximizando o tamanho do trapézio em 2x: ");
    System.out.println(maximizeFig.visitTrapezoid(trapezoid));

    System.out.println("~~~~~~~~~~~~~~~~~ Create Triangle ~~~~~~~~~~~~~~~~~~~");

    Triangle triangle = new Triangle(3, 4, 5);

    System.out.println(draw.visitTriangle(triangle));
    System.out.println("A área do triângulo é: ");
    System.out.println(calculateArea.visitTriangle(triangle));
    System.out.println("O perímetro do triângulo é: ");
    System.out.println(calculatePerimeter.visitTriangle(triangle));
    System.out.println("Maximizando o tamanho do triângulo em 2x: ");
    System.out.println(maximizeFig.visitTriangle(triangle));

    }
}
