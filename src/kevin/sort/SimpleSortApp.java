package kevin.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: j
 * Date: 13-8-5
 * Time: 下午2:35
 * To change this template use File | Settings | File Templates.
 */
public class SimpleSortApp {
    public static final int SIZE = 10000;

    public static void main(String[] args){
        int[] array = new int[SIZE];
        Random random = new Random();
        long start,end;

        for(int i=0;i<SIZE;i++){
            array[i] = random.nextInt(SIZE);
        }

        System.out.println(Arrays.toString(array));

        start = System.currentTimeMillis();
        SimpleSort.bubbleSort(array);
        end = System.currentTimeMillis();
        System.out.println("bubbleSort cost time: "+(end-start) +"ms");
        System.out.println(Arrays.toString(array));

        start = System.currentTimeMillis();
        SimpleSort.selectSort(array);
        end = System.currentTimeMillis();
        System.out.println("bubbleSort cost time: "+(end-start) +"ms");
        System.out.println(Arrays.toString(array));

        start = System.currentTimeMillis();
        SimpleSort.insertSort(array);
        end = System.currentTimeMillis();
        System.out.println("bubbleSort cost time: "+(end-start) +"ms");
        System.out.println(Arrays.toString(array));
    }
}
