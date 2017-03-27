import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Myles on 3/8/17.
 */
public class BubbleSort {

    private int size;
    private int[] array;
    private int range;
    private AutoArray autoArray;

    public BubbleSort(int size) {
        this.size = size;
    }

    public BubbleSort(int size, int range) {
        this.size = size;
        createArray(size, range);
    }
    public BubbleSort()
    {

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
        return running_time;
    }


    public int[][] autoEnum()
    {
        Enum enumeration = new Enum();
        int[] size = enumeration.getSize();
        int[] range = enumeration.getRange();
        int[] times = enumeration.getTimes();
        int[][] timesReturned = new int[3][3];
        for (int i = 0; i < size.length; i++) {
            createArray(size[i], range[i]);
            System.out.println(range[i]);
            for (int j = 0; j < times.length; j++) {
                timesReturned[i][j] = getTime(times[j]);
                System.out.println(size[i] + " " +  times[j] + " " + timesReturned[i][j]);
            }
        }
        System.out.println();
        return timesReturned;
    }

    public void printEnum(AutoArray autoArray)
    {
        int[][] times = autoArray.getTimes();
        for (int i = 0; i < times.length; i++) {
            for (int j = 0; j < times[i].length; j++) {
                System.out.print(times[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public double[] avgArrays(int[][] array)
    {
        double[] avgArray = new double[3];
        for (int i = 0; i < 3; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += array[i][j];
            }
            avgArray[i] = total / 3.0;
        }
        return avgArray;
    }

    public AutoArray createAutoArray()
    {
        AutoArray autoArray = new AutoArray();
        autoArray.setTimes(autoEnum());
        autoArray.setAvg(avgArrays(autoArray.getTimes()));
        return autoArray;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        AutoArray autoArray = bubbleSort.createAutoArray();
        //bubbleSort.printEnum(autoArray.getTimes());
    }
}
