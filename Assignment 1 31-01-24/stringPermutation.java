<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class stringPermutation {
    static boolean permutation(String str1, String str2){
        Map<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < str1.length(); i++){
            if(mp.containsKey(str1.charAt(i))){
                mp.put(str1.charAt(i), mp.get(str1.charAt(i)) + 1);
            }
            else{
                mp.put(str1.charAt(i), 1);
            }
        }
        for(int i = 0; i < str2.length(); i++){
            if(mp.containsKey(str2.charAt(i))){
                if(mp.get(str2.charAt(i)) == 1){
                    mp.remove(str2.charAt(i));
                }
                else{
                    mp.put(str2.charAt(i), mp.get(str2.charAt(i)) - 1);
                }
            }
        }
        return mp.isEmpty();
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Str1 : ");
        String str1 = obj.nextLine();
        System.out.print("Enter Str2 : ");
        String str2 = obj.nextLine();

        System.out.print("Str1 and Str2 are permutations of each other : " + permutation(str1, str2));

    }
}
=======
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class stringPermutation {
    static boolean permutation(String str1, String str2){
        Map<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < str1.length(); i++){
            if(mp.containsKey(str1.charAt(i))){
                mp.put(str1.charAt(i), mp.get(str1.charAt(i)) + 1);
            }
            else{
                mp.put(str1.charAt(i), 1);
            }
        }
        for(int i = 0; i < str2.length(); i++){
            if(mp.containsKey(str2.charAt(i))){
                if(mp.get(str2.charAt(i)) == 1){
                    mp.remove(str2.charAt(i));
                }
                else{
                    mp.put(str2.charAt(i), mp.get(str2.charAt(i)) - 1);
                }
            }
        }
        return mp.isEmpty();
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Str1 : ");
        String str1 = obj.nextLine();
        System.out.print("Enter Str2 : ");
        String str2 = obj.nextLine();

        System.out.print("Str1 and Str2 are permutations of each other : " + permutation(str1, str2));

    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
