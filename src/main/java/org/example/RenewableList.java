package org.example;

import java.util.LinkedList;

public class RenewableList<E> extends LinkedList<E> {
    private int capacity;

    public RenewableList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int newCapacity) {
        if (capacity > newCapacity)
            removeRange(newCapacity,size());

        this.capacity = newCapacity;
    }

    @Override
    public boolean add(E o) {
        if (capacity <= size()){
            removeLast();
        }

        addFirst(o);
        return true;
    }

}
