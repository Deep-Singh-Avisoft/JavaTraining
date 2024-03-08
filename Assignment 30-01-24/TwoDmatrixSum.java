<<<<<<< HEAD
import java.util.Scanner;

public class TwoDmatrixSum {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = obj.nextInt();
        int[][] arr = new int[N][N];

        System.out.print("Enter Elements of the matrix : ");
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = obj.nextInt();
            }
        }
        int sum = 0;
        int idx = 0;
        for(int i = 0 ; i < N; i++){
            sum += arr[idx][i] != -1 ? arr[idx][i] : 0;
            arr[idx][i] = -1;
        }
        for(int i = 0 ; i < N; i++){
            sum += arr[i][idx] != -1 ? arr[i][idx] : 0;
            arr[i][idx] = -1;
        }
        idx = N - 1;
        for(int i = 0 ; i < N; i++){
            sum += arr[idx][i] != -1 ? arr[idx][i] : 0;
            arr[idx][i] = -1;
        }
        for(int i = 0 ; i < N; i++){
            sum += arr[i][idx] != -1 ? arr[i][idx] : 0;
            arr[i][idx] = -1;
        }
        int i = 0, j = 0;
        while(i < N && j < N){
            sum += arr[i][j] != -1 ? arr[i][j] : 0;
            arr[i][j] = -1;
            i++;
            j++;
        }
        i = 0; j = N - 1;
        while( i < N && j >= 0){
            sum += arr[i][j] != -1 ? arr[i][j] : 0;
            arr[i][j] = -1;
            i++;
            j--;
        }

        System.out.print("Sum : " + sum);
    }
}
=======
import java.util.Scanner;

public class TwoDmatrixSum {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = obj.nextInt();
        int[][] arr = new int[N][N];

        System.out.print("Enter Elements of the matrix : ");
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = obj.nextInt();
            }
        }
        int sum = 0;
        int idx = 0;
        for(int i = 0 ; i < N; i++){
            sum += arr[idx][i] != -1 ? arr[idx][i] : 0;
            arr[idx][i] = -1;
        }
        for(int i = 0 ; i < N; i++){
            sum += arr[i][idx] != -1 ? arr[i][idx] : 0;
            arr[i][idx] = -1;
        }
        idx = N - 1;
        for(int i = 0 ; i < N; i++){
            sum += arr[idx][i] != -1 ? arr[idx][i] : 0;
            arr[idx][i] = -1;
        }
        for(int i = 0 ; i < N; i++){
            sum += arr[i][idx] != -1 ? arr[i][idx] : 0;
            arr[i][idx] = -1;
        }
        int i = 0, j = 0;
        while(i < N && j < N){
            sum += arr[i][j] != -1 ? arr[i][j] : 0;
            arr[i][j] = -1;
            i++;
            j++;
        }
        i = 0; j = N - 1;
        while( i < N && j >= 0){
            sum += arr[i][j] != -1 ? arr[i][j] : 0;
            arr[i][j] = -1;
            i++;
            j--;
        }

        System.out.print("Sum : " + sum);
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
