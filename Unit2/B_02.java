// Write a program to show the use of static functions and to pass variable length arguments in a function. 
public class B_02 {
    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        MyClass m2 = new MyClass();
        MyClass m3 = new MyClass();
        System.out.println("Total instance of MyClass are " + MyClass.showCount());
        MyClass.print("No Argument");
        MyClass.print("Here are Arguments",1,2,3,4,5,6,7,8,9,10,11,12);

    }
}

class MyClass{
    static int count;
    MyClass(){
        count++;
    }
    static int showCount(){
        return count;
    }
    static void print(String statement, int... intArr){
        System.out.println(statement);
        for(int i=0; i<intArr.length; i++){
            System.out.print(intArr[i]+" ");
        }
    }
}

