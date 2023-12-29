import java.util.Scanner;

public class B_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.println("1: Area of Triangle ");
        System.out.println("2: Area of Rectangle ");
        System.out.println("3: Area of Circle ");
        System.out.println("4: Exit ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Triangle t1 = new Triangle();
                System.out.println("Enter height of triangle: ");
                t1.b = sc.nextDouble();
                System.out.println("Enter length of triangle: ");
                t1.h = sc.nextInt();
                t1.fun();
                // System.out.println("Area: "+t1.area);
                break;
            case 2:
                Rectangle r1 = new Rectangle();
                System.out.println("Enter length of Rectangle: ");
                r1.l = sc.nextInt();
                System.out.println("Enter breadth of Rectangle: ");
                r1.b = sc.nextInt();
                r1.fun();
                // System.out.println("Area: "+r1.area);
                break;
            case 3:
                Circle c1 = new Circle();
                System.out.println("Enter radius of Circle: ");
                c1.r = sc.nextDouble();
                c1.fun();
                // System.out.println("Area: "+c1.area);
                break;
            case 4:
                System.out.println("Thank you for using!!");
                break;
        }

    }

}

abstract class Shape {
    void area(int h, double b) {
        System.out.println("In the triangle");
        System.out.println(0.5 * h * b);

    }

    void area(int l, int b) {
        System.out.println("In the Rectangle");
        System.out.println(l * b);
        // return l*b;
    }

    void area(double r) {
        // return (3.14*r*r);
        System.out.println("In the Circle");
        System.out.println(3.14 * r * r);
    }
}

class Triangle extends Shape {
    int h;
    double b;

    void fun() {
        area(this.h, this.b);
    }
}

class Rectangle extends Shape {
    int l;
    int b;

    void fun() {
        area(this.l, this.b);
    }
    // int area = area(this.l,this.b);

}

class Circle extends Shape {
    double r;

    void fun() {
        area(this.r);
    }
    // double area = area(this.r);
}


