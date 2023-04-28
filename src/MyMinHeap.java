import java.util.ArrayList;
public class MyMinHeap<E extends Comparable<E>> {
    private ArrayList<E> heap;

    public MyMinHeap() {
        heap = new ArrayList<>();
    }
    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }
    private int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }
    private int getRightChildIndex(int index) {
        return 2 * index + 2;
    }
    private void swap(int index1, int index2) {
        E temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public void insert(E data) {
        heap.add(data);
        int currentIndex = heap.size() - 1;
        while (currentIndex > 0 && heap.get(currentIndex).compareTo(heap.get(getParentIndex(currentIndex))) < 0) {
            swap(currentIndex, getParentIndex(currentIndex));
            currentIndex = getParentIndex(currentIndex);
        }
    }
}
