import java.util.Scanner;

public class searchInsertPos {
    static void searchInsert(Scanner obj){
        System.out.print("Enter the size of the array : ");
        int n = obj.nextInt();
        System.out.print("Enter m :");
        int m = obj.nextInt();
        System.out.print("Enter elements of sorted array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        int low = 0, high = n - 1;
        int mid = low + (high - low)/2;
        while(low <= high){
            if(arr[mid] == m){
                System.out.print("Element is present in the array at index : " + mid);
                break;
            }
            else if(arr[mid] > m){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            mid = low + (high - low)/2;
        }
        System.out.print("Element should be inserted in the array at index : " + (high+1));
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        searchInsert(obj);
    }
}
