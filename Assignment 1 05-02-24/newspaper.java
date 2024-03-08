<<<<<<< HEAD
import java.util.Collections;
import java.util.Scanner;

public class newspaper {
    static String solve(String[] arr){
        StringBuilder ans = new StringBuilder();
        for (String string : arr) {
            StringBuilder str = new StringBuilder();
            boolean flag = true;
            for (int j = 0; j < string.length(); j++) {
                char ch = string.charAt(j);
                if (ch == ' ') {
                    str.append(' ');
                    flag = true;
                } else if (!Character.isDigit(ch)) {
                    if(flag){
                        char c = Character.toUpperCase(ch);
                        str.append(c);
                        flag = false;
                    }
                    else {
                        str.append(ch);
                    }
                }
            }
            ans.append(str);
            ans.append(' ');
        }
        return ans.toString();
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter Size of the array of strings : ");
        int size = obj.nextInt();
        String[] arr = new String[size];
        for(int i = 0; i < size; i++){
            arr[i] = obj1.nextLine();
        }
        System.out.print("Concatenated String : " + solve(arr));
    }
}
=======
import java.util.Collections;
import java.util.Scanner;

public class newspaper {
    static String solve(String[] arr){
        StringBuilder ans = new StringBuilder();
        for (String string : arr) {
            StringBuilder str = new StringBuilder();
            boolean flag = true;
            for (int j = 0; j < string.length(); j++) {
                char ch = string.charAt(j);
                if (ch == ' ') {
                    str.append(' ');
                    flag = true;
                } else if (!Character.isDigit(ch)) {
                    if(flag){
                        char c = Character.toUpperCase(ch);
                        str.append(c);
                        flag = false;
                    }
                    else {
                        str.append(ch);
                    }
                }
            }
            ans.append(str);
            ans.append(' ');
        }
        return ans.toString();
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter Size of the array of strings : ");
        int size = obj.nextInt();
        String[] arr = new String[size];
        for(int i = 0; i < size; i++){
            arr[i] = obj1.nextLine();
        }
        System.out.print("Concatenated String : " + solve(arr));
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
