<<<<<<< HEAD
import java.util.Scanner;

public class equalVowels {
    static boolean solve(String str){
        int i = 0, j = str.length() - 1;
        int cnt1 = 0, cnt2 = 0;
        while(i < str.length()/2 && j >= str.length()/2){
            char c1 = str.charAt(i), c2 = str.charAt(j);
            if(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u'){
                cnt1++;
            }
            if(c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u'){
                cnt2++;
            }
            i++;
            j--;
        }
        return cnt1 == cnt2;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = obj.nextLine();

        System.out.print("vowels are equal : " + solve(str));
    }
}
=======
import java.util.Scanner;

public class equalVowels {
    static boolean solve(String str){
        int i = 0, j = str.length() - 1;
        int cnt1 = 0, cnt2 = 0;
        while(i < str.length()/2 && j >= str.length()/2){
            char c1 = str.charAt(i), c2 = str.charAt(j);
            if(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u'){
                cnt1++;
            }
            if(c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u'){
                cnt2++;
            }
            i++;
            j--;
        }
        return cnt1 == cnt2;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = obj.nextLine();

        System.out.print("vowels are equal : " + solve(str));
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
