import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyArrayListQueue<E> {
    private ArrayList<E> queue; // Declare an ArrayList to hold the elements of the queue.

    public MyArrayListQueue(){
        queue = new ArrayList<>(); // Initialize the ArrayList in the constructor.
    }

    /**
     * Add an element to the back of the queue.
     * param element the element to be added.
     */
    public void enqueue(E element) {
        queue.add(element);
    }

    /**
     * Remove and return the element at the front of the queue.
     * return the element at the front of the queue.
     * throws NoSuchElementException if the queue is empty.
     */
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        E data = queue.get(0);
        queue.remove(0);
        return data;
    }

    /**
     * Return the element at the front of the queue without removing it.
     * return the element at the front of the queue.
     * throws NoSuchElementException if the queue is empty.
     */
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }

    /**
     * Return the number of elements in the queue.
     * return the size of the queue.
     */
    public int size() {
        return queue.size();
    }

    /**
     * Check if the queue is empty.
     * return true if the queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
