import java.util.LinkedList;
import java.util.NoSuchElementException;
public class MyLinkedListQueue<E> {
    private LinkedList<E> queue;

    public MyLinkedListQueue() {
        queue = new LinkedList<>();
    }
    public void enqueue(E element) {
        queue.addLast(element);
    }
    public int size() {
        return queue.size();
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.removeFirst();
    }


}
