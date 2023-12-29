// Smit Sutariya 
// 21BCP142 
public class B_01{
    public static void main(String[] args) {
        Distance d1 = new Distance();
        d1.setStartPoint(150);
        d1.setEndPoint(175.5);
        System.out.println("d1 object: " + d1);
        System.out.println("Distance of d1 "+ d1.getDistance()+" meters");
    }
}

class Distance{
    private double startPoint, endPoint;

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

