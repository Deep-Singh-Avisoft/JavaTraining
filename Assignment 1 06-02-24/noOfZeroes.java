<<<<<<< HEAD
import java.util.Scanner;

public class noOfZeroes {

    public int countZeros(int M){
        if(M == 0){
            return 1;
        }
        if(M < 10){
            return 0;
        }
        else if(M % 10 == 0){
            return 1 + countZeros(M/10);
        }
        else{
            return countZeros(M/10);
        }
    }
    public static void main(String[] args) {
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter M: ");

        //taking the values from the user and
        // storing it in M and N using nextInt() function.
        int M = obj.nextInt();
        //object of noOfZeroes class to access
        // non-static functions of the class
        noOfZeroes o = new noOfZeroes();

        System.out.print("No. of zeroes in the number are : " + o.countZeros(M));
    }
}
=======
import java.util.Scanner;

public class noOfZeroes {

    public int countZeros(int M){
        if(M == 0){
            return 1;
        }
        if(M < 10){
            return 0;
        }
        else if(M % 10 == 0){
            return 1 + countZeros(M/10);
        }
        else{
            return countZeros(M/10);
        }
    }
    public static void main(String[] args) {
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter M: ");

        //taking the values from the user and
        // storing it in M and N using nextInt() function.
        int M = obj.nextInt();
        //object of noOfZeroes class to access
        // non-static functions of the class
        noOfZeroes o = new noOfZeroes();

        System.out.print("No. of zeroes in the number are : " + o.countZeros(M));
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
