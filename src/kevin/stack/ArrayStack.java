package kevin.stack;

/**
 * Created with IntelliJ IDEA.
 * User: j
 * Date: 13-8-6
 * Time: 上午11:39
 * To change this template use File | Settings | File Templates.
 */
public class ArrayStack<E> implements Stack<E>{
    Object[] values ;
    int maxSize = 0;
    int top;

    public ArrayStack(int s){
        values = new Object[s];
        maxSize = s;
        top = -1;
    }

    @Override
    public void push(E e) {
        if(isFull()){
            throw new RuntimeException("stack is full");
        }

        values[++top] = e;
    }

    @Override
    public E pop() {
        if(empty()){
            throw new RuntimeException("stack is empty");
        }
        return (E)values[top--];
    }

    @Override
    public E peek() {
        if(empty()){
            throw new RuntimeException("stack is empty");
        }
        return (E)values[top];
    }

    @Override
    public boolean empty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == maxSize-1;
    }
}
