/*import java.util.Scanner;
public class gpt {


    public static void ascending(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // Fix the loop condition here
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ascending(arr); // Call the method to sort the array

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close(); // Close the scanner when done
    }
}

*/
/*import java.util.Scanner;

public class gpt {
    public static int[] add(int arr[]) {
        int sumArr[] = new int[arr.length - 1]; // Create a new array to store the sums
        for (int i = 0; i < arr.length - 1; i++) {
            sumArr[i] = arr[i] + arr[i + 1];
        }
        return sumArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sumArr[] = add(arr);

        System.out.println("Sum of adjacent elements:");
        for (int i = 0; i < sumArr.length; i++) {
            System.out.print(sumArr[i] + " ");
        }
    }
}
*/
