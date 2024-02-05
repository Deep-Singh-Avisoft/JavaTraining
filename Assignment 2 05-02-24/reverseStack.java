import java.util.Scanner;
import java.util.Stack;

public class reverseStack {
    static void solve(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int ele = st.peek();
        st.pop();
        solve(st);
        st.add(ele);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter no. of elements : ");
        int size = obj.nextInt();
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter stack elements : ");
        for(int i = 0; i < size; i++){
            int ele = obj.nextInt();
            st.add(ele);
        }
        solve(st);
        while(!st.isEmpty()){
            System.out.print(st.peek() + " ");
            st.pop();
        }

    }
}
