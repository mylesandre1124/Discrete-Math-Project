/**
 * Created by Myles on 3/10/17.
 */
public class AutoArray {

    private int[][] times;
    private double[] avg;


    public int[][] getTimes() {
        return times;
    }

    public void setTimes(int[][] array) {
        this.times = array;
    }

    public double[] getAvg() {
        return avg;
    }

    public void setAvg(double[] avg) {
        this.avg = avg;
    }
    public void printAvg() {
        for (int i = 0; i < avg.length; i++) {
            System.out.println(avg[i]);
        }
    }
}
