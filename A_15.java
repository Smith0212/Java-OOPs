import java.util.Scanner;
public class A_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the first matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter the number of rows and columns of the second matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        if (c1 != r2) {
            System.out.println("The matrices cannot be multiplied");
        } else {
            int[][] mat1 = new int[r1][c1];
            int[][] mat2 = new int[r2][c2];
            System.out.println("Enter the elements of the first matrix");
            inputMatrix(r1, c1, mat1, sc);
            System.out.println("Enter the elements of the second matrix");
            inputMatrix(r2, c2, mat2, sc);
            int[][] mat3 = new int[r1][c2];
            mat3 = multiplyMatrix(r1, c1, r2, c2, mat1, mat2);
            System.out.println("The multiplied matrix is: ");
            showMatrix(r1, c2, mat3);
        }
        sc.close();
    }

    private static void inputMatrix(int r1, int c1, int[][] mat1, Scanner sc) {
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.println("Enter the element " + (i + 1) + "," + (j + 1));
                mat1[i][j] = sc.nextInt();
            }
        }
    }

    private static void showMatrix(int r1, int c2, int[][] mat3) {
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] multiplyMatrix(int r1, int c1, int r2, int c2, int[][] mat1, int[][] mat2) {
        int[][] mat3 = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                mat3[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return mat3;
    }
}