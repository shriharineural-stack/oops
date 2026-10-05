import java.util.Scanner;

abstract class Shape {
    int x, y;

    abstract void printArea();
}

class Rectangle1 extends Shape {

    void printArea() {
        double area = x * y;
        System.out.println("Area of Rectangle is " + area);
    }
}

class Triangle extends Shape {

    void printArea() {
        double area = (x * y) / 2.0;
        System.out.println("Area of Triangle is " + area);
    }
}

class Circle extends Shape {

    void printArea() {
        double area = (22.0 * x * x) / 7.0;
        System.out.println("Area of Circle is " + area);
    }
}

public class Shapes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        Rectangle1 r = new Rectangle1();
        r.x = x1;
        r.y = y1;
        r.printArea();

        Triangle t = new Triangle();
        t.x = x1;
        t.y = y1;
        t.printArea();

        Circle c = new Circle();
        c.x = x1;
        c.printArea();

        sc.close();
    }
}
