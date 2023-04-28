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

}
