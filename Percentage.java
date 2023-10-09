import java.util.Scanner;
public class Percentage{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no.of first subject");
        float a=sc.nextInt();
        System.out.println("Enter the no. of second subject");
       float b=sc.nextInt();
        System.out.println("Enter the no. of third subject");
       float c=sc.nextInt();
        System.out.println("Enter the no. fourth subject");
        float d=sc.nextInt();
        System.out.println("Enter the no. of fifth subject");
        float e=sc.nextInt();
        float sum=a+b+c+d+e;
        System.out.println("percentage of your subjects are");
        float percent=(sum/500)*100;
        System.out.println(percent);
    }
}