<<<<<<< HEAD
import java.util.*;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class triplets {
    static void Triplets(Scanner obj) {
        System.out.print("Enter Size of The Array: ");
        int n = obj.nextInt();
        System.out.print("Enter K: ");
        int K = obj.nextInt();
        System.out.print("Enter Array Elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        Arrays.sort(arr);
        Set<List<Integer>> st = new HashSet<>();
        int start, end;
        for (int i = 0; i < n - 2; i++) {
            start = i + 1;
            end = n - 1;
            while (start < end) {
                if ((arr[i] + arr[start] + arr[end]) == K) {
                    List<Integer> list = Arrays.asList(arr[i], arr[start], arr[end]);
                    Collections.sort(list);
                    st.add(list);

                    while (start < end && arr[start] == arr[start + 1])
                        start++;
                    while (start < end && arr[end] == arr[end - 1])
                        end--;
                    start++;
                    end--;
                } else if ((arr[i] + arr[start] + arr[end]) < K) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        System.out.print("Triplets Are: ");
        for (List<Integer> it : st) {
            System.out.print(it);
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Triplets(obj);
    }
=======
import java.util.*;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class triplets {
    static void Triplets(Scanner obj) {
        System.out.print("Enter Size of The Array: ");
        int n = obj.nextInt();
        System.out.print("Enter K: ");
        int K = obj.nextInt();
        System.out.print("Enter Array Elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        Arrays.sort(arr);
        Set<List<Integer>> st = new HashSet<>();
        int start, end;
        for (int i = 0; i < n - 2; i++) {
            start = i + 1;
            end = n - 1;
            while (start < end) {
                if ((arr[i] + arr[start] + arr[end]) == K) {
                    List<Integer> list = Arrays.asList(arr[i], arr[start], arr[end]);
                    Collections.sort(list);
                    st.add(list);

                    while (start < end && arr[start] == arr[start + 1])
                        start++;
                    while (start < end && arr[end] == arr[end - 1])
                        end--;
                    start++;
                    end--;
                } else if ((arr[i] + arr[start] + arr[end]) < K) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        System.out.print("Triplets Are: ");
        for (List<Integer> it : st) {
            System.out.print(it);
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Triplets(obj);
    }
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
}