package Problems;

import java.math.BigInteger;
import java.util.*;
public class ListProb {
   static long simpleArray(int[] a){
       long sum=0;
       for (int i = 0; i < a.length; i++) {
           sum= sum+a[i];
       }
return sum;
    }
   public static void main(String[] args) {

//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter the number");
//       int six=sc.nextInt();
//       int[] array=new int[six];
//       for(int i=0;i<six;i++){
//        array[i]  =sc.nextInt();
//       }
       Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr=new int[n];

     for(int i=0;i<n;i++){
     arr[i]= sc.nextInt();
     }
    System.out.println(ListProb.simpleArray(arr));

   }
}
