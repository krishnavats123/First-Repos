import java.util.Scanner;

public class hack_plus_minus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float positive = 0, negative = 0, zerowaale = 0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int item = arr[i];

            if (item == 0) {
                zerowaale++;

            }
            if (item > 0) {
                positive++;

            }
            if (item < 0) {
                negative++;

            }

        }
        System.out.println(positive / arr.length);
        System.out.println(negative / arr.length);
        System.out.println(zerowaale / arr.length);
    }
}