public class MyStack {
    private Object[] elements;
    private int size;
    private int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
        size = 0;
    }

    public void push(Object value) {
        if (isFull()) {
            throw new IllegalStateException("Стек переповнений");
        }
        elements[size] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Такого індекса немає");
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек порожній");
        }
        return elements[size - 1];
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек порожній");
        }
        Object poppedValue = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return poppedValue;
    }

    private boolean isFull() {
        return size == capacity;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}
