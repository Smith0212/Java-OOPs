import java.util.Scanner;

public class maxOfThreeNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();

        if (a>b && a>c){
            System.out.print(a+" is gretest number");
        }
        else if (b>c){
            System.out.print(b+" is gretest number");
        }
        else{
            System.out.print(c+" is gretest number");
        }
    }
    
}
