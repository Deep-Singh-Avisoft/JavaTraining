<<<<<<< HEAD
import java.util.Scanner;
import java.util.*;
//import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;


public class numRaisedtoRev {

    //function that returns a raised to the power of b
    static long power(long a, long b){
        if(b == 0){
            return 1;
        }
        return a * power(a, b - 1) % mod;
    }
    static long mod = 1000000007;
    //function to raise number to its reverse
    public long raised(long num, long revNum){
        if(revNum == 0){
            return 1;
        }
        if(num == 0){
            return 0;
        }

        return (num * power(num, revNum - 1) )% mod;
    }


    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter num: ");
        //taking the values from the user and
        // storing it in num using nextInt() function.
        long num = obj.nextLong();
        System.out.print("Enter reverse of Num:");
        long rev = obj.nextLong();

        //object of the numRaisedtoRev class to access non-static number
        numRaisedtoRev o = new numRaisedtoRev();

        System.out.print("Number raised to its reverse : " + o.raised(num, rev));
    }
}
=======
import java.util.Scanner;
import java.util.*;
//import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;


public class numRaisedtoRev {

    //function that returns a raised to the power of b
    static long power(long a, long b){
        if(b == 0){
            return 1;
        }
        return a * power(a, b - 1) % mod;
    }
    static long mod = 1000000007;
    //function to raise number to its reverse
    public long raised(long num, long revNum){
        if(revNum == 0){
            return 1;
        }
        if(num == 0){
            return 0;
        }

        return (num * power(num, revNum - 1) )% mod;
    }


    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter num: ");
        //taking the values from the user and
        // storing it in num using nextInt() function.
        long num = obj.nextLong();
        System.out.print("Enter reverse of Num:");
        long rev = obj.nextLong();

        //object of the numRaisedtoRev class to access non-static number
        numRaisedtoRev o = new numRaisedtoRev();

        System.out.print("Number raised to its reverse : " + o.raised(num, rev));
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
