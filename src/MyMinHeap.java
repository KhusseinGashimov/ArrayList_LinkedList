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

}
