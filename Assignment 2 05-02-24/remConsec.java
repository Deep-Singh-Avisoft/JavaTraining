<<<<<<< HEAD
import java.util.Scanner;

public class remConsec {
    static void solve(String str, StringBuilder ans, int i, char prev){
        if(i >= str.length()){
            return;
        }
        if(str.charAt(i) != prev){
            ans.append(str.charAt(i));
        }
        solve(str, ans, i+1, str.charAt(i));
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = obj.nextLine();
        StringBuilder ans = new StringBuilder();

        solve(str, ans, 0, ' ');

        System.out.print("After removing duplicates: " + ans.toString());
    }
}
=======
import java.util.Scanner;

public class remConsec {
    static void solve(String str, StringBuilder ans, int i, char prev){
        if(i >= str.length()){
            return;
        }
        if(str.charAt(i) != prev){
            ans.append(str.charAt(i));
        }
        solve(str, ans, i+1, str.charAt(i));
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = obj.nextLine();
        StringBuilder ans = new StringBuilder();

        solve(str, ans, 0, ' ');

        System.out.print("After removing duplicates: " + ans.toString());
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
