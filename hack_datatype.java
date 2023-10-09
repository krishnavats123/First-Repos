import java.util.*;
public class hack_datatype{
    public static void main(String [] args)
    {
     Scanner sc = new Scanner(System.in);
      
       int n=sc.nextInt();
       for(int i=0;i<n;i++){
           long a =sc.nextLong();
       
        if(a>=-128 && a<=127){
               
            System.out.println(a+" can be fitted in:");
            System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                 System.out.println("* long");}
 
        else if(a>=-32768 && a<=32767){
            System.out.println(a+" can be fitted in:");
            System.out.println("* short");
             System.out.println("* int");
              System.out.println("* long");
             }
       
       else if(a>=-2147483648 && a<=2147483647){
            System.out.println(a+" can be fitted in:");
            System.out.println("* int");
            System.out.println("* long");
            }
                 
       else if(a<=Long.MAX_VALUE && a>Long.MIN_VALUE){
          
           System.out.println("* long");}
           
          else if (a<Long.MAX_VALUE){
            System.out.println(a+" can't be fitted anywhere.");}
            
           }
    }
}
       
       
