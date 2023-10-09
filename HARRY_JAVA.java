//ALL JAVA CODES FROM JAVA NOTES
/*import java.util.Scanner;
public class HARRY_JAVA {
public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER YOUR NO.");
        int a=scan.nextInt();
        System.out.println("ENTER YOUR NO.");     
        int b=scan.nextInt();
        System.out.println("ENTER YOUR NO.");
        int c=scan.nextInt();
        int sum=a+b+c;
        System.out.println("YOUR SUM IS");
        System.out.println(sum);

    }
}*/
/*public class HARRY_JAVA{
    public static void main(String[] args) {
         
        int y=7;
        int x=y++*8;
        System.out.println(x);
    }
}*/
/*public class HARRY_JAVA{
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=2;
        int sum=(((b*b)-(4*a*c))/(2*a));
        System.out.println(sum);
        System.out.println(++a);
        System.out.println(a);
    }
}
*/


//CODE TO PRINT WEEK DAYS BY SWITCH CASE
/*import java.util.Scanner;
    public class HARRY_JAVA{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("ENTER YOUR DAY");
    int a = sc.nextInt();
    switch(a){
        case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tuesday");
        break;
        case 3:
        System.out.println("Wednesday");
        break;
        case 4:
        System.out.println("Thursday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("Saturday");
        break;
        case 7:
        System.out.println("Sunday");
        break;
        
    }
         
    }
}*/

//code of week days by the help of if else statement


/*import java.util.Scanner;
public class HARRY_JAVA{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);  
    System.out.println("ENTER YOUR DAY");
    int a=sc.nextInt() ;
    if(a==1)
    System.out.println("Monday");     
    else if(a==2)
    System.out.println("Tuesday");     
    else if(a==3)
    System.out.println("Wednesday");     
    else if(a==4)
    System.out.println("Thursday");     
    else if(a==5)
    System.out.println("Friday");     
    else if(a==6)
    System.out.println("Saturday");     
    else
    System.out.println("Sunday");     
    }
}*/

//LOOP STATEMENTS

/*import java.util.Scanner;
public class HARRY_JAVA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE TABLE U WANT TO PRINT");
        int a = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(a + " X " + i +" = "+a*i);
        }
    }
}*/
/*import java.util.Scanner;
public class HARRY_JAVA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int n = sc.nextInt();
        
        do{
            
            System.out.println(i);

        }while(i=0;i<n;i++);
        
    }
}*/
/*import java.util.Scanner;
public class HARRY_JAVA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=n;i>0;i--){
          System.out.println(i);
        }
        
    }
}*/
 
/*import java.util.Scanner;
public class HARRY_JAVA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=2*n;i+=2)
        {
          System.out.println(i);
        }        
    }
}*/
/*import java.util.Scanner;
public class HARRY_JAVA{
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int marks[]=new int[4];
        marks[0]=30;
        marks[1]=30;
        marks[2]=30;
        marks[3]=350;
        for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);
    }
    }
}
*/


//TO INPUT AN ARRAY FROM USER

/*import java.util.Scanner;
public class HARRY_JAVA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[]= new int[6];
        for(int i=0;i<6;i++){
            marks[i]=sc.nextInt();
        }
        for (int i=0;i<marks.length;i++)
            System.out.println(marks[i]);
    }
}*/
/*
import java.util.Scanner;
public class HARRY_JAVA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}*/
/*
import java.util.Scanner;
public class HARRY_JAVA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for( int i=0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("MATCHED");}
            else
                System.out.println("NOT MATHCED");

            }
            }
            
            }
 */

//METHODS IN JAVA

/*import java.util.Scanner;
public class HARRY_JAVA{
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
*/


import java.util.Scanner;
public class HARRY_JAVA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}

/*
import java.util.Scanner;
public class HARRY_JAVA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}
import java.util.Scanner;
public class HARRY_JAVA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}
import java.util.Scanner;
public class HARRY_JAVA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}
import java.util.Scanner;
public class HARRY_JAVA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}
import java.util.Scanner;
public class HARRY_JAVA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}*/