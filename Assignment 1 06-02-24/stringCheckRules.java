<<<<<<< HEAD
import java.util.Scanner;

public class stringCheckRules {
    public boolean check(String str, int i){
        //base case if i reaches
        // the end of string return true
        if(i == str.length()){
            return true;
        }
        //breaking it in sub problem as string should start with 'a' only
        // so we can check for remaining string whenever we encounter 'a'
        if(str.charAt(i) == 'a'){
            return check(str, i + 1);
        }

        //now the case when we encounter "bb"
        if(str.startsWith("bb", i)){
            //checking if after "bb" its 'a' or not if not return false and
            // again check for remaining string if we encounter an a
            if(i + 2 < str.length() && str.charAt(i+2) == 'a'){
                return check(str, i+3);
            }
            //
            else if(i + 2 == str.length()){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the string : ");

        //taking the value from the user and
        // storing it in n using nextInt() function.
        String str = obj.nextLine();

        //object of stringCheckRules class
        // to access non-static members of the class
        stringCheckRules k = new stringCheckRules();


        System.out.print("String is build according to rules : " + k.check(str, 0));
    }
}
=======
import java.util.Scanner;

public class stringCheckRules {
    public boolean check(String str, int i){
        //base case if i reaches
        // the end of string return true
        if(i == str.length()){
            return true;
        }
        //breaking it in sub problem as string should start with 'a' only
        // so we can check for remaining string whenever we encounter 'a'
        if(str.charAt(i) == 'a'){
            return check(str, i + 1);
        }

        //now the case when we encounter "bb"
        if(str.startsWith("bb", i)){
            //checking if after "bb" its 'a' or not if not return false and
            // again check for remaining string if we encounter an a
            if(i + 2 < str.length() && str.charAt(i+2) == 'a'){
                return check(str, i+3);
            }
            //
            else if(i + 2 == str.length()){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the string : ");

        //taking the value from the user and
        // storing it in n using nextInt() function.
        String str = obj.nextLine();

        //object of stringCheckRules class
        // to access non-static members of the class
        stringCheckRules k = new stringCheckRules();


        System.out.print("String is build according to rules : " + k.check(str, 0));
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
