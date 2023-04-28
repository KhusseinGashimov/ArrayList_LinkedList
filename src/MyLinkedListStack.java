import java.util.LinkedList;
import java.util.EmptyStackException;

public class MyLinkedListStack<E> {
    private LinkedList<E> stack; // Declare a LinkedList to hold the elements of the stack.

    public MyLinkedListStack() {
        stack = new LinkedList<>(); // Initialize the LinkedList in the constructor.
    }

    /**
     * Push an element onto the top of the stack.
     * param element the element to be pushed.
     */
    public void push(E element) {
        stack.addFirst(element);
    }

    /**
     * Pop the element at the top of the stack and return it.
     * return the element at the top of the stack.
     * throws EmptyStackException if the stack is empty.
     */
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
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
        return stack.getFirst();
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
