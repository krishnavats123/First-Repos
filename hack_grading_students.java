import java.util.Scanner;

public class hack_grading_students {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
           
            if(arr[i]/5!=0 &&  ){

            }
           
           
            if(arr[i]/5==0 && arr[i]>40 ){
                System.out.println(arr[i]);
            }
        }

    }
}