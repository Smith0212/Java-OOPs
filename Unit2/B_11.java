class Distance {
    public int feet, inches;
    private int meters, centimeters;
    public final int kilo = 1000; // final keyword

    Distance(int f, int i) {
        meters = 100;
        centimeters = 50;
        this.feet = f;
        this.inches = i;
    }

    void display() {
        System.out.println("feet = " + feet);
        System.out.println("inches = " + inches);
        System.out.println("metres = " + meters);
        System.out.println("centimeters = " + centimeters);
    }

    void addDistance(Distance d3) {
        d3.feet = d3.feet + kilo;
        d3.inches = d3.inches + kilo;
    }
}

public class B_11 {
    public static void main(String args[]) {
        Distance d1 = new Distance(10, 20);
        Distance d3 = new Distance(20, 30);
        d1.display();

        d1.addDistance(d3);
        d3.display();
    }
}
