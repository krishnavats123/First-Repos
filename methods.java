import java.util.Scanner;
public class methods {
     static int logic(int x , int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=x*y;
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=30;
        int b=40;
        int c;
        c=logic(a,b);
        System.out.println(c);


        int a1=44;
        int b1=40;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c1);

    }
}
