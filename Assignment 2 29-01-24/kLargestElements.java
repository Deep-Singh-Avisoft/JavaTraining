<<<<<<< HEAD
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kLargestElements {
    static void Klargest(Scanner obj){
        System.out.print("Enter Size of the array n:");
        int n = obj.nextInt();
        System.out.print("Enter K: ");
        int K = obj.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array Elements: ");
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
            pq.add(arr[i]);
        }
        int i = 1;
        while(i <= K){
            System.out.print(pq.peek() + " ");
            pq.poll();
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Klargest(obj);
    }
}

=======
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kLargestElements {
    static void Klargest(Scanner obj){
        System.out.print("Enter Size of the array n:");
        int n = obj.nextInt();
        System.out.print("Enter K: ");
        int K = obj.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array Elements: ");
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
            pq.add(arr[i]);
        }
        int i = 1;
        while(i <= K){
            System.out.print(pq.peek() + " ");
            pq.poll();
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Klargest(obj);
    }
}

>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
