import java.util.Scanner;
public class practice_set{

    public static void main(String[] args) {
       //Q1-Change string to lowercase
        String practice="Hello My Name Is Krishna Vats";
        System.out.println(practice.toLowerCase());

       //Q2-Replace spaces with underscores
       String greets =("How was your day going ?? Do you enjoy");
       System.out.println(greets.replace(" " ,"_"));

       //Q3-Replace letter
       Scanner sc= new Scanner(System.in);
       String name=sc.next();
       String Letter =("Dear "+name+",Thanks a lot!!");
       System.out.println(Letter);
       System.out.println(Letter.replace(name,"some name"));


       //Q4-To detect double and triple spaces in code
       String Krishna=("      hello what are you going to do   today?? lets hit the gym together       ");
       System.out.println(Krishna.indexOf("  "));
       System.out.println(Krishna.indexOf("   "));


       //Q5-In form of a letter 
       String Letter1="Dear God,\n Thanks \n for this Beautiful life";
       System.out.println(Letter1);


    }
}