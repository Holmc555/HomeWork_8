public class MyQueue {
    private Object[] elements;
    private int size;
    private int capacity;
    private int front;
    private int rear;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public void add(Object value) {
        if (isFull()) {
            throw new IllegalStateException("Черга переповнена");
        }
        rear = (rear + 1) % capacity;
        elements[rear] = value;
        size++;
    }

    public void clear() {
        elements = new Object[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Черга порожня");
        }
        return elements[front];
    }

    public Object poll() {
        if (isEmpty()) {
            throw new IllegalStateException("Черга порожня");
        }
        Object removedValue = elements[front];
        elements[front] = null;
        front = (front + 1) % capacity;
        size--;
        return removedValue;
    }

    private boolean isFull() {
        return size == capacity;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}
