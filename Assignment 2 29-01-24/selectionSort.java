import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    void SelectionSort(int array[]) {
        int size = array.length;

        for (int k = 0; k < size - 1; k++) {
            int minidx = k;

            for (int i = k + 1; i < size; i++) {
                if (array[i] < array[minidx]) {
                    minidx = i;
                }
            }

            // put min at the correct position
            int temp = array[k];
            array[k] = array[minidx];
            array[minidx] = temp;
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

//        int[] arr = { 20, 12, 10, 15, 2 };
        selectionSort ss = new selectionSort();
        ss.SelectionSort(arr);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(arr));
    }
}
