public class MyLinkedList <E extends Comparable<E>> implements MyList{

    private int size = 0;

    private class Node<E>{

        private E data;
        Node<E> next;
        Node<E> previous;
        public Node(E data){
            this.data = data;
        }
        public Node(){

        }
    }
    private Node head;
    private Node tail;

    @Override
    public int size() {
        return size;
    }

    @Override // finding the certain element in the linked list
    public boolean contains(Object o) {
        Node currentNode = this.head;
        while(currentNode != null){ // the logic of traversing the linked list
            if(currentNode.data.equals((E)o)){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public void checkIndex(int index) {

    }

    @Override
    public void add(Object item) { // adding the element in the end of the linked list
        Node newNode = new Node<>((E)item);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
            size++;
            return;
        }
        Node currentNode = this.head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.previous = currentNode; // identifying the precious node
        this.tail = newNode;
        size++; // increasing the size
    }

    @Override
    public void add(Object item, int index) { // a method to add the element by index
        Node currentNode = this.head;
        Node newNode = new Node<>((E) item);
        int currentIndex = 0;
        if(index == 0){
            Node temp = this.head;
            this.head = newNode;
            this.head.next = temp;
            return;
        }else if(index >= size){
            add((E)item);
            return;
        }

        while(currentNode != null){
            if(currentIndex == index){
                currentNode.previous.next = newNode;
                newNode.next = currentNode;
                size++;
                return;
            }
            currentIndex++;
            currentNode = currentNode.next;
        }

        System.out.println("Error of adding the element");
    }

    @Override
    public boolean remove(Object item) { // removing the first appearance of the object
        Node currentNode = this.head;
        Node previousNode = new Node();
        if(currentNode != null && currentNode.data.equals((E)item)){
            this.head = currentNode.next;
            size--;
            return true;
        }
        while(currentNode != null){//traversing through the List
            if(currentNode.data.equals((E)item)){
                System.out.println("Starting...");
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;

        }
        if (currentNode == null){
            return false;
        }

        previousNode.next = currentNode.next;
        size--;
        return true;
    }

    @Override
    public Object remove(int index) { // Removing the item by the index
        int currentIndex = 0;
        Node currentNode = this.head;
        Node previousNode = this.head;
        if(index == 0){
            this.head = currentNode.next;
            return currentNode;
        }
        while(currentNode != null){
            if(index == currentIndex){
                previousNode.next = currentNode.next;
                size--;
                return currentNode.data;
            }
            currentIndex++;
            previousNode = currentNode;
            currentNode = currentNode.next;

        }
        return null;
    }

    @Override
    public void clear() { // Deleting the linked list
        this.head = new Node<>();
        this.size = 0; // the size should be zero now since there no elements
    }

    @Override
    public Object get(int index) {// getting the element by index
        int currentIndex = 0;
        Node currentNode = this.head;
        while(currentNode != null){
            if(index == currentIndex){
                return currentNode.data;
            }
            currentIndex++;
            currentNode = currentNode.next;
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {// returns the index of the first appearance of the object
        int index = 0;
        Node currentNode = this.head;
        while(currentNode != null) {
            if(currentNode.data.equals((E) o)){
                return index;
            }
            index++;
            currentNode = currentNode.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 1;
    }

    @Override
    public void sort() {
    }

    @Override
    public int compare(MyArrayList o1, MyArrayList o2) {
        return 0;
    }

    public void printList(){ // Printing the Linked list in order
    }
    public void printInReverse(){
        Node currentNode = this.tail;
        while(currentNode != null){
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.previous;
        }
    }
}