public class Main{
    public static void main(String[] args) {
        MyArrayList<Integer> marr = new MyArrayList<>();
        marr.add(6);
        marr.add(7);
        marr.add(8);
        System.out.println(marr.get(1));
        System.out.println(marr.contains(65));
    }
}