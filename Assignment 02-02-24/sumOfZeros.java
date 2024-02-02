import java.util.Scanner;

public class sumOfZeros {

    static int solve(int[][] matrix, int N, int M){
        int ans = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(matrix[i][j] == 0){
                    if(i - 1 >= 0 && matrix[i-1][j] == 1){
                        ans++;
                    }
                    if(j - 1 >= 0 && matrix[i][j-1] == 1){
                        ans++;
                    }
                    if(i + 1 < N && matrix[i+1][j] == 1){
                        ans++;
                    }
                    if(j + 1 < M && matrix[i][j+1] == 1){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = obj.nextInt();
        System.out.print("Enter M: ");
        int M = obj.nextInt();
        System.out.print("Enter matrix elements : ");
        int[][] matrix = new int[N][M];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                matrix[i][j] = obj.nextInt();
            }
        }
        System.out.print("Sum is : " + solve(matrix, N, M));

    }
}
