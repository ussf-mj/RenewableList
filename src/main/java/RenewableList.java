import java.util.LinkedList;

public class RenewableList<E> {
    private int capacity;
    private final LinkedList<E> list;


    public RenewableList(int capacity) {
        this.capacity = capacity;
        list = new LinkedList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int newCapacity) {
        if (newCapacity < size()) {
            int size = size();
            for (int i =0 ; i < size - newCapacity; i++)
                list.removeLast();
        }

        this.capacity = newCapacity;
    }

    public void add(E o) {
        if (capacity <= list.size()){
            list.removeLast();
        }

        list.addFirst(o);
    }

    public int size(){
        return list.size();
    }

    public void remove() {
        list.removeLast();
    }

    public void remove(int index) {
        list.remove(index);
    }

    public E get (int index) {
        return list.get(index);
    }

    public E get() {
        return list.getFirst();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
