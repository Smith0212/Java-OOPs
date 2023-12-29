import java.util.Scanner;

public class listOfPrimeNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till you want prime numbers : ");
        int a = sc.nextInt();
        for(int i=2; i<=a; i++){
            boolean flag = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(i);
            }
        }
    }
}
