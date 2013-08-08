package kevin.stack;

/**
 * 循环队列
 */
public class ArrayQueue<E> implements Queue<E> {
    private Object[] valaues;
    private int head;
    private int tail;
    private int size;
    int maxSize;

    public ArrayQueue(int capability) {
        valaues = new Object[capability];
        head = -1;
        tail = -1;
        maxSize = capability;
    }

    @Override
    public boolean enqueue(E e) {
        if (isFull()) {
            System.out.println("queue is full, enqueue " + e + " failed");
            return false;
        }

        tail++;
        if (tail == maxSize) {
            tail = 0;
        }
        valaues[tail] = e;
        size++;
        return true;
    }

    @Override
    public E dequeue() {
        if (empty()) {
            System.out.println("queue is empty, dequeue failed, return null");
            return null;
        }

        head++;
        if (head == maxSize) {
            head = 0;
        }
        E e = (E) valaues[head];
        size--;

        return e;
    }

    public boolean empty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }
}
