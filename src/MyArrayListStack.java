import java.util.ArrayList;
import java.util.EmptyStackException;
public class MyArrayListStack<E> {
    private ArrayList<E> stack;

    public MyArrayListStack() {
        stack = new ArrayList<>();
    }
    public void push(E element) {
        stack.add(element);
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
        return stack.remove(size() - 1);
    }
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(size() - 1);
    }
}
