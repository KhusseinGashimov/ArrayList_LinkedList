public class MyTestingClass {
    private int id;
    private String name;

    public MyTestingClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Implement your own hashCode() method.
    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + id;
        hash = 31 * hash + name.hashCode();
        return hash;
    }
    // Override the equals() method to compare MyTestingClass objects based on their id and name fields.
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyTestingClass)) {
            return false;
        }
        MyTestingClass other = (MyTestingClass) obj;
        return id == other.id && name.equals(other.name);
    }

    // Override the toString() method to display the id and name fields.
    @Override
    public String toString() {
        return "[" + id + ", " + name + "]";
    }
}