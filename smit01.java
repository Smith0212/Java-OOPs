import java.util.Scanner;

public class smit01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your anual income in lakhs : ");
        float income = sc.nextFloat();
        float text = 0;
        if (income <= 2.5f){
            text = text + 0;
        }
        else if (income > 2.5f && income <= 5.0f){
            text = text + 0.05f * (income - 2.5f);
        }
        else if (income > 5.0f && income <= 10.0f){
            text = text + 0.05f * (5.0f - 2.5f);
            text = text + 0.2f * (income - 5.0f);
        }
        else if (income > 10.0f){
            text = text + 0.05f * (5.0f - 2.5f);
            text = text + 0.2f * (10.0f - 5.0f);
            text = text + 0.3f * (income - 10.0f);
        }
        System.out.println("Total text you have to paid is : "+ text +" lakhs");
    }    
}
