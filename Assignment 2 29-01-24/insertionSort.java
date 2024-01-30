import java.util.Scanner;

public class insertionSort {

    void Insertionsort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int ele = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > ele) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = ele;
        }
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

        insertionSort obj1 = new insertionSort();
        obj1.Insertionsort(arr);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
            if(i != n-1){
                System.out.print(" ,");
            }
        }
    }
}
