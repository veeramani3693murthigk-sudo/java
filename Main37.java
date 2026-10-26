import java.util.*;
public class Main37 {
    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[] arr = {7, 8, 15, 17, 91, 15};

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
