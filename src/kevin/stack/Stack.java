package kevin.stack;

/**
 * Created with IntelliJ IDEA.
 * User: j
 * Date: 13-8-6
 * Time: 上午11:06
 * To change this template use File | Settings | File Templates.
 */
public interface Stack<E> {

    void push(E e);

    E pop();

    E peek();

    boolean empty();

}
