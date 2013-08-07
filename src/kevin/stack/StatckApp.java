package kevin.stack;

/**
 * Created with IntelliJ IDEA.
 * User: j
 * Date: 13-8-7
 * Time: 下午3:48
 * To change this template use File | Settings | File Templates.
 */
public class StatckApp {

    public static void main(String[] args){
//        Stack<String> stack = new ArrayStack<String>(20);

        Stack<String> stack = new LinkedStack<String>();

        System.out.println("stack create, is empty "+stack.empty());

        stack.push("abc");
        stack.push("def");
        stack.push("123");
        stack.push("xyz");

        System.out.println(stack);

        String s = "";

        s = stack.pop();
        System.out.println(s);
        s = stack.peek();
        System.out.println(s);
        s = stack.pop();
        System.out.println(s);
        System.out.println(stack);

    }


}
