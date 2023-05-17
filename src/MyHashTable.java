public class MyHashTable<K, V> {
    private class HashNode<K, V> {
        private K key;
        private V value;
        private HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        // Override the toString() method to display the key-value pair.
        @Override
        public String toString() {
            return "{" + key.toString() + "=" + value.toString() + "}";
        }
    }

    HashNode<K, V>[] chainArray;
    private int M;
    private int size;

    // Default constructor.
    public MyHashTable() {
        this(11); // default number of chains
    }

    // Constructor that allows the user to specify the number of chains.
    public MyHashTable(int M) {
        this.M = M;
        chainArray = new HashNode[M];
        size = 0;
    }

    // Hash function to determine the index of the chain in which to insert a new key-value pair.
    private int hash(K key) {
        int hash = key.hashCode() % M;
        return (hash < 0) ? hash + M : hash; // handle negative hash values
    }

    // Insert a new key-value pair into the hash table.
    public void put(K key, V value) {
        int index = hash(key);
        HashNode<K, V> head = chainArray[index];

        // Check if the key already exists in the hash table.
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Create a new node and insert it at the head of the chain.
        HashNode<K, V> newNode = new HashNode<>(key, value);
        newNode.next = chainArray[index];
        chainArray[index] = newNode;
        size++;
    }

    // Retrieve the value associated with a given key.
    public V get(K key) {
        int index = hash(key);
        HashNode<K, V> head = chainArray[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }

        return null; // key not found
    }

    // Remove the key-value pair associated with a given key.
    public V remove(K key) {
        int index = hash(key);
        HashNode<K, V> head = chainArray[index];
        HashNode<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    chainArray[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                size--;
                return head.value;
            }
            prev = head;
            head = head.next;
        }

        return null; // key not found
    }

    // Check if the hash table contains a given value.
    public boolean contains(V value) {
        for (HashNode<K, V> head : chainArray) {
            while (head != null) {
                if (head.value.equals(value)) {
                    return true;
                }
                head = head.next;
            }
        }
        return false;
    }

    // Retrieve the key associated with a given value.
    public K getKey(V value) {
        for (HashNode<K, V> head : chainArray) {
            while (head != null) {
                if (head.value.equals(value)) {
                    return head.key;
                }
                head = head.next;
            }
        }
        return null; // value not found
    }

    // Override the toString() method to display the hash table.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (HashNode<K, V> head : chainArray) {
            while (head != null) {
                sb.append(head.toString() + ", ");
                head = head.next;
            }
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2); // remove the last comma and space
        }
        sb.append("}");
        return sb.toString();
    }


    public boolean containsKey(K key) {
        int ind = hash(key);
        if( chainArray[ind]!=null){
            return true;
        }
        return false;
    }
}

