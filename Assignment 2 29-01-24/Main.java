import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void Ques1(Scanner obj){
        System.out.print("Enter Size of The Array: ");
        int n = obj.nextInt();
        System.out.print("Enter K: ");
        int K = obj.nextInt();
        System.out.print("Enter Array Elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        Arrays.sort(arr);
        Set<List<Integer>> st = new HashSet<>();
        int start, end;
        for(int i = 0; i < n - 2; i++){
            start = i + 1; end = n - 1;
            while(start < end){
                if((arr[i] + arr[start] + arr[end]) == K){
                    List<Integer> list = Arrays.asList(arr[i], arr[start], arr[end]);
                    Collections.sort(list);
                    st.add(list);

                    while(start < end && arr[start] == arr[start+1])
                        start++;
                    while(start < end && arr[end] == arr[end-1])
                        end--;
                    start++;
                    end--;
                }
                else if((arr[i] + arr[start] + arr[end]) < K){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        System.out.print("Triplets Are: ");
        for(List<Integer> it: st){
            System.out.print(it);
        }
    }
    static void Ques2(Scanner obj){
        System.out.print("Enter size of the array n : ");
        int n = obj.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        Arrays.sort(arr);
        int j = 0;
        for(int i = 0; i < n -1; i++){
            if(arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];

        System.out.println("Size of array : " + j);
        System.out.print("Array Elements After Removing Duplicates: ");
        for(int i = 0; i < j; i++){
            System.out.print(arr[i]);
            if(i != j - 1){
                System.out.print(" ,");
            }
        }
    }
    static void Ques3(Scanner obj){
        System.out.print("Enter Size of the array n:");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        int dup = 0, miss = 0;

        for(int i = 0; i < n; i++){
            if(arr[Math.abs(arr[i])- 1] < 0){
                dup = Math.abs(arr[i]);
            }
            else {
                arr[Math.abs(arr[i]) - 1] *= -1;
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                miss = i+1;
            }
        }

        System.out.print("Duplicate number : " + dup + " , " + "Missing Number: " + miss);
    }
    static void Ques4(Scanner obj) {
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
    static void Ques5(Scanner obj){
        System.out.print("Enter Size of the array n:");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }
        System.out.print("Enter No. of Queries: ");
        int Q = obj.nextInt();
        for(int i = 1; i <= Q; i++){
            System.out.print("Enter value of L for Q " + i + " : ");
            int L = obj.nextInt();
            System.out.print("Enter value of R for Q " + i + " : ");
            int R = obj.nextInt();
            int sum = 0;
            for(int j = L - 1; j < R; j++){
                sum += arr[j % n];
            }
            System.out.println("Sum for Q " + i + " : " + sum);
        }
    }
    static void Ques6(Scanner obj){
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
    static void Ques7(Scanner obj){
        System.out.print("Enter Size of the array n:");
        int n = obj.nextInt();
        System.out.print("Enter K: ");
        int K = obj.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array Elements: ");
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
                pq.add(arr[i]);
        }
        int i = 1;
        while(i <= K){
            System.out.print(pq.peek() + " ");
            pq.poll();
            i++;
        }
    }
    static void Ques8(Scanner obj){
        System.out.print("Enter K: ");
        int K = obj.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int size = 0;
        for(int i = 0; i < K; i++){
            System.out.print("Enter Size of  " + i + "th array : ");
            int n = obj.nextInt();
            size += n;
            int[] arr = new int[n];
            for(int j = 0; j < n; j++){
                arr[i] = obj.nextInt();
                pq.add(arr[i]);
            }
        }
        Iterator v = pq.iterator();
        int[] ans = new int[size];
        int i = 0;
        while(!pq.isEmpty()){
            ans[i++] = pq.peek();
            pq.poll();
        }
        for(int k = 0; k < size; k++){
            System.out.print(ans[k]);
            if(k != size - 1){
                System.out.print(" ,");
            }
        }
    }
    static void Ques9(Scanner obj){
        System.out.print("Enter Size of the array n:");
        int n = obj.nextInt();
        System.out.print("Enter array Elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = obj.nextInt();
        }


    }
//    static void Ques11(Scanner obj)
    static void Ques13(Scanner obj){
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
    static void Ques14(Scanner obj){
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
//        Ques1(obj);
//        Ques2(obj);
        Ques3(obj);
//        Ques4(obj);
        //Ques5(obj);
        //Ques6(obj);
        //Ques7(obj);
        //Ques8(obj);
        //Ques9(obj);
        //Ques13(obj);
//        Ques14(obj);

    }
}