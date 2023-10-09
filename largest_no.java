import java.util.Scanner;

public class largest_no {
    public static int largest(int number[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
        }
        return largest;
    }
    public static int smallest(int number[]){
            int smallest= Integer.MAX_VALUE;
            for(int i=0;i<number.length;i++){
            if(smallest>number[i]){
            smallest=number[i];
        }
    }
    return smallest;
    
}



   public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      System.out.println("ENTER ARRAY LENGTH");
        int n=sc.nextInt();
       
        
        int number[]=new int[n];
        for (int i=0;i<n;i++){
            number[i]=sc.nextInt();
            
            
        }
        int largest_no=largest(number);
        int smallest_no=smallest(number);
        System.out.println("LARGEST NO. IS- "+largest_no);
        System.out.println("SMALLEST NO. IS- "+smallest_no);
    }
} 
    
    
