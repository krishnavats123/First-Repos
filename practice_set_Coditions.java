//Q-1 whether the student is passed or fail
/*import java.util.Scanner;
public class practice_set_Coditions{ 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of first subject");
        int a = sc.nextInt();
        int a1 = (a%100);

        System.out.println("Enter the no of second subject");
        int b  = sc.nextInt();
        int b1 = (b%100);
        

        System.out.println("Enter the no of third subject");
        int c = sc.nextInt();
        int c1 = (c%100);

        int percent = (a+b+c)/3;

        if(a>=33 &&  b>=33  && c>=33 && percent>40)
        {
            System.out.println("youre passed!!\n\tCongratulations!!");

        }
        else{
            System.out.println("youre failed\nYoure not promoted as your total and marks per subject are low ");
        }
          

        




        
    }
}

*/


//Q-3 To calculate the taxes
/*import java.util.Scanner;
public class practice_set_Coditions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tax=0;
        System.out.println("enter you salary");

         
        int Income =sc.nextInt();
        
       
    
        if(Income<=250000){
            
            System.out.println("no tax");
        }

        else if(Income>250000 && Income<=500000){ 
            tax= ((5/100)*Income);
        }

        else if(Income>500000 && Income<=1000000){ 
            tax=( (20/100)*Income);}

        else if (Income>1000000){ 
            tax=( (30/100)*Income); }
            
            System.out.println("total tax to be paid is "+ tax );

        




    }

}

*/
/*
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;
public class practice_set_Coditions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter day");
        int day=sc.nextInt();
        switch (day) {
            case 1:System.out.println("Monday");
                
                break;
            case 2:System.out.println("tuesday");
                
                break;
            case 3:System.out.println("Wednesday");
                
                break;
            case 4:System.out.println("Thursday");
            
            
                
                break;
            case 5:System.out.println("Friday");
                
                break;
            case 6:System.out.println("Saturday");
                
                break;
            case 7:System.out.println("Sunday");
                
                break;
            
        
            default:
            System.out.println("enter valid day");
                break;
        }
    }
}

*/
//ROCK PAPER AND SCISSORS GAME
import java.util.Scanner;

public class practice_set_Coditions{
    public static void main(String[] args) {
      /*  System.out.println("play your move");
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(i<=5)

        {
            String a1="Rock";
            String b1="Paper";
            String c1="Scissors";
          
            if()






        }
    }


}
*/
int i=100;
while (i<=200){
    System.out.println(i);
    i++;
}








}
}