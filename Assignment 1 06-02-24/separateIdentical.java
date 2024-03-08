<<<<<<< HEAD
import java.util.Scanner;

public class separateIdentical {
    // static StringBuilder to store ans
    static StringBuilder ans = new StringBuilder();

    //function to separate the identical char
    public void separate(String str, char prev, int i){
        //base case when index reaches
        // to the end of the string
        if(i == str.length()){
            return;
        }
        //checking if the consecutive characters are same or not
        if(str.charAt(i) == prev){
            ans.append('*'); // if same append '*'
        }
        //append the current character
        ans.append(str.charAt(i));

        //recursive call for i + 1 th index
        separate(str, str.charAt(i), i + 1);
    }
    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the string : ");

        //taking the value from the user and
        // storing it in n using nextInt() function.
        String str = obj.nextLine();

        //object of separateIdentical class
        // to access non-static members of the class
        separateIdentical s = new separateIdentical();
        //function call
        s.separate(str, ' ', 0);
        //printing the answer
        System.out.print("String after separation : " + ans.toString());

    }
}
=======
import java.util.Scanner;

public class separateIdentical {
    // static StringBuilder to store ans
    static StringBuilder ans = new StringBuilder();

    //function to separate the identical char
    public void separate(String str, char prev, int i){
        //base case when index reaches
        // to the end of the string
        if(i == str.length()){
            return;
        }
        //checking if the consecutive characters are same or not
        if(str.charAt(i) == prev){
            ans.append('*'); // if same append '*'
        }
        //append the current character
        ans.append(str.charAt(i));

        //recursive call for i + 1 th index
        separate(str, str.charAt(i), i + 1);
    }
    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the string : ");

        //taking the value from the user and
        // storing it in n using nextInt() function.
        String str = obj.nextLine();

        //object of separateIdentical class
        // to access non-static members of the class
        separateIdentical s = new separateIdentical();
        //function call
        s.separate(str, ' ', 0);
        //printing the answer
        System.out.print("String after separation : " + ans.toString());

    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
