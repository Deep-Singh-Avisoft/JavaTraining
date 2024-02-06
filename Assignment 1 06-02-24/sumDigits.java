import java.util.Scanner;

public class sumDigits {

    //function to calculate sum of digits of n
    public int doSum(int n){
        //base case if n becomes 0
        if(n == 0){
            return 0;
        }
        return n%10 + doSum(n/10);
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
        sumDigits s = new sumDigits();
        //printing the sum of the digits of given num
        System.out.print("Sum of digits of " + n + " : " + s.doSum(n));
    }
}
