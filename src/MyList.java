public interface MyList<T> {
    int size();
    boolean contains(Object o);
    void checkIndex(int index);
    void add(T item);
    void add(T item, int index);
    boolean remove(T item);
    Object remove(int index);
    void clear();
    T get(int index);
    int indexOf(Object o);
    int lastIndexOf(Object o);
    void sort();

}
