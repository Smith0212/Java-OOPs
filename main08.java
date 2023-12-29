import java.util.Scanner;

public class main08 {
    public  static int ta=0, te=0, ti=0, to=0, tu=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the string : \nor type 'quit' to leave");
            String myStr = sc.nextLine();
            if(myStr.equals("quit")){
                System.out.println("leaving the program...");
                break;
            }
            else{
                int a=0, e=0, i=0, o=0, u=0;
                for(int x=0; x<myStr.length(); x++){
                    myStr = myStr.toLowerCase();
                    switch (myStr.charAt(x)){
                        case 'a':
                        a++;
                        ta++;
                        break;
                        case 'e':
                        e++;
                        te++;
                        break;
                        case 'i':
                        i++;
                        ti++;
                        break;
                        case 'o':
                        o++;
                        to++;
                        break;
                        case 'u':
                        u++;
                        tu++;
                        break;
                    }
                }
                System.out.println("In this string : ");
                System.out.println("a comes "+ a + " times");
                System.out.println("e comes "+ e + " times");
                System.out.println("i comes "+ i + " times");
                System.out.println("o comes "+ o + " times");
                System.out.println("u comes "+ u + " times");
            }
        }
        System.out.println("Total number of vowels in all strings : ");
                System.out.println("a comes "+ ta + " times");
                System.out.println("e comes "+ te + " times");
                System.out.println("i comes "+ ti + " times");
                System.out.println("o comes "+ to + " times");
                System.out.println("u comes "+ tu + " times");
    }
}
