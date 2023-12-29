// Write a program to create a “distance” class with properties “start point” and “end point” and with methods to calculate distance.
// Assume that the distance is computed in meters.
// Provide a method to calculate and print the distance for an object.

public class BS_03 {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        d1.setPoint(125, 175.5);
        Distance d2 = new Distance(0, 150);
        System.out.println("d1 object : "+ d1);
        System.out.println("distence of d1 "+ d1.getDistance()+" meters");
        System.out.println("d1 object : "+ d2);
        System.out.println("distence of d2 "+ d2.getDistance()+" meters");
    }
}

class Distance{
    private double startPoint, endPoint;
    
    // defult constructor
    Distance(){}

    // constructor
    Distance(double startPoint,double endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    
    // setter method 
    public void setPoint(double startPoint,double endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    // getDistence method
    double getDistance(){
        return(endPoint - startPoint);
    }

    // toString method
    public String toString(){
        return "Start Point = "+ startPoint +" End Point = "+ endPoint;
    }
}
