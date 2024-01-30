import java.util.Scanner;

public class firstLastSorted {
    static int firstOccurrence(int arr[], int ele){
        int low = 0, high = arr.length - 1;
        int mid = low + (high - low)/2;

        while(low <= high){
            if( arr[mid] == ele &&( mid == 0 || ele > arr[mid - 1])){
                return mid;
            }
            else if(ele > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
            mid = low + (high - low)/2;
        }
        return -1;
    }
    static int lastOccurrence(int arr[], int ele){
        int low = 0, high = arr.length - 1;
        int mid = low + (high - low)/2;

        while(low <= high){
            if(arr[mid] == ele && (mid == arr.length - 1 || ele < arr[mid + 1])){
                return mid;
            }
            else if(ele < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            mid = low + (high - low)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = obj.nextInt();
        System.out.print("Enter array elements : ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        System.out.print("Enter ele: ");
        int ele = obj.nextInt();
        int firstOcc = firstOccurrence(arr, ele);
        int lastOcc = lastOccurrence(arr, ele);

        System.out.println("First occurrences of ele " + ele + " is :" + firstOcc);
        System.out.println("Last occurrences of ele " + ele + " is :" + lastOcc);

    }
}
