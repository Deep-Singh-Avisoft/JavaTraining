import java.util.*;

public class Main {
    static void Ques1(Scanner obj){
        System.out.print("Enter Input String: ");
        String str = obj.nextLine();
        Map<Character, Integer> mp = new HashMap<Character, Integer>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch)+1);
            }
            else{
                mp.put(ch, 1);
            }

        }
        System.out.println("Unique Charachters are: ");
        for(Map.Entry<Character, Integer> entry : mp.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }
    }
    static void Ques2(Scanner obj){
        System.out.print("Enter Start Fahrenheit Value: ");
        double start = obj.nextDouble();
        System.out.print("Enter end Fahrenheit Value: ");
        double end = obj.nextDouble();
        System.out.print("Enter Step Size Value: ");
        double stepSize = obj.nextDouble();
        for(double i = start; i <= end; i+= stepSize) {
            System.out.println("Fahrenheit Value: " + i + "   Celsius Value: " + (i - 32) * (5.0 / 9.0));
        }
    }
    static void Ques3(Scanner obj){
        System.out.print("Enter The Number: ");
        int number = obj.nextInt();
        int evenSum = 0, oddSum = 0;
        int a = 0;
        while(number != 0){
            a = number % 10;
            number = number / 10;
            if(a % 2 == 0){
                evenSum += a;
            }
            else{
                oddSum += a;
            }
        }
        System.out.println("Even Digits Sum : " + evenSum);
        System.out.println("Odd Digits Sum : " + oddSum);
    }
    static void Ques4(Scanner obj){
        System.out.print("Enter the number: ");
        int num = obj.nextInt();
        boolean flag = false;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                    flag = true;
                    System.out.println(i);
            }
        }
        if(!flag){
            System.out.print(-1);
        }
    }
    static void Ques5(Scanner obj){
        System.out.print("Enter x: ");
        int x = obj.nextInt();
        System.out.print("Enter n: ");
        int n = obj.nextInt();
        int ans = 1;
        while(n != 0){
            ans *= x;
            n--;
        }
        System.out.print(ans);
    }
    static void Ques6(Scanner obj){
        System.out.print("Enter the number: ");
        int num = obj.nextInt();
        int p = 0;
        int ans = 0;
        while(num != 0){
            p = num % 10;
            num = num / 10;
            ans = (ans * 10) + p;
        }
        System.out.print(ans);
    }
    static void pattern1(){
        char ch = 'A';
        char prev = ch;
        for(int i = 1; i <= 4; i++){
            prev = ch;
            ch++;
            for(int j = 0; j < i; j++) {
                System.out.print(prev);
                prev++;
            }
            System.out.println();
        }
    }
    static void pattern2(Scanner obj){
        System.out.print("Enter n:");
        int N = obj.nextInt();
        for(int i = 1; i <= N; i++){
            for(int j = i; j > 0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern3(Scanner obj){
        System.out.print("Enter n:");
        int N = obj.nextInt();
        char ch = 'A';
        for(int i = 1; i <= N; i++){
            for(int j = 0; j < i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
    static void pattern5(Scanner obj){
        System.out.print("Enetr n: ");
        int N = obj.nextInt();
        char ch = (char)(65 + N -1);
        char prev = ch;
        for(int i = 1; i <= N; i++){
            prev = ch;
            ch--;
            for(int j = i; j > 0; j--){
                System.out.print(prev);
                prev++;
            }
            System.out.println();
        }
    }
    static void pattern6(Scanner obj){
        System.out.print("Enter N: ");
        int N = obj.nextInt();

        for(int i = 0; i < N; i++){
            for(int k = 0; k < i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < N; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void pattern7(Scanner obj){
        System.out.print("Enter N: ");
        int N = obj.nextInt();

        for(int i = 0; i < N; i++) {
            for (int j = N; j > i +1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(k + 1);
            }
            System.out.println();
        }
    }
    static void pattern8(Scanner obj){
        System.out.print("Enter N: ");
        int N = obj.nextInt();
        int s = N;
        int n = 1;
        int prev = n;
        int curr = n;
        for(int i = 0; i < N; i++){
            curr = n;
            n += 2;
            for(int j = 0; j < s; j++){
                System.out.print(curr);
                curr += 2;
            }
            s--;
            for(int k = 0; k < i; k++){
                System.out.print(prev);
                prev += 2;
            }
            prev = 1;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //Ques1(obj);
        //Ques2(obj);
        //Ques3(obj);
        //Ques4(obj);
        //Ques5(obj);
        //Ques6(obj);
        //pattern1();
        //pattern2(obj);
        //pattern3(obj);
        //pattern5(obj);
        //pattern6(obj);
        //pattern7(obj);
        //pattern8(obj);
    }
}