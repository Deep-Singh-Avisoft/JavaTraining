import java.util.Scanner;

public class longestSubsequence {

    //maemorisation function for calculating the longest increasing subsequence
    public int memorized(int[] arr, int i, int prev, int[][] dp){
        //base case when i reaches to the end of the array
        if(i == arr.length){
            return 0;
        }
        //if dp[i][prev+1] already exist return
        if(dp[i][prev+1] != -1){
            return dp[i][prev+1];
        }
        //we have two cases either to take one element or to not according to condition
        int take = 0, not = 0;
        if(prev == -1 || arr[i] > arr[prev]){
            take = 1 + longest(arr, i+ 1, i);
        }
        else{
            not = 0 + longest(arr, i+1, i);
        }
        return dp[i][prev+1] = Math.max(take, not);
    }

    //recursive function to calculate the longest increasing subsequence
    public int longest(int[] arr, int i, int prev){
        //base case when i reaches to the end of the array
        if(i == arr.length){
            return 0;
        }
        //we have two cases either to take one element or to not according to condition
        int take = 0, not = 0;
        if(prev == -1 || arr[i] > arr[prev]){
            take = 1 + longest(arr, i+ 1, i);
        }
        else{
            not = 0 + longest(arr, i+1, i);
        }
        return Math.max(take, not);
    }
    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Size of the array: ");

        //taking the values from the user and
        // storing it in M and N using nextInt() function.
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements : ");
        for(int i = 0; i < size; i++){
            arr[i] = obj.nextInt();
        }
        //object of longestSubsequence to access non-static members of the class
        longestSubsequence o = new longestSubsequence();

        //printing the answer
        System.out.println("Longest increasing subsequence of the given array using recursive function : " + o.longest(arr, 0, -1));

        int[][] dp = new int[size][size + 1];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size+1; j++){
                dp[i][j] = -1;
            }
        }
        System.out.print("Longest increasing subsequence of the given array using memorized function : " + o.memorized(arr, 0, -1, dp));
    }
}
