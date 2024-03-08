<<<<<<< HEAD
import java.util.Scanner;

public class sumTwoArr {
    static void sumOftwo(Scanner obj){
        System.out.print("Enter Size of the array1 n:");
        int n = obj.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter array Elements: ");
        for(int i = 0; i < n; i++){
            arr1[i] = obj.nextInt();
        }
        System.out.print("Enter Size of the array2 m:");
        int m = obj.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Enter array Elements: ");
        for(int i = 0; i < m; i++){
            arr2[i] = obj.nextInt();
        }
        int res_size = n > m ? n+1: m+1;
        int[] ans = new int[res_size];
        int i = n-1, j = m-1, carry = 0, idx = res_size-1;
        while(i >= 0 && j >= 0){
            int num = arr1[i] + arr2[j] + carry;
            int val = num % 10;
            carry = num / 10;
            ans[idx] = val;
            idx--;
            i--;
            j--;
        }
        while(i >= 0){
            int num = arr1[i] + carry;
            int val = num % 10;
            carry = num / 10;
            ans[idx] = val;
            idx--;
            i--;
        }
        while(j >= 0){
            int num = arr2[j] + carry;
            int val = num % 10;
            carry = num / 10;
            ans[idx] = val;
            idx--;
            j--;
        }
        int k = 0;
        while(ans[k] == 0){
            k++;
        }
        for(; k < res_size; k++){
            System.out.print(ans[k]);
            if(k != res_size - 1){
                System.out.print(" ,");
            }
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        sumOftwo(obj);
    }
}
=======
import java.util.Scanner;

public class sumTwoArr {
    static void sumOftwo(Scanner obj){
        System.out.print("Enter Size of the array1 n:");
        int n = obj.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter array Elements: ");
        for(int i = 0; i < n; i++){
            arr1[i] = obj.nextInt();
        }
        System.out.print("Enter Size of the array2 m:");
        int m = obj.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Enter array Elements: ");
        for(int i = 0; i < m; i++){
            arr2[i] = obj.nextInt();
        }
        int res_size = n > m ? n+1: m+1;
        int[] ans = new int[res_size];
        int i = n-1, j = m-1, carry = 0, idx = res_size-1;
        while(i >= 0 && j >= 0){
            int num = arr1[i] + arr2[j] + carry;
            int val = num % 10;
            carry = num / 10;
            ans[idx] = val;
            idx--;
            i--;
            j--;
        }
        while(i >= 0){
            int num = arr1[i] + carry;
            int val = num % 10;
            carry = num / 10;
            ans[idx] = val;
            idx--;
            i--;
        }
        while(j >= 0){
            int num = arr2[j] + carry;
            int val = num % 10;
            carry = num / 10;
            ans[idx] = val;
            idx--;
            j--;
        }
        int k = 0;
        while(ans[k] == 0){
            k++;
        }
        for(; k < res_size; k++){
            System.out.print(ans[k]);
            if(k != res_size - 1){
                System.out.print(" ,");
            }
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        sumOftwo(obj);
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
