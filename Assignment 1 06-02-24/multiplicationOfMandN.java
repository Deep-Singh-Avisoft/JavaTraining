import java.util.Scanner;

public class multiplicationOfMandN {

    public int multiply(int M,int N){
        if(N == 0){
            return 0;
        }
        return M + multiply(M, N - 1);
    }
    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter M: ");

        //taking the values from the user and
        // storing it in M and N using nextInt() function.
        int M = obj.nextInt();
        System.out.print("Enter M: ");
        int N = obj.nextInt();

        //object of multiplicationOfMandN class to access
        // non-static functions of the class
        multiplicationOfMandN o = new multiplicationOfMandN();

        System.out.print("Multiplication of " + M + " and " + N + " is : " + o.multiply(M, N));

    }
}
