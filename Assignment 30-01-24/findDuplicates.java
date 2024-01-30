import java.util.Arrays;
import java.util.Scanner;

public class findDuplicates {

    static void finduplicates(Scanner obj){
        System.out.print("Enter size of the array n : ");
        int n = obj.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        for(int i = 0; i < n; i++){
            int idx = arr[i] % n;
            arr[idx] += n;
        }
        for(int i = 0; i < n; i ++){
            if((arr[i] / n) >= 2){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        finduplicates(obj);
    }
}
