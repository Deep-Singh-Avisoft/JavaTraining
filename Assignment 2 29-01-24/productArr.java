<<<<<<< HEAD
import java.util.Scanner;

public class productArr {
    static void Product(Scanner obj) {
        double mod = 1e9 + 7;
        System.out.print("Enter Size of the array n:");
        int n = obj.nextInt();
        double[] arr = new double[n];
        System.out.print("Enter array Elements: ");
        double prod = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextDouble();
            prod *= arr[i];
        }
        System.out.print("Products are: ");
        for(int i = 0; i < n; i++){
            arr[i] = (prod / arr[i]) % mod;
            System.out.print(arr[i]);
            if(i != n- 1){
                System.out.print(" ,");
            }
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Product(obj);
    }
}
=======
import java.util.Scanner;

public class productArr {
    static void Product(Scanner obj) {
        double mod = 1e9 + 7;
        System.out.print("Enter Size of the array n:");
        int n = obj.nextInt();
        double[] arr = new double[n];
        System.out.print("Enter array Elements: ");
        double prod = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextDouble();
            prod *= arr[i];
        }
        System.out.print("Products are: ");
        for(int i = 0; i < n; i++){
            arr[i] = (prod / arr[i]) % mod;
            System.out.print(arr[i]);
            if(i != n- 1){
                System.out.print(" ,");
            }
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Product(obj);
    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
