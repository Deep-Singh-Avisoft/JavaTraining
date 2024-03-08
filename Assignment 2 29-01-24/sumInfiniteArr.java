<<<<<<< HEAD
import java.util.Scanner;

public class sumInfiniteArr {
    static void SumInfinite(Scanner obj){
        System.out.print("Enter Size of the array n:");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        System.out.print("Enter No. of Queries: ");
        int Q = obj.nextInt();
        for(int i = 1; i <= Q; i++){
            System.out.print("Enter value of L for Q " + i + " : ");
            int L = obj.nextInt();
            System.out.print("Enter value of R for Q " + i + " : ");
            int R = obj.nextInt();
            int sum = 0;
            for(int j = L - 1; j < R; j++){
                sum += arr[j % n];
            }
            System.out.println("Sum for Q " + i + " : " + sum);
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        SumInfinite(obj);
    }
}
=======
import java.util.Scanner;

public class sumInfiniteArr {
    static void SumInfinite(Scanner obj){
        System.out.print("Enter Size of the array n:");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        System.out.print("Enter No. of Queries: ");
        int Q = obj.nextInt();
        for(int i = 1; i <= Q; i++){
            System.out.print("Enter value of L for Q " + i + " : ");
            int L = obj.nextInt();
            System.out.print("Enter value of R for Q " + i + " : ");
            int R = obj.nextInt();
            int sum = 0;
            for(int j = L - 1; j < R; j++){
                sum += arr[j % n];
            }
            System.out.println("Sum for Q " + i + " : " + sum);
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        SumInfinite(obj);
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
