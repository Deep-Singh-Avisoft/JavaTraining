import java.util.Scanner;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String convertChars(Scanner obj){
        System.out.print("Enter Input String: ");
        String input = obj.nextLine();
        int n = input.length();
        String ans = "";
        for(int i = 0; i < n; i++){
            char ch = input.charAt(i);
            if(Character.isLowerCase(ch)){
                ans += Character.toUpperCase(ch);
            }
            else if(Character.isUpperCase(ch)){
                ans += Character.toLowerCase(ch);
            }
            else{
                ans += ch;
            }
        }
        return ans;
    }
    static void reverse(Scanner obj){
        System.out.print("Enter The Size of Array: ");
        int size = 0;
        size = obj.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = obj.nextInt();
        }

        System.out.println("Array elements before reversig: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i]);
            if(i != size - 1){
                System.out.print(',');
            }
        }
        System.out.println();
        int a = 0, b = size - 1;
        while(a <= b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
        System.out.println("Array elements after reversig: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i]);
            if(i != size - 1){
                System.out.print(',');
            }
        }
    }

    static int countDig(Scanner obj){
        System.out.print("Enter a Number: ");
        int number = obj.nextInt();
        int ans = 0;
        if(number < 0){
            number *= -1;
        }
        if(number == 0){
            ans = 1;
        }
        else{
            int a = 0;
            while(number != 0){
                a = number % 10;
                number = number / 10;
                ans++;
            }
        }
        return ans;
    }
    static void differentiate(Scanner obj){
        System.out.print("Enter Input String: ");
        String str = obj.nextLine();
        int n = str.length();
        int vowel = 0, consonent = 0, other = 0;
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowel++;
                }
                else{
                    consonent++;
                }
            }
        }
        other = n - (consonent + vowel);

        System.out.println("The number of vowels is:" + vowel);
        System.out.println("The number of consonants is:" + consonent);
        System.out.println("The number of other characters is:" + other);
    }
    public static void main(String[] args) {
        //Assignment 1
        Scanner obj = new Scanner(System.in);
        //Ques1
        System.out.print(convertChars(obj));
        //Ques2
        reverse(obj);
        //Ques3
        System.out.print(countDig(obj));
        //Ques4
        differentiate(obj);
    }
}
