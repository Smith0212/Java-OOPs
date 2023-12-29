public class BS_12 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Triangle();
        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());
    }
}

abstract class Shape {
    double area() {
        System.out.println(" area of shapes");
        return 0;
    }
}

class Circle extends Shape {
    @Override
    double area() {
        double r = 5;
        System.out.println("area of circle : ");
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape {
    @Override
    double area() {
        double l = 10;
        double b = 12;
        System.out.println("area of rectengle : ");
        return l * b;
    }
}

class Triangle extends Shape {
    @Override
    double area() {
        double h = 5;
        double b = 10;
        System.out.println("area of tringle : ");
        return 0.5 * h * b;
    }
}
