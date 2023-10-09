import java.util.Scanner;
public class gfg_Multiply_left_and_right_array_sum {
    public static int gfg(int arr[],int result){

if(arr.length%2==0){
     int leftSum = 0;
     for (int i = 0; i < arr.length / 2; i++) {
         leftSum += arr[i];
     }
     int rightSum = 0;
     for (int i = arr.length / 2; i < arr.length; i++) {
         rightSum += arr[i];
     }
      result = leftSum * rightSum;
     System.out.println("Result: " + result);
 } else {
     System.out.println("Array length is not even, so the operation cannot be performed.");
 }

    return result;
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY");
        int n=sc.nextInt();
        int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("sum"+gfg(arr, n));
    }
}



        
    


    
