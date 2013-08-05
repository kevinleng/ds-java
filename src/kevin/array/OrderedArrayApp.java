package kevin.array;

/**
 * Created with IntelliJ IDEA.
 * User: j
 * Date: 13-8-5
 * Time: 上午11:43
 * To change this template use File | Settings | File Templates.
 */
public class OrderedArrayApp {

    public static void main(String[] args){
        OrderedArray array = new OrderedArray(5);

        System.out.println(array);

        array.insert(22);
        array.insert(55);
        array.insert(11);
        array.insert(88);
        array.insert(33);

        System.out.println(array);

        int find = array.find(88);
        System.out.println("find 88: "+find);

        find = array.find(44);
        System.out.println("find 44: "+find);

        array.delete(88);
        System.out.println(array);
        find = array.find(88);
        System.out.println("find 88: "+find);

    }
}
