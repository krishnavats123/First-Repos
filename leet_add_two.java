/*You are given two non-empty linked lists representing two non-negative integers.
 The digits are stored in reverse order, and each of their nodes contains a single digit. 
 Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/

import java.util.Scanner;

public class leet_add_two {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the length of 1st array"); 
       int a=sc.nextInt();
        int l1[]=new int[a];
        for(int i=0;i<a;i++){
            l1[i]=sc.nextInt();}
          /*  System.out.println("enter the length of 2nd array"); 
            int b=sc.nextInt();
            int l2[]=new int[b];
            for(int i=0;i<b;i++){
                l2[i]=sc.nextInt();}*/

            for(int i=l1.length;i>=0;i++){
                  System.out.println(l1[i]);
            }


    }
}
