import java.util.Comparator;
public class MyArrayList<T> implements MyList<T>, Comparator<MyArrayList<T>>{
    private T[] arr;
    private int size;
    private Comparator<T> comparator;
    MyArrayList() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    MyArrayList(Comparator<T> comparator) {
        this.arr = (T[]) new Object[5];
        this.size = 0;
        this.comparator = comparator;
    }

    public void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length *2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    public void more(T[] addArr){
        T[] newArr = (T[]) new Object[arr.length +addArr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    public void addAll(T[] addArr){
        if(addArr.length<=size-arr.length){
            increaseBuffer();
        }
        else{
            more(addArr);
        }
        for (int i = 0; i < addArr.length; i++) {
            arr[size++]=addArr[i];
        }

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
        int newIndex = 0;
        for (int i = 0; i < size; i++) {
            if (!arr[i].equals(item)) {
                arr[newIndex++] = arr[i];
            }
            size--;
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
        return null;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
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
        int index1 = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == o) {
                index1 = i;
            }
        }
        return index1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int lastIndex = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    @Override
    public void sort() {
        if (size > 1) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                        T temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }
    @Override
    public int compare(MyArrayList<T> o1, MyArrayList<T> o2) {
        return o1.size - o2.size;
    }
}
