class Person {
    private String name;
    private int age;
    
    Person(){
        this.name = "Smit";
        this.age = 18;
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "Name : "+ name +", age : "+ age;
    }
}
class Student extends Person{
    int rollNo;
    String course;
    Student(){
        super();
        this.rollNo = 142;
        this.course = "CSE";
    }
    Student(String name, int age, int rollNo, String course){
        super(name, age);
        this.rollNo = rollNo;
        this.course =  course;
    }
    public String toString(){
        return super.toString() +", rollNo : "+ rollNo +", course : "+course;
    }
}
public class BS_09 {
    public static void main(String[] args) {
            Person p1 = new Person();
            Person p2 = new Person("Parth", 19);
            Student s1 = new Student();
            Student s2 = new Student("Saurav", 18, 157, "IT");
            System.out.println("person p1 : "+ p1);
            System.out.println("person p2 : "+ p2);
            System.out.println("person s1 : "+ s1);
            System.out.println("person s2 : "+ s2);        
        }
    }
    
