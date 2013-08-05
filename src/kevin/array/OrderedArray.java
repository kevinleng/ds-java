package kevin.array;

/**
 * Created with IntelliJ IDEA.
 * User: j
 * Date: 13-8-5
 * Time: 上午11:43
 * To change this template use File | Settings | File Templates.
 */
public class OrderedArray {
    int[] values;
    int size = 0;

    public OrderedArray(int capability) {
        values = new int[capability];
        size = 0;
    }

    //O(logN)
    public int find(int key) {
        int low, high;
        low = 0;
        high = size - 1;
        int mid;

        while (true) {
            mid = (high + low) / 2;

            int midValue = values[mid];
            if (midValue == key) {
                return mid;
            } else if (low > high) {
                return size;
            } else {
                if (key < midValue) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

    }

    //O(N)
    public boolean delete(int value) {
        int i = find(value);
        if (i < 0) {
            return false; //do not have this value
        } else {

            for (int j = i; j < size - 1; j++) {
                //前移
                values[j] = values[j + 1];
            }
            size--;
        }
        return true;
    }

    //O(N)
    public void insert(int value) {
        int i;
        for (i = 0; i < size; i++) {
            //linear search
            if (values[i] > value) {
                break;
            }
        }

        for (int j = size; j > i; j--) {
            values[j] = values[j - 1]; //后移
        }
        values[i] = value;
        size++;
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
