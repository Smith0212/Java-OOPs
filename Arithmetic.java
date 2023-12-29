import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        float a = sc.nextInt();
        System.out.println("Enter the second number : ");
        float b = sc.nextInt();
        System.out.println("addition = "+ (a+b));
        System.out.println("subtection = "+ (a-b));
        System.out.println("multiplication = "+ (a*b));
        if(b==0){
            System.out.println("infinite.!!");
        }
        else{
            System.out.println("divition = "+ (a/b));
        }
        
    }
}