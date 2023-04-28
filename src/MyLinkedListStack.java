import java.util.LinkedList;
import java.util.EmptyStackException;
public class MyLinkedListStack<E> {
    private LinkedList<E> stack;

    public MyLinkedListStack() {
        stack = new LinkedList<>();
    }
    public void push(E element) {
        stack.addFirst(element);
    }

    public int size() {
        return stack.size();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.getFirst();
    }
}
