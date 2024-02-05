import java.util.Scanner;

public class towerOfhanoi {
    static void solve(int N, String a, String b, String c){
        if(N == 0){
            return;
        }
        solve(N - 1, a, c, b);
        System.out.println("Move " + N + " from " + a  + " to " + b);
        solve(N-1, c, b, a);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = obj.nextInt();

        solve(N, "A", "C", "B");
    }
}
