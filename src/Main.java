import java.util.Scanner;
/*
Question : Write a program to display transpose of matrix that is given by user.
 */
public class Main {
    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] findTranspose(int[][] matrix, int r, int c){
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++){
            for (int j = 0; j < r; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,sum;
        System.out.println("Enter the number row :");
        a = sc.nextInt();
        System.out.println("Enter the number of column :");
        b = sc.nextInt();
        int[][] matrix = new int[a][b];
        sum = a * b;
        System.out.println("Enter " + sum + " values :");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original values :");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transpose result :");
        int[][] ans = findTranspose(matrix, a,b);
    }
}