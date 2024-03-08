<<<<<<< HEAD
import java.util.Scanner;

public class calculatenCr {

    //function to calculate nCr
    public int calc(int n, int r){
        //if n less than r then return 0
        if(n < r){
            return 0;
        }
        // if r == 0 then return 0
        if(r == 0){
            return 0;
        }
        //if r is 1 then nCr of the n is always n
        if(r == 1){
            return n;
        }
        if(n == 1){
            return 1;
        }

        return calc(n-1, r-1) + calc(n-1,r);
    }
    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter n: ");

        //taking the values from the user and
        // storing it in M and N using nextInt() function.
        int n = obj.nextInt();
        System.out.print("Enter r: ");
        int r = obj.nextInt();

        //object of class calculatenCr to access non-static members of the class
        calculatenCr o = new calculatenCr();
        //printing the value
        System.out.print("nCr value for " + n + " and " + r + " are : " + o.calc(n, r));
    }
}
=======
import java.util.Scanner;

public class calculatenCr {

    //function to calculate nCr
    public int calc(int n, int r){
        //if n less than r then return 0
        if(n < r){
            return 0;
        }
        // if r == 0 then return 0
        if(r == 0){
            return 0;
        }
        //if r is 1 then nCr of the n is always n
        if(r == 1){
            return n;
        }
        if(n == 1){
            return 1;
        }

        return calc(n-1, r-1) + calc(n-1,r);
    }
    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter n: ");

        //taking the values from the user and
        // storing it in M and N using nextInt() function.
        int n = obj.nextInt();
        System.out.print("Enter r: ");
        int r = obj.nextInt();

        //object of class calculatenCr to access non-static members of the class
        calculatenCr o = new calculatenCr();
        //printing the value
        System.out.print("nCr value for " + n + " and " + r + " are : " + o.calc(n, r));
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
