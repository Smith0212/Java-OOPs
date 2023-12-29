// Write a program that implements two or more constructors in the class. One constructor will call the other constructor using ‘this’ pointer. 
public class BS_05 {
    public static void main(String[] args) {
        distance d1 = new distance();
        // d1.setStartPoint(149.5);
        // d1.setendPoint(300.5);
        distance d2 = new distance(125, 175.5);
        distance d3 = new distance(d1);
        System.out.println("distance d1 : "+ d1);
        System.out.println("distance of d1 is "+ d1.getDistance()+" meters");
        System.out.println("distance d2 : "+ d2);
        System.out.println("distance of d2 is "+ d2.getDistance()+" meters");
        System.out.println("distance d3 : "+ d3);
        System.out.println("distance of d3 is "+ d3.getDistance()+" meters");
    }
}

class distance {
    private double startPoint, endPoint;

    // deflut constructor
    distance() {
        this(149.5, 300.5);
    }

    // overloded constructor
    distance(double startPoint, double endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    // copy constructor
    distance(distance d1){
        this.startPoint = d1.startPoint;
        this.endPoint = d1.endPoint;
    }

    //setter method 
    void setStartPoint(double startPoint){
        this.startPoint = startPoint;
    }

    void setendPoint(double endPoint){
        this.endPoint = endPoint;
    }

    // get distence
    double getDistance(){
        return (endPoint - startPoint);
    }

    // toString method
    public String toString(){
        return "start point "+ startPoint + " end point "+ endPoint;
    }
}