public class Main{
    public static void main(String[] args) {
        MyArrayList<Integer> marr = new MyArrayList<>();
        marr.add(6);
        System.out.println(marr.size());
        marr.clear();
        System.out.println(marr.size());
    }
}