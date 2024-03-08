<<<<<<< HEAD
import java.util.Scanner;
import java.util.Stack;

public class balancedString {

    static int remo(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(st.empty() || (str.charAt(i) == '(' && st.peek() == '(') ||(str.charAt(i) == ')' && st.peek() == ')')){
                st.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')' && st.peek() == '('){
                st.pop();
            }
        }
        return st.size();
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = obj.nextLine();
        System.out.print("No. of parenthesis to remove :"+ remo(str));
    }
}
=======
import java.util.Scanner;
import java.util.Stack;

public class balancedString {

    static int remo(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(st.empty() || (str.charAt(i) == '(' && st.peek() == '(') ||(str.charAt(i) == ')' && st.peek() == ')')){
                st.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')' && st.peek() == '('){
                st.pop();
            }
        }
        return st.size();
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = obj.nextLine();
        System.out.print("No. of parenthesis to remove :"+ remo(str));
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
