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
        Queue<Integer> queue = new ArrayQueue<Integer>(5);

        Integer e;
        e = queue.dequeue();
        System.out.println("dequeue " + e);

        for (int i = 0; i < 4; i++) {
            boolean ret = queue.enqueue(i);
            System.out.println("enqueue " + i + " result: " + ret);
        }

        boolean ret = false;
        ret = queue.enqueue(4);
        System.out.println("enqueue 4 result: " + ret);
        ret = queue.enqueue(5);
        System.out.println("enqueue 5 result: " + ret);
        ret = queue.enqueue(6);
        System.out.println("enqueue 6 result: " + ret);

        e = queue.dequeue();
        System.out.println("dequeue " + e);
        e = queue.dequeue();
        System.out.println("dequeue " + e);
        e = queue.dequeue();
        System.out.println("dequeue " + e);

        ret = queue.enqueue(6);
        System.out.println("enqueue 6 result: " + ret);


        while((e=queue.dequeue()) !=null){
            System.out.println("dequeue " + e);
        }

    }


}
