import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class sortAStack {

//    static Stack<Integer> st = new Stack<>();
    static void sortedPush(Stack<Integer> st, int num)
    {
        // Base case if stack is empty or newly
        // inserted item is smaller than top
        if (st.isEmpty() || num < st.peek()) {
            st.push(num);
            return;
        }

        // If top is greater, remove the top item and recur
        int ele = st.peek();
        st.pop();
        sortedPush(st, num);

        // Put back the top item removed earlier
        st.push(ele);
    }

    // function to sort stack
    static void sortTheStack(Stack<Integer> st)
    {
        // If stack is not empty
        if (!st.isEmpty()) {
            // Remove the top item
            int num = st.peek();
            st.pop();

            // Sort remaining stack
            sortTheStack(st);

            // Push the top item back in sorted stack
            sortedPush(st, num);
        }
    }

    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter size: ");
        //taking the values from the user and
        // storing it in num using nextInt() function.
        int size = obj.nextInt();
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter Stack elements : ");
        for(int i = 0; i < size; i++){
            st.push(obj.nextInt());
        }

        sortTheStack(st);

        System.out.print("Stack after sorting : " );
        while (!st.isEmpty()){
            System.out.print(st.peek() + " ");
            st.pop();
        }
    }
}
