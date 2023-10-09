import java.util.Scanner;

public class linear_search{
    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]==key){
                return i;
            } 
     }
   return -1;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
      int numbers[]=new int [n];
      for(int i=0;i<n;i++){
        numbers[i]=sc.nextInt();}
      int key =7;
      int index=linearsearch(numbers, key);
      if( index==-1){
        System.out.println("not found");}
        else
          System.out.println("key is at"+index);
    }
    }
