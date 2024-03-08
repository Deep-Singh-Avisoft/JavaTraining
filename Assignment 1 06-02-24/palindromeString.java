<<<<<<< HEAD
import java.util.Scanner;

public class palindromeString {

    //function to check string is palindrome or not
    public boolean palindrome(String str, int i, int j){

        //base case when i become
        // either greater than or equal to j
        if(i >= j){
            return true;
        }
        //if at some point charachter
        // at i and j are not equal return false
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }
        //increment i and decrement j and return the function call
        return palindrome(str, i+1, j-1);
    }

    //main function
    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the string : ");

        //taking the value from the user and
        // storing it in n using nextInt() function.
        String str = obj.nextLine();

        //object of palindromeString class to access
        // non-static functions of the class
        palindromeString p = new palindromeString();

        //printing whether the string is palindrome or not
        System.out.print("String is palindrome : " + p.palindrome(str, 0, str.length() - 1));
    }
}
=======
import java.util.Scanner;

public class palindromeString {

    //function to check string is palindrome or not
    public boolean palindrome(String str, int i, int j){

        //base case when i become
        // either greater than or equal to j
        if(i >= j){
            return true;
        }
        //if at some point charachter
        // at i and j are not equal return false
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }
        //increment i and decrement j and return the function call
        return palindrome(str, i+1, j-1);
    }

    //main function
    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the string : ");

        //taking the value from the user and
        // storing it in n using nextInt() function.
        String str = obj.nextLine();

        //object of palindromeString class to access
        // non-static functions of the class
        palindromeString p = new palindromeString();

        //printing whether the string is palindrome or not
        System.out.print("String is palindrome : " + p.palindrome(str, 0, str.length() - 1));
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
