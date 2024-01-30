import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class margeKsorted {
    static void MergeKsorted(Scanner obj){
        System.out.print("Enter K: ");
        int K = obj.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int size = 0;
        for(int i = 0; i < K; i++){
            System.out.print("Enter Size of  " + i + "th array : ");
            int n = obj.nextInt();
            size += n;
            int[] arr = new int[n];
            for(int j = 0; j < n; j++){
                arr[i] = obj.nextInt();
                pq.add(arr[i]);
            }
        }
        Iterator v = pq.iterator();
        int[] ans = new int[size];
        int i = 0;
        while(!pq.isEmpty()){
            ans[i++] = pq.peek();
            pq.poll();
        }
        for(int k = 0; k < size; k++){
            System.out.print(ans[k]);
            if(k != size - 1){
                System.out.print(" ,");
            }
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        MergeKsorted(obj);
    }
}
