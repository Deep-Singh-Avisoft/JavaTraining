<<<<<<< HEAD
import java.util.Scanner;

public class missRepeat {
    static void MissRepeat(Scanner obj){
        System.out.print("Enter Size of the array n:");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        int dup = 0, miss = 0;

        for(int i = 0; i < n; i++){
            if(arr[Math.abs(arr[i])- 1] < 0){
                dup = Math.abs(arr[i]);
            }
            else {
                arr[Math.abs(arr[i]) - 1] *= -1;
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                miss = i+1;
            }
        }

        System.out.print("Duplicate number : " + dup + " , " + "Missing Number: " + miss);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        MissRepeat(obj);
    }
}
=======
import java.util.Scanner;

public class missRepeat {
    static void MissRepeat(Scanner obj){
        System.out.print("Enter Size of the array n:");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        int dup = 0, miss = 0;

        for(int i = 0; i < n; i++){
            if(arr[Math.abs(arr[i])- 1] < 0){
                dup = Math.abs(arr[i]);
            }
            else {
                arr[Math.abs(arr[i]) - 1] *= -1;
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                miss = i+1;
            }
        }

        System.out.print("Duplicate number : " + dup + " , " + "Missing Number: " + miss);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        MissRepeat(obj);
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
