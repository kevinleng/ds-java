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

    public static void main(String[] args){
        int[] array = new int[10];
        Random random = new Random();

        for(int i=0;i<10;i++){
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        SimpleSort.bubbleSort(array);
        System.out.println(Arrays.toString(array));
        SimpleSort.selectSort(array);
        System.out.println(Arrays.toString(array));
        SimpleSort.insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
