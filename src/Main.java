import java.util.Comparator;
import  java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        MyArrayListStack<String> arrayStack = new MyArrayListStack<>();
        arrayStack.push("one");
        arrayStack.push("two");
        arrayStack.push("three");



        // ArrayListStack Check how it works
        //===========================================================
        // Peek at the top element
        System.out.println(arrayStack.peek()); // prints three
        // Pop elements from the stacks
        System.out.println(arrayStack.pop()); // prints three
        // Check if the stacks are empty
        System.out.println(arrayStack.isEmpty()); // prints false
        // Get the size of the stacks
        System.out.println(arrayStack.size()); // prints 2
        // ===========================================================
    }
}