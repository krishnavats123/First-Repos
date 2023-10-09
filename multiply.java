import java.util.Scanner;

public class multiply{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("ENTER YOUR FIRST NO.");
      int a=sc.nextInt();
      System.out.println("ENTER YOUR SECOND NO.");
      int b=sc.nextInt();
      int multiply=a*b;
      System.out.println("multiplication of both your no.s are "+multiply);
      
    }
}