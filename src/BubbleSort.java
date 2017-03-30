import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Myles on 3/8/17.
 */
public class BubbleSort {

    private int size;
    private int[] array;
    private int enumeration;
    private int time;

    public BubbleSort(int size) {
        this.size = size;
    }

    public BubbleSort(int size, int range, int enumeration) {
        this.size = size;
        createArray(size, range);
        this.enumeration = enumeration;
    }
    public BubbleSort()
    {

    }

    public int getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(int enumeration) {
        this.enumeration = enumeration;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void createArray(int size, int range)
    {
        Random random = new Random();
        this.array = new int[size];
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(range) + 1;
            this.array[i] = randomNumber;
        }
    }

    public int[] createArray(int size, int range, int[] array)
    {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(range) + 1;
            array[i] = randomNumber;
        }
        return array;
    }

    public int[] bubbleSort(int[] array) {
        int length = array.length;

        for (int first = length; first > 0; first--)
        {
            for (int second = 1; second < first; second++) {
                if (array[second - 1] > array[second])
                {
                    swap(array, second - 1, second);
                }
            }
        }
        return array;
    }

    public int[] bubbleSort() {
        int length = this.array.length;

        for (int first = length; first > 0; first--)
        {
            for (int second = 1; second < first; second++) {
                if (this.array[second - 1] > this.array[second])
                {
                    swap(this.array, second - 1, second);
                }
            }
        }
        return this.array;
    }

    public int[] swap(int[] array, int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
        return array;
    }

    public int getTime(int enumeration)
    {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < enumeration; i++)
        {
            bubbleSort();
        }
        long stopTime = System.currentTimeMillis();
        int running_time = (int)(stopTime - startTime);
        this.time = running_time;
        return running_time;
    }


    public void printArray()
    {
        int[] array = getArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }



    public static void main(String[] args) {
        //BubbleSort bubbleSort = new BubbleSort();
        //AutoArray autoArray = bubbleSort.createAutoArray();
        //bubbleSort.printEnum(autoArray.getTimes());
    }
}
