package kevin.sort;

/**
 * Created with IntelliJ IDEA.
 * User: j
 * Date: 13-8-5
 * Time: 下午2:31
 * To change this template use File | Settings | File Templates.
 */
public class SimpleSort {

    //O(N2)
    public static void bubbleSort(int[] array){
        int i=0;
        int j=0;
        int size = array.length;
        int temp;

        for(i=0;i<size; i++){
            for(j=0;j<size-i-1;j++){
                if(array[j] > array[j+1]){
                    //交换
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }

    }

    //O(N2)
    public static void selectSort(int[] array){
        int minPos = 0;
        int minValue;

        int size = array.length;
        int temp;
        for(int i=0;i<size-1;i++){
            minPos = i;
            minValue = array[minPos];
            for(int j=i+1;j<size;j++){
                if(array[j] < minValue){
                    minPos = j;
                    minValue = array[minPos];
                }
            }

            temp = array[i];
            array[i] = array[minPos];
            array[minPos] = temp;
        }
    }

    public static void insertSort(int[] array){
        int size = array.length;


        for(int i=0;i<size-1;i++){
            int temp;
            int j=i+1;
            temp = array[j];
            while(j>0 && array[j-1] >= temp){
                array[j] = array[j-1];
                j--;
            }

            array[j] = temp;
        }



    }
}
