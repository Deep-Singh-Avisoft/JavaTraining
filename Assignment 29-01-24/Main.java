import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void Ques1(Scanner obj){
        System.out.print("Enter Size  of the Array n : ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Elements : ");
        int sum =0;
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
            sum += arr[i];
        }
        System.out.print("Sum of Elements : " + sum);
    }
    static void Ques2(Scanner obj){
        System.out.print("Enter Size  of the Array n : ");
        int n = obj.nextInt();
        System.out.print("Enter M: ");
        int M = obj.nextInt() ;
        int[] arr = new int[n];
        System.out.print("Enter Array Elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("Array Elements Before Reversing :");
        for(int i = 0; i < n; i ++){
            System.out.print(arr[i]);
            if(i != n -1){
                System.out.print(" ,");
            }
        }
        System.out.println();
        int start = M + 1;
        int end = n - 1;
        while(start <= end){
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Array Elements After Reversing :");
        for(int i = 0; i < n; i ++){
            System.out.print(arr[i]);
            if(i != n -1){
                System.out.print(" ,");
            }
        }

    }
    static void Ques3(Scanner obj){
        System.out.print("Enter Size  of the Array n : ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Elements : ");
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else{
                mp.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue() == 1){
                System.out.print("Element That Occurs Single time : " + entry.getKey());
                break;
            }
        }
    }
    static void Ques4(Scanner obj){
        System.out.print("Enter Size  of the Array M : ");
        int M = obj.nextInt();
        int[] arr = new int[M+1];
        System.out.print("Enter Array Elements : ");
        int ans = arr[0];
        for(int i = 1; i < M+1; i++) {
            arr[i] = obj.nextInt();
            ans = ans ^ arr[i];
        }
        System.out.print("Elemennt that occur Once : " + ans);
    }
    static double Ques5(Scanner obj){
        double mod = 1e9+7;
        System.out.print("Enter N: ");
            int N = obj.nextInt();
            System.out.print("Enter Q: ");
            int Q = obj.nextInt();
            double ans = Q == 1 ? 0 :  1;
            if(Q == 1){
                for(int i = 1; i <= N; i++){
                    ans += i;
                }
            }
            else if(Q ==2){
                for(int i = 1; i <= N; i++){
                    ans = (ans * i) % mod;
                }
            }
            else{
                ans = -1;
            }

        return ans;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        //Ques1(obj);
        //Ques2(obj);
        //Ques3(obj);
        //Ques4(obj);
        System.out.print("Result : " + Ques5(obj));
    }
}