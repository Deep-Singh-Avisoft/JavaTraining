import java.util.Collections;
import java.util.Scanner;

public class sort012 {

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Elements: ");
        for(int i = 0; i < n;  i++){
            arr[i] = obj.nextInt();
        }

        int l = 0, h = n-1, mid = 0;
        while(mid <= h){
            if(arr[mid] == 0){
                int temp = arr[l];
                arr[l] = arr[mid];
                arr[mid] = temp;
                l++;
                mid++;
            }
            else if(arr[mid] == 2){
                int temp = arr[h];
                arr[h] = arr[mid];
                arr[mid] = temp;
                h--;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
