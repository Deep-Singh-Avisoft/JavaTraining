<<<<<<< HEAD
import java.util.Scanner;

public class stringToNumber {

    //function to convert string to number
    public int convert(String str, int i){
        //base case if i becomes zero return
        // that element converted as number
        if(i == 0){
            return str.charAt(i) - '0';
        }
        //extracting the character at index i
        char c = str.charAt(i);
        //converting the char to integer
        int ele = c -'0';

        //recursive call for the i-1 th index
        return convert(str, i - 1) *10 + (ele);
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

        //object of stringToNumber class to access
        // non-static functions of the class
        stringToNumber p = new stringToNumber();

        //printing the converted integer
        System.out.print(p.convert(str, str.length()- 1));

    }
}
=======
import java.util.Scanner;

public class stringToNumber {

    //function to convert string to number
    public int convert(String str, int i){
        //base case if i becomes zero return
        // that element converted as number
        if(i == 0){
            return str.charAt(i) - '0';
        }
        //extracting the character at index i
        char c = str.charAt(i);
        //converting the char to integer
        int ele = c -'0';

        //recursive call for the i-1 th index
        return convert(str, i - 1) *10 + (ele);
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

        //object of stringToNumber class to access
        // non-static functions of the class
        stringToNumber p = new stringToNumber();

        //printing the converted integer
        System.out.print(p.convert(str, str.length()- 1));

    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
