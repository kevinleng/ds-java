package kevin.stack;

/**
 * Created with IntelliJ IDEA.
 * User: j
 * Date: 13-8-7
 * Time: 下午4:43
 * To change this template use File | Settings | File Templates.
 */
public class LinkedStack<E> implements Stack<E> {
    Node<E> head;

    class Node<E> {
        E value;
        Node<E> next;

        public Node(Node<E> next, E e) {
            this.value = e;
            this.next = next;
        }
    }

    public LinkedStack() {
        head = new Node<E>(null, null);
    }


    @Override
    public void push(E e) {
        Node node = new Node(head, e);
        head = node;
    }

    @Override
    public E pop() {
        if (empty()) {
            throw new RuntimeException("stack is empty");
        }
        E e = head.value;
        head = head.next;
        return e;
    }

    @Override
    public E peek() {
        if (empty()) {
            throw new RuntimeException("stack is empty");
        }
        E e = head.value;
        return e;
    }

    @Override
    public boolean empty() {
        return head.next == null;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");

        Node p = head;
        while(p.next !=null){
            stringBuilder.append(p.value).append(",");
            p = p.next;
        }

        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
