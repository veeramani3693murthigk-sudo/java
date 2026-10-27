
public class Main42 {
    public static void main(String[] args) {

        int arr[] = {7, 4, 9, 1, 8};
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even = even + arr[i];
            } else {
                odd = odd + arr[i];
            }
        }

        System.out.println("Even sum = " + even);
        System.out.println("Odd sum = " + odd);
    }
}
