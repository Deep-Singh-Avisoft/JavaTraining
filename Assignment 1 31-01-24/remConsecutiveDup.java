import java.util.Scanner;

public class remConsecutiveDup {
    static String remove(String str){
        String ans = "";
        ans += str.charAt(0);
        for(int i = 1; i < str.length(); i++){
            if(ans.charAt(ans.length() - 1) != str.charAt(i)){
                ans += str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Input String : ");
        String str = obj.nextLine();

        System.out.print("String after removing duplicates : " + remove(str));
    }
}
