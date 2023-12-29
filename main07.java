import java.net.SocketTimeoutException;
import java.util.Scanner;

public class main07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String myStr = sc.nextLine();
        int count = 0;
        for (int i=0; i<myStr.length(); i++){
            if(Character.isUpperCase(myStr.charAt(i))){
                count++;
            }
        }
        System.out.println("Count : "+count); 
    }
    
}
