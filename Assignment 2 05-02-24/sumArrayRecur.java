import java.util.Scanner;

public class sumArrayRecur {
    static int calculate(int[] arr, int i){
        if(i == arr.length){
            return 0;
        }
        return arr[i] + calculate(arr, i+1);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements : ");
        for(int i = 0; i < size; i++){
            arr[i] = obj.nextInt();
        }
        System.out.print("Total Score : " + calculate(arr, 0));
    }
}
