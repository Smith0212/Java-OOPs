interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class B_13 implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]) {
        B_13 obj = new B_13();
        obj.print();
        obj.show();
    }
}
