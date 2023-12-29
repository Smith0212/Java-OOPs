public class B_06 {
    public static void main(String[] args) {
        Point p1 = new Point(5, 12);
        Point p2 = new Point();
        System.out.println("Point 1 is: "+p1);
        System.out.println("Point 2 is: "+p2);
        System.out.println("Difference using Instance Method: " + p1.getDistanceFromInstance(p2));
        System.out.println("Difference using Static Method: " + Point.getDistance(p1, p2));
        System.out.println("Difference using Instance Method: " + p1.getMidPointFromInstance(p2));
        System.out.println("Difference using Static Method: " + Point.getMidPoint(p1, p2));
        System.out.println();
    }
}

class Point{
    float x,y;
    Point(){
        this(0,0);
    }
    Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    Point(Point p){
        this(p.x, p.y);
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

    static double getDistance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x-p2.x,2) + Math.pow(p1.y-p2.y,2));
    }

    public double getDistanceFromInstance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x,2) + Math.pow(this.y-p.y,2));
    }

    static Point getMidPoint(Point p1, Point p2){                                                           
        return new Point((p1.x+p2.x)/2, (p1.y+p2.y)/2);
    }

    public Point getMidPointFromInstance(Point p){
        return new Point((this.x+p.x)/2, (this.y+p.y)/2);
    }
}