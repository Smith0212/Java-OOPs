import java.util.Scanner;

public class percentage {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your physics marks : ");
        float phy = sc.nextInt();
        System.out.println("Enter your chemistry marks : ");
        float che = sc.nextInt();
        System.out.println("Enter your maths marks : ");
        float math = sc.nextInt();
        System.out.println("Enter your english marks : ");
        float eng = sc.nextInt();
        System.out.println("Enter your computer marks : ");
        float comp = sc.nextInt();
        float percentage = (phy+che+math+eng+comp)*100/500;
        System.out.println("your percentage is : "+ percentage);

    }
    
}
