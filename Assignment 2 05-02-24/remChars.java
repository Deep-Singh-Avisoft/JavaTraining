import java.util.Scanner;

public class remChars {
    static void solve(String str, StringBuilder ans, int i){
        if(i == str.length()){
            return;
        }
        if(str.charAt(i) != 'x'){
            ans.append(str.charAt(i));
        }
        solve(str, ans, i + 1);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = obj.nextLine();
        StringBuilder ans = new StringBuilder();

        solve(str, ans, 0);

        System.out.print("After removing duplicates: " + ans.toString());
    }
}
