import java.util.Scanner;

public class buildExpression {

    static int Build(int arr[], int i, int sum, int target){
        if(sum == target && i == arr.length){
            return 1;
        }
        if(i >= arr.length){
            return 0;
        }

        return Build(arr, i + 1, sum + arr[i], target) + Build(arr, i + 1, sum - arr[i], target);
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Size of the array n:");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        System.out.print("Enter Target : ");
        int target = obj.nextInt();

        buildExpression ob = new buildExpression();
        System.out.print("No. of ways : " + Build(arr, 0, 0, target));
    }
}
