import java.util.ArrayDeque;
import java.util.Deque;

public class DequeArrayList
{
    public static void main(String args[])
    {
        ArrayDeque<String> orders = new ArrayDeque<String>();
        orders.offer("order1");
        orders.offer("order2");
        orders.offer("order3");
        orders.offer("order4");
        orders.offerFirst("Order5");
        orders.offerLast("Order7");

        System.out.println(orders.peek());
        System.out.println(orders.peekLast());

        System.out.println(orders.poll());
        System.out.println(orders.pollLast());
    }
}