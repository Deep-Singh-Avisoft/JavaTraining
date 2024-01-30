import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSeq {
    static int longestSeq(int arr[]){
        if(arr.length == 0){
            return 0;
        }
        int count = 1;
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            st.add(arr[i]);
        }
        for(int it: st){
            if(!st.contains(it-1)) {
                int cnt = 1;
                int x = it;

                while (st.contains(x + 1)) {
                    cnt++;
                    x += 1;
                }
                count = Math.max(cnt, count);
            }
        }
    return count;
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

        System.out.print("Length of longest sequence : " + longestSeq(arr));
    }
}
