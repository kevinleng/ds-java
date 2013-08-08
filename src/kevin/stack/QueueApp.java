package kevin.stack;

/**
 * Created with IntelliJ IDEA.
 * User: j
 * Date: 13-8-8
 * Time: 上午11:36
 * To change this template use File | Settings | File Templates.
 */
public class QueueApp {
    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayQueue<Integer>(5);
        Queue<Integer> queue = new PriorityQueue<Integer>(5);

        Integer e;
        e = queue.dequeue();
        System.out.println("出队 " + e);

        for (int i = 0; i < 4; i++) {
            boolean ret = queue.enqueue(i);
            System.out.println("入队 " + i + " result: " + ret);
        }

        boolean ret = false;
        ret = queue.enqueue(44);
        System.out.println("入队 44 result: " + ret);
        ret = queue.enqueue(5);
        System.out.println("入队 5 result: " + ret);
        ret = queue.enqueue(61);
        System.out.println("入队 61 result: " + ret);

        e = queue.dequeue();
        System.out.println("出队 " + e);
        e = queue.dequeue();
        System.out.println("出队 " + e);
        e = queue.dequeue();
        System.out.println("出队 " + e);

        ret = queue.enqueue(6);
        System.out.println("入队 6 result: " + ret);


        while((e=queue.dequeue()) !=null){
            System.out.println("出队 " + e);
        }

    }


}
