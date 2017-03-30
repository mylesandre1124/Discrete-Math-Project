import java.util.Arrays;
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
        System.out.println("Enter the size of the array: ");
        size = input.nextInt();
        System.out.println("Enter the enumeration of the array: ");
        enumeration = input.nextInt();
        bubbleSort = new BubbleSort(size, (size * 2), enumeration);
        int running_time = bubbleSort.getTime(bubbleSort.getEnumeration());
        System.out.println(running_time + " milliseconds");
        input.close();
    }

}
