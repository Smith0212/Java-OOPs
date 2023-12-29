import java.lang.Math; //import math module
import java.util.Scanner;

public class main13  {
    public static void main(String[] args) {
        // declaring variables
        int choice;
        double num1, num2;
        // input
        Scanner input = new Scanner(System.in);
        choice = showMenu(input);
        while (choice <= 13 && choice >= 1) {
            // Press 1 to enter number press 2 for PI or e
            num1 = numInput(input, 1);
            // process
            switch (choice) {
                case 1:
                    num2 = numInput(input, 2);
                    System.out.println("Addition: " + (num1 + num2));
                    break;
                case 2:
                    num2 = numInput(input, 2);
                    System.out.println("Subtraction: " + (num1 - num2));
                    break;
                case 3:
                    num2 = numInput(input, 2);
                    System.out.println("Multiplication: " + (num1 * num2));
                    break;
                case 4:
                    num2 = numInput(input, 2);
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed");
                    }
                    System.out.println("Division: " + (num1 / num2));
                    break;
                case 5:
                    num2 = numInput(input, 2);
                    System.out.println("Exponentiation: " + Math.pow(num1, num2));
                    break;
                case 6:
                    System.out.println("Square Root: " + Math.sqrt(num1));
                    break;
                case 7:
                    System.out.println("Logarithm: " + Math.log(num1));
                    break;
                case 8:
                    System.out.println("Sine: " + Math.sin(num1));
                    break;
                case 9:
                    System.out.println("Cosine: " + Math.cos(num1));
                    break;
                case 10:
                    System.out.println("Tangent: " + Math.tan(num1));
                    break;
                case 11:
                    System.out.println("Sinh: " + Math.sinh(num1));
                    break;
                case 12:
                    System.out.println("Cosh: " + Math.cosh(num1));
                    break;
                case 13:
                    System.out.println("Tanh: " + Math.tanh(num1));
                    break;
            }
            choice = showMenu(input);
        }
        input.close();
    }

    public static int showMenu(Scanner input) {
        System.out.println("""
                Press the following keys to perform the desired operation:
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                5. Exponentiation
                6. Square Root
                7. Logarithm
                8. Sine
                9. Cosine
                10. Tangent
                11. Sinh
                12. Cosh
                13. Tanh
                14. Exit""");
        // input
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        return choice;
    }

    public static double numInput(Scanner input, int no) {
        System.out.println("""
                Press 1: to Enter Number
                Press 2: for PI
                Press any other number for: e
                """);
        int a = input.nextInt();
        double myNum;
        if (a == 1) {
            System.out.print("Enter number " + no + ": ");
            myNum = input.nextDouble();
        } else if (a == 2) {
            myNum = Math.PI;
        } else {
            myNum = Math.E;
        }
        return myNum;
    }
}