/**
 * Created by Myles on 3/8/17.
 */
public class Enum {

    private int[] size;
    private int[] times;
    private int[] range;

    public Enum()
    {
        createEnumArray();
    }

    public void createEnumArray()
    {
        size = new int[]{50, 250, 500};
        range = new int[]{100, 500, 1000};
        times = new int[]{100, 1000, 10000};
    }

    public int[] getSize() {
        return size;
    }

    public int[] getTimes() {
        return times;
    }

    public int[] getRange() {
        return range;
    }
}
