//so basically we have to find the maximum no. in the array

import java.util.Scanner;

public class gfg_fighting_the_dark {
 public static int candle(int arr[]){
      int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
         if (arr[i]>max){
            max=arr[i];
            
         }
      }

    return max;
 }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(candle(arr));
    }
    
}
