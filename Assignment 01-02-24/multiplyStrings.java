import java.util.ArrayList;
import java.util.Scanner;

public class multiplyStrings {

    static ArrayList<Integer> addStrings(ArrayList<Integer> l1, ArrayList<Integer> l2){
            ArrayList<Integer> ans = new ArrayList<>();
            int carry = 0;

            for(int i = 0; i < l1.size() || i < l2.size() ; i++){
                int dig1 = i < l1.size() ? l1.get(i) : 0;
                int dig2 = i < l2.size() ? l2.get(i) : 0;

                int sum = dig1 + dig2 + carry;
                carry = sum / 10;

                ans.add(sum % 10);
            }
            if(carry != 0){
                ans.add(carry);
            }
            return ans;
    }
    static ArrayList<Integer> multiply(StringBuilder str, char ch, int numZero){

        ArrayList<Integer> curr = new ArrayList<>();
        for(int i = 0; i < numZero; i++){
            curr.add(0);
        }
        int carry = 0;
        for(int i = 0; i < str.length(); i++){
            int mul = (ch - '0') * (str.charAt(i) - '0') + carry;

            carry = mul / 10;

            curr.add(mul % 10);
        }
        if(carry != 0){
            curr.add(carry);
        }
        return curr;
    }
    static String multiplyStrings(String str1, String str2){
        int size = str1.length() + str2.length();
        ArrayList<Integer> ans = new ArrayList<>(size);
        for(int i = 0; i < size; i++){
            ans.add(0);
        }

        StringBuilder firstNumber = new StringBuilder(str1);
        StringBuilder secondNumber = new StringBuilder(str2);

        // Reverse both the numbers.
        firstNumber.reverse();
        secondNumber.reverse();

        for(int i = 0; i < str1.length(); i++){
            ans = addStrings(multiply(firstNumber, secondNumber.charAt(i), i), ans);
        }

        if (ans.getLast() == 0) {
            ans.removeLast();
        }

        StringBuilder answer = new StringBuilder();
        for(int i = ans.size() - 1; i >= 0; i--){
            answer.append(ans.get(i));
        }
        return answer.toString();
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Str1 : ");
        String str1 = obj.nextLine();
        System.out.print("Enter Str2 : ");
        String str2 = obj.nextLine();
        System.out.print("Multiplication of the strings is : " + multiplyStrings(str1, str2));
    }
}
