import java.util.Scanner;



public class reverse_array {
    public static int reverse(int arr[],int reverse){
    int first=0,last=arr.length-1,temp=0;
    while(first<last){
        temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
        first++;
        last--;
    }
    
    return reverse;
    }
    public static void main(String[] args) {
        
    
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    reverse(arr, n);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}
