import java.util.ArrayDeque;
import java.util.Deque;

public class dequeue {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque();
        deque.offer(10);
        deque.offerFirst(20);
        deque.offerLast(30);
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        System.out.println(deque.pollLast());
    }
}
