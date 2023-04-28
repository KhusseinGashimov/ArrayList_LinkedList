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

}
