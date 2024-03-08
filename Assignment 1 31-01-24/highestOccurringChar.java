<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class highestOccurringChar {
    static char check(String str){
        Map<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i),mp.get(str.charAt(i)) + 1);
            }
            else{
                mp.put(str.charAt(i), 1);
            }
        }
        int cnt = 0;
        char ans = ' ';
        for(Map.Entry<Character, Integer> e : mp.entrySet()){
            if(e.getValue() > cnt){
                ans = e.getKey();
                cnt = e.getValue();
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Input String : ");
        String str = obj.nextLine();

        System.out.print("String after removing duplicates : " + check(str));
    }
}
=======
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class highestOccurringChar {
    static char check(String str){
        Map<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            if(mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i),mp.get(str.charAt(i)) + 1);
            }
            else{
                mp.put(str.charAt(i), 1);
            }
        }
        int cnt = 0;
        char ans = ' ';
        for(Map.Entry<Character, Integer> e : mp.entrySet()){
            if(e.getValue() > cnt){
                ans = e.getKey();
                cnt = e.getValue();
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Input String : ");
        String str = obj.nextLine();

        System.out.print("String after removing duplicates : " + check(str));
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
