package Prb;

import java.util.Scanner;

public class Prb1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

int[] a={2,6};
        int[] b={24,36};
        int countA=0;
        int countB=0;
        int ai=0;
        int bj=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%6==0){
                countA=countA+1;
                ai=countA;
            }
            if(a[i]%12==0)
            {
                countA=countA+1;
                ai=countA;
            }
        }
        System.out.println(ai);
        for(int j=0;j<b.length;j++){
            if(b[j]%6==0){
                countB=countB+1;
                bj=countB;
            }
            if(b[j]%12==0){
                countB=countB+1;
                bj=countB;
            }
        }
        System.out.println(bj);

        System.out.println(countA + " "+ countB );
        if(countA!=countB){
            System.out.println(countA );
            System.out.println(countB);
        }





//       int arr[]={10, 8, 30, 4, 5,23,1,4,53,0,3,25 };
//       int x=5;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==x){
//                System.out.println(arr[i-1]);
//            }
//
//        }
//        for (int i = 0; i < arr.length; i=i+2) {
//            System.out.println(arr[i]);
//        }
//
//        System.out.println("Enter the number :");
//        int ser=new Integer(sc.nextLine());
//        boolean search=false;
//        for (int i=0;i< arr.length;i++){
//            if(arr[i]==ser){
//                System.out.println("Found !!"+i);search=true;break;
//            }
//        }
//if (!search){
//    System.out.println("Not found!!!");
//}
//
//
//int max=arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println("Max "+max);
//        int s=0;
//        int e= arr.length-1;
//
//        while(s<e){
//            int temp=arr[s];
//            arr[s]=arr[e];
//            arr[e]=temp;
//            s++;
//            e--;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(i+" ");
//        }
//        int index=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]!=0){
//                arr[index++]=arr[i];
//            }
//        }
//        while(index< args.length){
//            arr[index++]=0;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(i+" ");
//        }
//
//















    }


}
