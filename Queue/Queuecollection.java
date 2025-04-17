import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

public class Queuecollection{
    public static void main(String args[])
    {
        Queue<Integer> orders = new PriorityQueue<Integer>(Comparator.reverseOrder()); //queue is single ended
        orders.offer(5678);
        orders.offer(9099);
        orders.offer(5632); 
        orders.add(2343); 
        orders.remove(2343);   //both offer() and add() adds the value to the queue
        System.out.println(orders.poll());
        System.out.println(orders.peek());
    }
}