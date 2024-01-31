import java.util.Scanner;

public class stringPalindrome {
    static boolean check(String str){
        int i = 0, j = str.length() - 1;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Input String : ");
        String str = obj.nextLine();
        System.out.print("String is palindrome : " + check(str));
    }
}
