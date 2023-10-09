import java.util.Scanner;

public class pair_array {
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int current=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print(" ("+ current +","+arr[j]+") ");
            }
            System.out.println();
        }
        
    }
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            //int n=sc.nextInt();
            int arr[]={3,6,3,5,8,9,10};
            /*for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }*/
            pairs(arr);
        }
}

  