import java.util.Scanner;

public class hack_birthday_candles {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        int a = Integer.MIN_VALUE;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a < arr[i]) {
                a = arr[i];
            }
            
        }
        for (int i = 0; i < n; i++) {
        if(arr[i]==a){
            count++;
        }
        }
        System.out.println(count);
    }

}