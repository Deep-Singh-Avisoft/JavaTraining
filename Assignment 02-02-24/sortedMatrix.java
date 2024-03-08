<<<<<<< HEAD
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class sortedMatrix {
    static ArrayList<Integer> solve(int[][] matrix, int N){
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(pq.size() == N){
                    int ele = pq.peek();
                    pq.poll();
                    ans.add(ele);
                }
                pq.add(matrix[j][i]);
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.peek());
            pq.poll();
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = obj.nextInt();
        System.out.print("Enter matrix elements : ");
        int[][] matrix = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                matrix[i][j] = obj.nextInt();
            }
        }
        ArrayList<Integer> ans = solve(matrix, N);

        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }

    }
}
=======
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class sortedMatrix {
    static ArrayList<Integer> solve(int[][] matrix, int N){
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(pq.size() == N){
                    int ele = pq.peek();
                    pq.poll();
                    ans.add(ele);
                }
                pq.add(matrix[j][i]);
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.peek());
            pq.poll();
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = obj.nextInt();
        System.out.print("Enter matrix elements : ");
        int[][] matrix = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                matrix[i][j] = obj.nextInt();
            }
        }
        ArrayList<Integer> ans = solve(matrix, N);

        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }

    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
