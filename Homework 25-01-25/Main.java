import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void Ques1(Scanner obj){
        System.out.print("Enter N: ");
        int N = obj.nextInt();
        int i = 0;
        int[] arr = new int[32];
        while(N > 0){
            arr[i] = N % 2;
            N = N / 2;
            i++;
        }
        for(int j = i - 1; j >= 0; j--){
            System.out.print(arr[j]);
        }
    }
    static void Ques2(Scanner obj){
        System.out.print("Enter N: ");
        int N = obj.nextInt();

        for(int i = 2; i <= N; i++){
            boolean flag = true;
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    flag = false;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
    static void Ques3(Scanner obj){
        System.out.print("Enter N: ");
        int N = obj.nextInt();
        int curr = 1;
        int prev = 1;
        for(int i = 1; i <= N; i++) {
            int num = prev;
            for(int j = N; j > i ; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= (curr/2 +1); j++){
                System.out.print(num);
                num++;
            }
            num--;
            for(int j = 1; j <= curr/2; j++){
                num--;
                System.out.print(num);
            }
        prev++;
            curr += 2;
            System.out.println();
        }
    }
    static void Ques4(Scanner obj){
        System.out.print("Enter N: ");
        int n = obj.nextInt();

        if(n % 2 == 0){
            return;
        }

        int var = n - 1;
        for (int j = 1; j<= n; j++)
        {
            for (int i = 1; i<= var; i++)
            {
                System.out.print(" ");
            }
            var--;
            for (int i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        var = 1;
        for (int j = 1; j<= n - 1; j++)
        {
            for (int i = 1; i<= var; i++)
            {
                System.out.print(" ");
            }
            var++;
            for (int i = 1; i<= 2 * (n - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void Ques5(Scanner obj){
        System.out.print("Enter N: ");
        int n = obj.nextInt();

        for(int j = 1; j <= n; j++){
            int sum = 0;
            for(int i = 1; i <= j; i++){
                sum += i;
                System.out.print(i);
                if(i != n){
                    System.out.print('+');
                }
            }
            System.out.print('=');
            System.out.print(sum);
            System.out.println();
        }
    }
    static void Ques6(Scanner obj){
        System.out.print("Enter N: ");
        int n = obj.nextInt();
        int num = n;
        int a = 0;
        int sum = 0;
        while(n != 0){
            a = n % 10;
            n = n / 10;
            sum = (sum * 10) + a;
        }
        if(sum == num){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
    static void Ques7(Scanner obj){
        System.out.print("Enter N: ");
        int n = obj.nextInt();
        int var = 1;
        for(int i = 0; i < n; i++){
            for(int j = n; j >= 1; j--){
                if(j == var){
                    System.out.print('*');
                }
                else{
                    System.out.print(j);
                }
            }
            var++;
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
        //Ques7(obj);
    }
}