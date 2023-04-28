import java.util.LinkedList;
import java.util.NoSuchElementException;
public class MyLinkedListQueue<E> {
        private LinkedList<E> queue; // Declare a LinkedList to hold the elements of the queue.

        public MyLinkedListQueue() {
            queue = new LinkedList<>(); // Initialize the LinkedList in the constructor.
        }

        /**
         * Add an element to the back of the queue.
         * param element the element to be added.
         */
        public void enqueue(E element) {
            queue.addLast(element);
        }

        /**
         * Remove and return the element at the front of the queue.
         * return the element at the front of the queue.
         * throws NoSuchElementException if the queue is empty.
         */
        public E dequeue() {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            return queue.removeFirst();
        }

        /**
         * Return the element at the front of the queue without removing it.
         * return the element at the front of the queue.
         * throws NoSuchElementException if the queue is empty.
         */
        public E peek() {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            return queue.getFirst();
        }

        /**
         * Return the number of elements in the queue.
         * return the size of the queue.
         */
        public int size() {
            return queue.size();
        }

        /**
         * Check if the queue is empty.
         * return true if the queue is empty, false otherwise.
         */
        public boolean isEmpty() {
            return queue.isEmpty();
        }
    }
