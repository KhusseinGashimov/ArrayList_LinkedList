import java.util.Comparator;
import  java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        MyArrayList<Integer> marr = new MyArrayList<>(integerComparator);
        marr.add(2);
        marr.add(2);

        MyLinkedList<Integer> mard = new MyLinkedList<>();
        Integer[] arr = new Integer[] {3, 5, 7, 6,8};
        mard.addAll(arr);
        marr.addAll(arr);

        mard.add(12);

        mard.add(13);
        for (int i = 0; i < mard.size(); i++) {
            System.out.println(mard.get(i));
        }

    }
}