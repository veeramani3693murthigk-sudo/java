
import java.util.*;
public class Main39 {
    public static void main(String[] args) {
 int arr1[] = {5, 3, -1, 2, 1, 8,6,7};
 int arr2[] = {6, 1, 0, 2, 9, 5, 6, 3, 7, 4};
 System.out.println("Test Case 1:");
 findMissingPositive(arr1);
System.out.println("Test Case 2:");
findMissingPositive(arr2);
    }
public static void findMissingPositive(int arr[]) {
        for (int i = 0; i <= 9; i++) {
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Missing positive number = " + i);
            }
        }
    }
}
