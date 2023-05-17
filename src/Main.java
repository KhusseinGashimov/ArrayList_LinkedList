import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<String, Integer> test = new MyHashTable<>();
        test.put("Banaa",12);
        System.out.println(test.containsKey("Bana"));
    }
}