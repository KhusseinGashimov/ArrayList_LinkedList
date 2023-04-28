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


        // MyArrayListQueue example
        //==================================================================
        // Create arrayListQueue like example
        MyArrayListQueue<Integer> arrayListQueue = new MyArrayListQueue<>();
        //enqueue elements into arrayListQueue
        arrayListQueue.enqueue(10);
        arrayListQueue.enqueue(20);
        arrayListQueue.enqueue(30);
        System.out.println(arrayListQueue.dequeue()); // Output: 10
        System.out.println(arrayListQueue.peek()); // Output: 20
        System.out.println(arrayListQueue.size()); // Output: 2
        System.out.println(arrayListQueue.isEmpty()); // Output: false
        //====================================================================


        // MyLinkedListQueue example
        //===========================================================
        MyLinkedListQueue<String> queue = new MyLinkedListQueue<>();
        //enqueue element into queue
        queue.enqueue("apple");
        queue.enqueue("banana");
        queue.enqueue("cherry");
        System.out.println(queue.dequeue()); // Output: apple
        System.out.println(queue.peek()); // Output: banana
        System.out.println(queue.size()); // Output: 2
        System.out.println(queue.isEmpty()); // Output: false
        //===========================================================



        MyMinHeap<Integer> minHeap = new MyMinHeap<>();

        // Add elements to the heaps
        minHeap.insert(5);
        minHeap.insert(12345);
        minHeap.insert(2);
        minHeap.insert(8);
        // Print the contents of the heaps
        System.out.println("Min Heap: " + minHeap);
        // Remove elements from the heaps
        minHeap.extract();
        // Print the contents of the heaps again
        System.out.println("Min Heap: " + minHeap);
    }
}