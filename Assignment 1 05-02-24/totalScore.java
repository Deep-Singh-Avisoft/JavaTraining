<<<<<<< HEAD
import java.util.Scanner;

public class totalScore {
    static int calculate(int[] arr){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 5){
                ans += 5;
            }
            else if(arr[i] % 2 == 0){
                ans += 1;
            }
            else{
                ans += 3;
            }
        }
        return ans;
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
        System.out.print("Total Score : " + calculate(arr));
    }
}
=======
import java.util.Scanner;

public class totalScore {
    static int calculate(int[] arr){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 5){
                ans += 5;
            }
            else if(arr[i] % 2 == 0){
                ans += 1;
            }
            else{
                ans += 3;
            }
        }
        return ans;
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
        System.out.print("Total Score : " + calculate(arr));
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
