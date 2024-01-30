import java.util.Scanner;

public class bubbleSort {

    static void BubbleSort(Scanner obj){
        System.out.print("Enter the size of the array : ");
        int n = obj.nextInt();
        System.out.print("Enter elements of array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        boolean flag = false;
        boolean flag1 = true;
        while(flag1){
            for(int i = 0; i < n - 1; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;
                }
            }
            flag1 = flag == false ? false : true;
            flag = !flag;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
            if(i != n-1){
                System.out.print(" ,");
            }
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        BubbleSort(obj);
    }
}
