import java.util.Scanner;
public class main11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        int decimal = sc.nextInt();
        String roman = "";
        int[] romanValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for(int i = 0; i < romanValues.length; i++){
            while(decimal >= romanValues[i]){
                roman += romanLetters[i];
                decimal -= romanValues[i];
            }
        }
        System.out.println(roman);
    }
}