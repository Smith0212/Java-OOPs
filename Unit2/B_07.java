public class B_07 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Student s1 = new Student("Smith", 18, 142, "CSE", "PDEU");

        System.out.println("Person 1 is: "+p1);
        System.out.println("Student 1 is: "+s1);
    }
}

class Person{
    private String name;
    private int age;

    Person(){
        this.name = "John Doe";
        this.age = 18;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person{
    private int rollNo;
    private String branch;
    private String collegeName;
    Student(){
        super();
        this.rollNo = 0;
        this.branch = "CSE";
        this.collegeName = "XYZ College";
    }

    Student(String name, int age, int rollNo, String branch, String collegeName){
        super(name, age);
        this.rollNo = rollNo;
        this.branch = branch;
        this.collegeName = collegeName;
    }

    public String toString(){
        return super.toString() + ", Roll No: " + rollNo + ", Branch: " + branch + ", College Name: " + collegeName;
    }
}