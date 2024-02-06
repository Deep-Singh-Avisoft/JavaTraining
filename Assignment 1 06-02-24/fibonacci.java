import java.util.Scanner;

public class fibonacci {

    //function to find nth number
    // of the fibonacci sequence
    public int fibo(int n){
        //base case when n == 0 return 0
        if(n == 0){
            return 0;
        }
        // when n == 1 return 1
        else if(n == 1){
            return 1;
        }
        else
        // else return the sum
        // of previous two digits of the sequence
        return fibo(n-1) + fibo(n-2);
    }

    //main function
    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the nth number of the fibonacci sequence you want to return : ");

        //taking the value from the user and
        // storing it in n using nextInt() function.
        int n = obj.nextInt();

        //object of fibonacci class to
        // access non-static members of the class
        fibonacci f = new fibonacci();

        //printing nth number of the fibonacci sequence
        System.out.print("n " + f.fibo(n));
    }
}
