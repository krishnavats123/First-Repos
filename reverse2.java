import java.util.Scanner;

public class reverse2 {
    public static int reverse(int arr[],int reverse){
        int start=0,temp=0;
        int end = arr.length-1;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            
            start++;
            end--;
        }
        for(int i=end;i<start;i--){
            System.out.println(arr[i]);
        }
     return reverse;
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr, n);
    }

}

