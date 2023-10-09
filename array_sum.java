import java.util.Scanner;

public class array_sum {
  
    static int add(int ar[]){
      int addition=0;
      for(int i=0;i<ar.length;i++){
         addition=addition+ar[i];
      }  
      return addition ;
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
          int a=add(arr);
        System.out.println(a);
        
    }
}
