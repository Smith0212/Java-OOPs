import java.util.Scanner;

public class primeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        boolean isprime=true;
        for (int i=2; i<a; i++){
            if (a%i==0){
                System.out.println("Given number is not prime");
                isprime=false;
                break;
            }    
        }
        if(isprime==true){
            System.out.println("Given number is prime");
        }
    }
}