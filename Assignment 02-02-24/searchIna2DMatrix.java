<<<<<<< HEAD
import java.util.Scanner;

public class searchIna2DMatrix {
    static boolean solve(int[][] matrix, int N, int M, int X){
        int i = 0;int j = M - 1;
        while(i < N){
            while(j >= 0){
                if(matrix[i][j] == X){
                    return true;
                }
                if(matrix[i][j] < X){
                    break;
                }
                else{
                    j--;
                }
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = obj.nextInt();
        System.out.print("Enter M: ");
        int M = obj.nextInt();
        int[][] matrix = new int[N][M];
        System.out.print("Enter matrix elements: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = obj.nextInt();
            }
        }
        System.out.print("Enter X : ");
        int X = obj.nextInt();

        System.out.print("X is present in the matrix : " + solve(matrix, N, M, X));
    }
}
=======
import java.util.Scanner;

public class searchIna2DMatrix {
    static boolean solve(int[][] matrix, int N, int M, int X){
        int i = 0;int j = M - 1;
        while(i < N){
            while(j >= 0){
                if(matrix[i][j] == X){
                    return true;
                }
                if(matrix[i][j] < X){
                    break;
                }
                else{
                    j--;
                }
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = obj.nextInt();
        System.out.print("Enter M: ");
        int M = obj.nextInt();
        int[][] matrix = new int[N][M];
        System.out.print("Enter matrix elements: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = obj.nextInt();
            }
        }
        System.out.print("Enter X : ");
        int X = obj.nextInt();

        System.out.print("X is present in the matrix : " + solve(matrix, N, M, X));
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
