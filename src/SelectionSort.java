import java.util.Random;

/**
 * Created by Myles on 3/18/17.
 */
public class SelectionSort {

    private int[] array;
    private int size;
    private int enumeration;
    private int time;

    public SelectionSort(int size, int range, int enumeration) {
        this.size = size;
        createArray(size, range);
        this.enumeration = enumeration;
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

    public int[] selectionSort(int[] array1){

        for (int i = 0; i < array1.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array1.length; j++)
                if (array1[j] < array1[index])
                    index = j;

            int smallerNumber = array1[index];
            array1[index] = array1[i];
            array1[i] = smallerNumber;
        }
        return array1;
    }

    public int[] selectionSort(){

        for (int i = 0; i < this.array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < this.array.length; j++)
                if (this.array[j] < this.array[index])
                    index = j;

            int smallerNumber = this.array[index];
            this.array[index] = this.array[i];
            this.array[i] = smallerNumber;
        }
        return this.array;
    }

    public int getTime(int enumeration)
    {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < enumeration; i++)
        {
            selectionSort();
        }
        long stopTime = System.currentTimeMillis();
        int running_time = (int)(stopTime - startTime);
        return running_time;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort(50, 100, 100);
        selectionSort.selectionSort(selectionSort.getArray());
        int count = 0;
        for (int i = 0; i < selectionSort.getArray().length; i++) {
            System.out.println(selectionSort.getArray()[i]);
            count++;
        }
        System.out.println(count);
    }
}
