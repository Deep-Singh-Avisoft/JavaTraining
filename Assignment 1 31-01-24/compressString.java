import java.util.Scanner;

public class compressString {
    static String compress(String str){
        String ans = " ";
        char prev = str.charAt(0);
        int cnt = 1;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) != prev || i == str.length() - 1){
                ans += prev;

                if(cnt > 1){
                    char c = (char)(cnt + '0');
                    ans += c;
                }
                if(i == str.length() - 1 && str.charAt(i) != prev){
                    ans += str.charAt(i);
                }
                prev = str.charAt(i);
                cnt = 1;
            }
            else{
                cnt++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Input String : ");
        String str = obj.nextLine();

        System.out.print("String after removing duplicates : " + compress(str));
    }
}
