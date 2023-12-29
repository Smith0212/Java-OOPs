public class A_12 {
    public static void main(String[] args) {
        math ar = new math();
        double r = 2.5, l = 3.5, b = 4.5, h=5.5;
        float a = (float) 5.0;
        System.out.println("Area of circle with radius "+r+ " unit(s) is " + ar.area(r)+" unit square");
        System.out.println("Area of parallelogram with length "+l+ " unit(s) and breadth "+b+ " unit(s) is " + ar.area(l, b)+" unit square");
        System.out.println("Area of square with side "+a+" unit(s) is "+ar.area(a));
        System.out.println("Area of triangle with sides "+l+" unit(s)," + b+" unit(s) and " + h +" unit(s) is " + ar.area(l,b,h)+" unit square");
    }
}
//Write a Java Program to find area of Geometric figures using method Overloading.
class math{
    public double area(double r){        //area of circle
        return 3.14*r*r;
    }
    public float area(float a){       //area of square
        return a*a;
    }
    public double area(double l,double b){   //area of parallelogram
        return l*b;
    }
    public double area(double a, double b, double c){    //area of triangle
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}