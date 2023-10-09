import java.util.Scanner;

public class Hack_Utopiantree {
    static int logic(int n) {
        // x==n
        int z;
        int h = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                h = h + 1;
            } else {
                h = 2 * h;
            }
        }
        return h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cycles");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            System.out.println(logic(n));

        }

    }
}
