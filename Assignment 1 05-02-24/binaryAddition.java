import java.util.Scanner;

public class binaryAddition {
    static String addition(String str1, String str2){
        StringBuilder str = new StringBuilder();
        int i = str1.length() - 1, j = str2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += str1.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += str1.charAt(j) - '0';
            }
            if (sum == 0 || sum == 1) {
                str.append(sum);
                carry = 0;
            }
            else if (sum == 2) {
                str.append("0");
                carry = 1;
            }
            else {
                str.append("1");
                carry = 1;
            }
            i--;
            j--;
        }
        if (carry == 1) {
            str.append("1");
        }

        return str.reverse().toString();
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String str1 = obj.nextLine();
        System.out.print("Enter String 2 : ");
        String str2 = obj.nextLine();

        System.out.print("String after addition : " + addition(str1, str2));
    }
}
