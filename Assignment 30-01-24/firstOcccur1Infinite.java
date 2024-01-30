public class firstOcccur1Infinite {
    static int firstOccurrence1(int arr[], int l, int h){
        int low = l, high = h;
        int mid= low + (high - low)/2;
        while(low <= high){
            if(arr[mid] == 1 && (arr[mid] == 0 || arr[mid - 1] == 0)){
                break;
            }
            else if(arr[mid] == 1){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            mid= low + (high - low)/2;
        }
        return mid;
    }
    public static void main(String[] args){
        int arr[] = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1};

        int l = 0, h = 1;
        while(arr[h] == 0){
            l = h;

            h = 2 * h;
        }

        System.out.print("First Occurrence of 1: " + firstOccurrence1(arr, l, h));
    }
}
