public class Main_12 {
    public static void main(String[] args) {
        float a = 5.5f;
        double r = 3.5, x = 5, y = 3, z = 9, l = 10, b = 6;
        maths ar = new maths();
        System.out.println("Area of circle with radius "+3.5+" is "+ar.area(r));
        System.out.println("Area of square with length "+5.5+" is "+ar.area(a));
        System.out.println("Area of rectengle with length "+10+" & width "+6+" is "+ar.area(l, b));
        System.out.println("Area of rectengle with length "+5+" width "+3+" & hight "+9+" is "+ar.area(x, y, z));        
    }
}
// java program to find the area of shaps using mathod overloding 
class maths {
    public float area (float a){          // area of square
        return a*a;
    }

    public double area (Double r){          // area of circle
        return 3.14 * r*r;
    }

    public double area (Double x, Double y, Double z){          // area of cube
        return x*y*z;
    }

    public double area (Double l, double b){          // area of rectengle
        return l*b;
    }
}