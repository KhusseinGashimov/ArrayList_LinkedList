import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        MyArrayList<Integer> marr = new MyArrayList<>(integerComparator);
        marr.add(6);
        marr.add(1231);
        marr.add(8);
        marr.add(3453);
        marr.add(10);
        marr.add(5345);
        marr.add(12);
//        for (int i = 0; i < marr.size(); i++) {
//            System.out.println(marr.get(i));
//        }
        marr.sort();
        for (int i = 0; i < marr.size(); i++) {
            System.out.println(marr.get(i));
        }
    }
}