import java.util.Scanner;

public class binary_search {

    public static void binarysearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        // comparisions
        while (start <= end) {
            if (arr[mid] == key) {
                System.out.println("key found at index" + arr[mid]);
            }
            if (arr[mid] > key) {// left case
                end = mid - 1;
            } else {// right case
                start = mid + 1;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = 10;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // sort the array in ascending

        for (int i = 0; i < n; i++) {
            for (int j = 0; i < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("key is at index" + binarysearch(arr, key));
        }
    }
}