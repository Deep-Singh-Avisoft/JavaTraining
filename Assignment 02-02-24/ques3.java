import java.util.Scanner;

public class ques3 {
    static void solve(int[][] matrix, int N, int M){
        int idx = 0;
        while(idx < N){
            int i = 0, j = idx;
            while(i < N && j < M){
                System.out.print(matrix[i][j] + " ");
                i++;
                j++;
            }
            System.out.println();
            idx++;
        }
    }
    public static void main(String[] args){
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
        solve(matrix, N, M);
    }
}
