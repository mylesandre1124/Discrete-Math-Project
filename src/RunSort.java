import java.util.Date;
import java.util.Scanner;

/**
 * Created by Myles on 3/8/17.
 */
public class RunSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 0;
        int enumeration = 0;
        BubbleSort bubbleSort;
        long running_time = 0;
        System.out.println("Enter the size of the array: ");
        size = input.nextInt();
        System.out.println("Enter the enumeration of the array: ");
        enumeration = input.nextInt();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < enumeration; i++)
        {
            bubbleSort = new BubbleSort(size, 100);
            int[] sorted = bubbleSort.bubbleSort();
        }
        long stopTime = System.currentTimeMillis();
        running_time = stopTime - startTime;
        System.out.println(running_time + " milliseconds");
        input.close();
    }

}
