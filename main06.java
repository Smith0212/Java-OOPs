import java.util.Scanner;

public class main06 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String line = sc.nextLine();
        String myStr = line.toLowerCase();
        int consonants = 0, Vowels = 0;
        for(int i=0; i<myStr.length(); i++){
            if(Character.isLetter(myStr.charAt(i))){
                if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'e' || myStr.charAt(i) == 'i' || myStr.charAt(i) == 'o' || myStr.charAt(i) == 'u'){
                    Vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println("vowels = "+Vowels);
        System.out.print("consonants = "+consonants); 
    }
} 