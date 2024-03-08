<<<<<<< HEAD
import java.util.Scanner;

public class noOfDigits {
    static int solve(int N){
        if(N/10 == 0){
            return 1;
        }
        return 1 + solve(N/10);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = obj.nextInt();
        int cnt = 0;
        System.out.print("No. of digits are : " + solve(N));
    }
}
=======
import java.util.Scanner;

public class noOfDigits {
    static int solve(int N){
        if(N/10 == 0){
            return 1;
        }
        return 1 + solve(N/10);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = obj.nextInt();
        int cnt = 0;
        System.out.print("No. of digits are : " + solve(N));
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
