import java.util.Iterator;
public class MyArrayList<T> implements MyList<T>{
    private T[] arr;
    private int size;
    MyArrayList() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

    public void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    @Override
    public void add(T element) {
        if (size == arr.length) {
            increaseBuffer();
        }
        arr[size++]=element;
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void add(Object item, int index) {
        if(size == arr.length){
            increaseBuffer();
        }
        arr[index] = (T) item;
    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }

    @Override
    public void clear() {

    }
    public void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
    @Override
    public T get(int index) {
        checkIndex(index);
        return arr[index];
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
}
