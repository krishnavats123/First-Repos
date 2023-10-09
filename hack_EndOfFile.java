import java.util.Scanner;
public class hack_EndOfFile{
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
String [] no= new String[n];
   for(int i=0;i<n;i++){
   
    no[i] =sc.nextLine();}
  for(int j=0;j<n;j++){
    System.out.println(j+1 +" "+no[j]);
  }
  }
}
