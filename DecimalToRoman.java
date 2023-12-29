import java.util.Scanner;
public class A_11{
    public static void main(String[] args) {
        //Decimal to Roman
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        sc.close();
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
