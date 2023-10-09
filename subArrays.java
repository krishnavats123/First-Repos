public class subArrays {
    public static void subArrays(int arr[]) {
        int a = Integer.MIN_VALUE;
        int curr = 0;

        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;
                curr = 0;
                for (int k = start; k <= end; k++) {
                    curr += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println(curr);
                if (a > curr) {
                    a = curr;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 65, 99, 897, 666, 34 };
        subArrays(arr);
    }

}