package kevin.array;

/**
 * Created with IntelliJ IDEA.
 * User: j
 * Date: 13-8-5
 * Time: 上午11:43
 * To change this template use File | Settings | File Templates.
 */
public class Array {
    int[] values;
    int size = 0;

    public Array(int capability) {
        values = new int[capability];
        size = 0;
    }

    //O(N)
    public boolean find(int key) {
        for (int i = 0; i < size; i++) {
            if (values[i] == key) {
                return true;
            }
        }

        return false;
    }

    //O(N)
    public boolean delete(int value) {
        int i;
        for (i = 0; i < size; i++) {
            if (values[i] == value) {
                break;
            }
        }

        if(i==size){
            //没有value
            return false;
        }else {
            //删除value, value后的元素往前移
            for(int j=i; j<size-1; j++){
                values[j] = values[j+1];
            }
        }
        return true;
    }

    //O(1)
    public void insert(int value) {
        values[size++] = value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(size + 2);
        stringBuilder.append("[");

        for (int i = 0; i < size; i++) {
            stringBuilder.append(values[i]);
            if (i != size - 1) {
                stringBuilder.append(",");
            }
        }

        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
