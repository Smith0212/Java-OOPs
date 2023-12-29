import java.util.Scanner;
public class A_2_1{
    public static void main(String args[]) {
        int[] arr = new int [5];
        print("hello",arr);

    }
    static void print(String s, int...arr){
        System.out.println(s);
        for (int i = 0; i < arr.length; i++ ){
            System.out.println(arr[i]);
        }
    }
}