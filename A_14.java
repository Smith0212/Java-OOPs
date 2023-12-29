import java.util.Scanner;
public class A_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sort the elements of list so that they are in ascending order.
        System.out.println("Enter the number of elements in the list");
        int len = sc.nextInt();
        int[] list = new int[len];
        System.out.println("Enter the elements of the list");
        inputArray(len, list, sc);
        System.out.print("The list is: ");
        showArray(list);
        sortArray(len, list);
        System.out.print("The sorted list is: ");
        showArray(list);
    }
    private static void inputArray(int len, int[] list, Scanner sc) {
        for (int i = 0; i < len; i++) {
            System.out.println("Enter the element " + (i + 1));
            list[i] = sc.nextInt();
        }
    }
    private static void sortArray(int len, int[] list) {
        // boolean flag = true;
        for (int i = 0; i < len; i++) {
            // flag = false;
            for (int j = i+1; j < len; j++) {
                if (list[i] > list[j]) {
                    // flag=true;
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
    private static void showArray(int[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}