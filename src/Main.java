import java.util.Comparator;
import  java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        // Create ArrayListStack&LinkedListStack examples
        MyArrayListStack<String> arrayStack = new MyArrayListStack<>();
        MyLinkedListStack<Integer> linkedStack = new MyLinkedListStack<>();


        // LinkedListStack Check how it works
        //============================================================
        // Push elements onto the stacks
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        // Peek at the top element
        System.out.println(linkedStack.peek()); // prints 3
        // Pop elements from the stacks
        System.out.println(linkedStack.pop()); // prints 3
        // Check if the stacks are empty
        System.out.println(linkedStack.isEmpty()); // prints false
        // Get the size of the stacks
        System.out.println(linkedStack.size()); // prints 2
        //===========================================================



        // ArrayListStack Check how it works
        //===========================================================
        arrayStack.push("one");
        arrayStack.push("two");
        arrayStack.push("three");
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