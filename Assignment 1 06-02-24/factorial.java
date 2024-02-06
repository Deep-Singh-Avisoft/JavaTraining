import java.util.Scanner;

public class factorial {

    //function to find factorial of a number
    public int fact(int n){
        //base condition when n becomes 0
        //return 1 and break the recursive calls
        if(n == 0){
            return 1;
        }

        //multiplying the current value of n
        // and calling the function again for n-1
        return n * fact(n-1);
    }
    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number you want factorial of : ");

        //taking the value from the user and
        // storing it in n using nextInt() function.
        int n = obj.nextInt();

        //object of factorial class to access
        // non-static functions of the class
        factorial f = new factorial();

        //printing the factorial of input n
        System.out.print("Factorial of " + n + " is : " + f.fact(n));
    }
}
