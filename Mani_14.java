import java.util.Scanner;

public class Mani_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in list (size of list) : ");
        int len = sc.nextInt();
        int[] list = new int[len];
        System.out.println("Enter the number in list ");
        inputArray(len, list, sc);
        System.out.println("The list is : ");
        showArray(len, list);
        shortArray(len, list);
        System.out.println("The shorted list is : ");
        showArray(len, list);        
    }


private static void inputArray(int len, int[] list, Scanner sc){
    for (int i = 0; i < len; i++){
        System.out.println("Enter the element "+(i+1));
        list[i] = sc.nextInt();
    }
}

private static void shortArray(int len, int[] list){
    for (int i = 0; i < len; i++){
        for (int j = (i+1); j < len; j++){
            if (list[i] > list[j]){
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
    }
}

private static void showArray(int len, int[] list){
    for(int i = 0; i < len; i++){
        System.out.print(list[i]+ " ");
    }
    System.out.println();
}
}