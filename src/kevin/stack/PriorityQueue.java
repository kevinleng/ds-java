package kevin.stack;

import java.util.Comparator;

/**
 * 值越大, 优先级越高
 */
public class PriorityQueue<E> implements Queue<E>{


    private Object[] valaues;
    private int size;
    int maxSize;

    private Comparator<E> comparator = new Comparator<E>() {
        @Override
        public int compare(E o1, E o2) {

            return o1.hashCode() - o2.hashCode();
        }
    };

    public PriorityQueue(int capability) {
        valaues = new Object[capability];
        maxSize = capability;
    }

    @Override
    public boolean enqueue(E e) {
        if (isFull()) {
//            System.out.println("queue is full, enqueue " + e + " failed");
            return false;
        }


        if(size == 0){
            valaues[0] = e;
        } else {
            int i=0;
            for(i=size-1;i>=0;i--){
                E ae = (E)valaues[i];
                if(comparator.compare(ae, e) > 0){
                    valaues[i+1] = valaues[i];
                } else {
                    break;
                }

            }

            valaues[i+1] = e;
        }




        size++;
        return true;
    }

    @Override
    public E dequeue() {
        if (empty()) {
            System.out.println("queue is empty, dequeue failed, return null");
            return null;
        }

        return (E) valaues[--size];
    }

    public boolean empty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

}
