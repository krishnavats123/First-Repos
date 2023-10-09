import java.util.Scanner;

public class cgpa{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of subject 1");
        float a=sc.nextInt();
        System.out.println("Enter the no. of subject 2");
        float b=sc.nextInt();
        System.out.println("Enter the no. of subject 3");
        float c=sc.nextInt();
        System.out.println("Enter the no. of subject 4");
        float d=sc.nextInt();
        float sum=a+b+c+d;
        System.out.print("Your CGPA is ");
        float CGPA=(((sum/400)*100)/10);
        System.out.println(CGPA);






    }
}

