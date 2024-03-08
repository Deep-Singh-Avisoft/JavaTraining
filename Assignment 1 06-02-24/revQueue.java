<<<<<<< HEAD
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class revQueue {

    //function to reverse queue
    static Queue<Integer> reverseQ(Queue<Integer> q){
        //base case when q is empty return
        if(q.isEmpty()){
            return q;
        }
        //extract front element
            int ele = q.peek();
            q.remove();
            q = reverseQ(q);
            //push back the element
            q.add(ele);

            return q;
    }
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(56);
        queue.add(27);
        queue.add(30);
        queue.add(45);
        queue.add(85);
        queue.add(92);
        queue.add(58);
        queue.add(80);
        queue.add(90);
        queue.add(100);

        queue = reverseQ(queue);

        System.out.print("Queue elements after reversing : " );
        while(!queue.isEmpty()){
            System.out.print(queue.peek() + " ");
            queue.remove();
        }

    }
}
=======
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class revQueue {

    //function to reverse queue
    static Queue<Integer> reverseQ(Queue<Integer> q){
        //base case when q is empty return
        if(q.isEmpty()){
            return q;
        }
        //extract front element
            int ele = q.peek();
            q.remove();
            q = reverseQ(q);
            //push back the element
            q.add(ele);

            return q;
    }
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(56);
        queue.add(27);
        queue.add(30);
        queue.add(45);
        queue.add(85);
        queue.add(92);
        queue.add(58);
        queue.add(80);
        queue.add(90);
        queue.add(100);

        queue = reverseQ(queue);

        System.out.print("Queue elements after reversing : " );
        while(!queue.isEmpty()){
            System.out.print(queue.peek() + " ");
            queue.remove();
        }

    }
}
>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
