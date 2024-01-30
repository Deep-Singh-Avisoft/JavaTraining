import java.util.Arrays;
import java.util.Scanner;

public class remDuplicates {
    static void RemDuplicates(Scanner obj){
        System.out.print("Enter size of the array n : ");
        int n = obj.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        Arrays.sort(arr);
        int j = 0;
        for(int i = 0; i < n -1; i++){
            if(arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];

        System.out.println("Size of array : " + j);
        System.out.print("Array Elements After Removing Duplicates: ");
        for(int i = 0; i < j; i++){
            System.out.print(arr[i]);
            if(i != j - 1){
                System.out.print(" ,");
            }
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        RemDuplicates(obj);
    }
}
