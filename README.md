# ArrayList_LinkedList

##MyArrayListQueue

This is a simple implementation of a Queue using an ArrayList data structure.
How to Use

To use this Queue, simply create a new instance of MyArrayListQueue.

java

MyArrayListQueue<Integer> myQueue = new MyArrayListQueue<>();

To add an element to the back of the Queue, use the enqueue method.

java

myQueue.enqueue(5);

To remove and return the element at the front of the Queue, use the dequeue method.

java

Integer element = myQueue.dequeue();

To return the element at the front of the Queue without removing it, use the peek method.

java

Integer element = myQueue.peek();

To get the size of the Queue, use the size method.

java

int size = myQueue.size();

To check if the Queue is empty, use the isEmpty method.

java

boolean empty = myQueue.isEmpty();

Methods

    enqueue(E element): Adds an element to the back of the Queue.
    dequeue(): Removes and returns the element at the front of the Queue.
    peek(): Returns the element at the front of the Queue without removing it.
    size(): Returns the number of elements in the Queue.
    isEmpty(): Returns true if the Queue is empty, false otherwise.

Exceptions

The dequeue and peek methods will throw a NoSuchElementException if the Queue is empty.







=======================================================================================






MyArrayListStack

This is a simple implementation of a Stack using an ArrayList data structure.
How to Use

To use this Stack, simply create a new instance of MyArrayListStack.

java

MyArrayListStack<Integer> myStack = new MyArrayListStack<>();

To add an element to the top of the Stack, use the push method.

java

myStack.push(5);

To remove and return the element at the top of the Stack, use the pop method.

java

Integer element = myStack.pop();

To return the element at the top of the Stack without removing it, use the peek method.

java

Integer element = myStack.peek();

To get the size of the Stack, use the size method.

java

int size = myStack.size();

To check if the Stack is empty, use the isEmpty method.

java

boolean empty = myStack.isEmpty();

Methods

    push(E element): Adds an element to the top of the Stack.
    pop(): Removes and returns the element at the top of the Stack.
    peek(): Returns the element at the top of the Stack without removing it.
    size(): Returns the number of elements in the Stack.
    isEmpty(): Returns true if the Stack is empty, false otherwise.

Exceptions

The pop and peek methods will throw an EmptyStackException if the Stack is empty.




=======================================================================================




My Linked List Queue

This is a Java implementation of a queue data structure using a linked list. It provides the following operations:

    enqueue(element): add an element to the back of the queue.
    dequeue(): remove and return the element at the front of the queue.
    peek(): return the element at the front of the queue without removing it.
    size(): return the number of elements in the queue.
    isEmpty(): check if the queue is empty.

Usage

Here is an example of how to use the MyLinkedListQueue class:

java

MyLinkedListQueue<Integer> queue = new MyLinkedListQueue<>();

// Add elements to the queue.
queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);

// Check the size of the queue.
System.out.println(queue.size()); // Output: 3

// Remove an element from the queue.
int element = queue.dequeue();
System.out.println(element); // Output: 1

// Check the size of the queue.
System.out.println(queue.size()); // Output: 2

// Check the element at the front of the queue.
int frontElement = queue.peek();
System.out.println(frontElement); // Output: 2

// Check if the queue is empty.
System.out.println(queue.isEmpty()); // Output: false

Implementation Details

This implementation of a queue data structure is based on a linked list. The MyLinkedListQueue class uses a LinkedList object to store the elements of the queue.

The enqueue(element) operation adds an element to the back of the queue by using the addLast(element) method of the LinkedList class.

The dequeue() operation removes and returns the element at the front of the queue by using the removeFirst() method of the LinkedList class.

The peek() operation returns the element at the front of the queue without removing it by using the getFirst() method of the LinkedList class.

The size() operation returns the number of elements in the queue by using the size() method of the LinkedList class.

The isEmpty() operation checks if the queue is empty by using the isEmpty() method of the LinkedList class.





===================================================================================================================





MyLinkedListStack

MyLinkedListStack is a Java implementation of a stack data structure using a linked list.
Table of Contents

    Introduction
    Methods
    Usage
    License

Introduction

A stack is a data structure that follows the Last-In-First-Out (LIFO) principle. The last element that was added to the stack is the first one to be removed.

In this implementation, we use a LinkedList to hold the elements of the stack. The LinkedList allows us to easily add or remove elements from the top of the stack.
Methods

The following methods are available in MyLinkedListStack:

    -push(E element): Adds an element to the top of the stack.
    pop(): Removes and returns the element at the top of the stack.
    peek(): Returns the element at the top of the stack without removing it.
    size(): Returns the number of elements in the stack.
    isEmpty(): Returns a boolean indicating whether the stack is empty.

Usage

To use MyLinkedListStack, first create an instance of the class:

java

MyLinkedListStack<Integer> stack = new MyLinkedListStack<>();

You can then add elements to the stack using the push method:

java

stack.push(1);
stack.push(2);
stack.push(3);

To remove the top element from the stack, use the pop method:

java

int topElement = stack.pop(); // topElement == 3

To get the top element without removing it, use the peek method:

java

int topElement = stack.peek(); // topElement == 2

To get the number of elements in the stack, use the size method:

java

int stackSize = stack.size(); // stackSize == 2

Finally, you can check if the stack is empty using the isEmpty method:

java

boolean empty = stack.isEmpty(); // empty == false
