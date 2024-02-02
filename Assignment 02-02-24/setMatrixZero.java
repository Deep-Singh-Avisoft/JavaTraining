import java.util.ArrayList;
import java.util.Scanner;


public class setMatrixZero {

    static int[][] solve(int[][] matrix, int N, int M){
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i = 0; i < row.size(); i++){
            for(int  j = 0; j < M; j++){
                matrix[row.get(i)][j] = 0;
            }
        }
        for(int i = 0; i < col.size(); i++){
            for(int  j = 0; j < N; j++){
                matrix[j][col.get(i)] = 0;
            }
        }
        return matrix;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = obj.nextInt();
        System.out.print("Enter M: ");
        int M = obj.nextInt();
        int[][] matrix = new int[N][M];
        System.out.print("Enter matrix elements: ");
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                matrix[i][j] = obj.nextInt();
            }
        }

        matrix = solve(matrix, N, M);
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
