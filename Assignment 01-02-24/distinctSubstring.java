import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class distinctSubstring {

    static int distinct(String str){
        Map<Character, Integer> mp = new HashMap<>();
        int ans = 0;
        for(int i = 0; i < str.length(); i++){
            if(mp.containsKey(str.charAt(i))){
                ans++;
            }
            else{
                mp.put(str.charAt(i) , 1);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = obj.nextLine();
        System.out.print("No. of req operations : " + distinct(str));
    }
}
