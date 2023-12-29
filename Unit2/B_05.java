public class B_05 {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance(0, 100);
        Distance d3 = new Distance(d1);
        System.out.println("d1 object: " + d1);
        System.out.println("Distance of d1 "+ d1.getDistance()+" meters");
        System.out.println("d2 object: " + d2);
        System.out.println("Distance of d2 "+ d2.getDistance()+" meters");
        System.out.println("d3 object: " + d3);
        System.out.println("Distance of d3 "+ d3.getDistance()+" meters");
    }
}

class Distance{
    private double startPoint, endPoint;

    Distance(){
        this(0, 150);     //default constructor
    }

    Distance(double startPoint, double endPoint) {  //overloaded constructor
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    Distance(Distance d1){      //copy constructor
        this.startPoint = d1.startPoint;
        this.endPoint = d1.endPoint;
    }

    //getters and setters
    public double getStartPoint() {         //getter
        return startPoint;
    }
    public double getEndPoint(){            //getter
        return endPoint;
    }
    public void setStartPoint(double startPoint){   //setter
        this.startPoint = startPoint;
    }
    public void setEndPoint(double endPoint){       //setter
        this.endPoint = endPoint;
    }

    double getDistance(){
        return Math.abs(endPoint - startPoint);     //To return absolute value
    }

    public String toString(){
        return "Start Point: " + startPoint + ", End Point: " + endPoint;
    }
}