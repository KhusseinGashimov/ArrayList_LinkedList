import java.util.Iterator;
public class MyLinkedList <E> implements MyList<E>, Iterable<E> {
    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

    }
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void increaseBuffer() {

    }

    @Override
    public void checkIndex(int index) {

    }

    @Override
    public void add(E item) {

    }

    @Override
    public void add(E item, int index) {

    }

    @Override
    public void remove(E item) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public int compare(MyArrayList<E> o1, MyArrayList<E> o2) {
        return 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
