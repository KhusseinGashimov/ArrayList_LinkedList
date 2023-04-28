import java.util.LinkedList;
public class MyLinkedListQueue<E> {
    private LinkedList<E> queue;

    public MyLinkedListQueue() {
        queue = new LinkedList<>();
    }
    public void enqueue(E element) {
        queue.addLast(element);
    }
}
