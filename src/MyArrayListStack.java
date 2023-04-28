import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyArrayListStack<E> {
    private ArrayList<E> stack; // Declare an ArrayList to hold the elements of the stack.

    public MyArrayListStack() {
        stack = new ArrayList<>(); // Initialize the ArrayList in the constructor.
    }

    /**
     * Add an element to the top of the stack.
     * param element the element to be added.
     */
    public void push(E element) {
        stack.add(element);
    }

    /**
     * Remove and return the element at the top of the stack.
     * return the element at the top of the stack.
     * throws EmptyStackException if the stack is empty.
     */
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(size() - 1);
    }

    /**
     * Return the element at the top of the stack without removing it.
     * return the element at the top of the stack.
     * throws EmptyStackException if the stack is empty.
     */
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(size() - 1);
    }

    /**
     * Return the number of elements in the stack.
     * return the size of the stack.
     */
    public int size() {
        return stack.size();
    }

    /**
     * Check if the stack is empty.
     * return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
