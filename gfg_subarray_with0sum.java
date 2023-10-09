import java.util.Scanner;

public class gfg_subarray_with0sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int sum=0;
        //int flag=0;
        for(int i=0;i<n;i++){
            sum++;
        }
        if(sum==0){
            System.out.println("true");

        }
        else{
            System.out.println("False");
        }
       
        }
    }
