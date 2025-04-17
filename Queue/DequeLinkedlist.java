import java.util.Deque;
import java.util.LinkedList;
public class DequeLinkedlist
{
    public static void main(String args[])
    {
        Deque<String> processList = new LinkedList<String>(); //dequeue is a double ended queue
        processList.offer("process1");
        processList.offer("process2");
        processList.offer("process3");
        processList.addFirst("process0");
        processList.addLast("process4");
           
        System.out.println(processList.peek());
        System.out.println(processList.peekFirst());
        System.out.println(processList.peekLast());

        System.out.println(processList.poll());
        System.out.println(processList.pollFirst());
        System.out.println(processList.pollLast());
    }
}