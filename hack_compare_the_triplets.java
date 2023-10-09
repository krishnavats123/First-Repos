import java.util.Scanner;

public class hack_compare_the_triplets {
    public static void triplet(int arr1[], int arr2[],int n ) {
        int count1 = 0, count2 = 0;
        Scanner sc = new Scanner(System.in);

        

        for (int i = 0; i < n; i++) {
            if (arr1[i] > arr2[i]) {
                count1++;
            }
            if (arr1[i] < arr2[i]) {
                count2++;

            }
        }
        System.out.println(count1 + " " + count2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        triplet(arr1, arr2,n);

    }
}
