import java.util.Random;

/**
 * Created by Myles on 3/18/17.
 */
public class SelectionSort {

    private int[] array;

    public SelectionSort(int size, int range) {
        createArray(size, range);
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

    public int[] selectionSort(int[] array){

        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;

            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
        return array;
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
        SelectionSort selectionSort = new SelectionSort(50, 100);
        selectionSort.selectionSort(selectionSort.getArray());
        int count = 0;
        for (int i = 0; i < selectionSort.getArray().length; i++) {
            System.out.println(selectionSort.getArray()[i]);
            count++;
        }
        System.out.println(count);
    }
}
