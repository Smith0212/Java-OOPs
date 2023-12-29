import java.util.Scanner;
class person {
    String name;
    person(){
        name = "XYZ";   
    }
    void print(){
        System.out.println(name);
    }

}
class student extends person {
    String courseName;
    void print(){
        System.out.println(this.name+", "+this.courseName);
    }
}
class inheritance {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    person p = new person();
    student s = new student();
    // System.out.println("Enter the name : ");
    // p.name = sc.nextLine();
    // System.out.println("Enter the name : ");
    // s.name = sc.nextLine();
    // System.out.println(p);
    // System.out.println(s);
    p.print();
    s.print();
   }
}
