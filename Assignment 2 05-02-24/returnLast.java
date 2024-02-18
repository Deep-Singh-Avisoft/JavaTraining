import java.util.Scanner;

public class returnLast {
    static int ans = -1;
    static int solve(int[] arr, int i, int ans, int x){
        if(i == arr.length){
            return ans;
        }
        else if(arr[i] == x){
            ans = Math.max(i, ans);
        }
        return solve(arr, i+1, ans, x);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Size of the array n:");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        System.out.print("Enter x: ");
        int x = obj.nextInt();
//        int ans = 0;
        solve(arr, 0 , ans, x);
        System.out.print("Last Index is : " + solve(arr, 0 , ans, x));
    }
}
