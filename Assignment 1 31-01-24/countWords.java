<<<<<<< HEAD
import java.util.Scanner;

public class countWords {
    static int count(String str){
        int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ' || i == str.length() - 1){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the input String : ");
        String str = obj.nextLine();
        System.out.print("No. of words : " + count(str));
    }
}
=======
import java.util.Scanner;

public class countWords {
    static int count(String str){
        int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ' || i == str.length() - 1){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the input String : ");
        String str = obj.nextLine();
        System.out.print("No. of words : " + count(str));
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
