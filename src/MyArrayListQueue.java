import java.util.ArrayList;
import java.util.NoSuchElementException;
public class MyArrayListQueue<E> {
    private ArrayList<E> queue;

    public MyArrayListQueue(){
        queue = new ArrayList<>();
    }
    public void enqueue(E element) {
        queue.add(element);
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
        E data = queue.get(0);
        queue.remove(0);
        return data;
    }
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }

}
