import java.util.Scanner;

public class hack_long_sum {
  
    static long add(long ar[]){
      long addition=0;
      for(int i=0;i<ar.length;i++){
         addition=addition+ar[i];
      }  
      return addition ;
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
          long a=add(arr);
        System.out.println(a);
        
    }
}
