public class b {
    protected int data;
    
    public b() {
        this(0);
    }

    public b(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new String("Value of data in b is: " + Integer.toString(data));
    }
}