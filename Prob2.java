package Prb;

import java.util.Scanner;

public class Prob2 {
    static int[] pb2(int[] arr){
        int max=arr[0];
        int smax=arr[0];
        int min=arr[0];
        int smin=arr[0];
        int minc=0;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>smin&&arr[i]!=min){
                smin=arr[i];

            }
        }
        System.out.println(min);
        System.out.println(smin);






        return new int[]{min};
    }
    public static void main(String[] args) {
        int[] arr={12,24,10,24};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] sore=new int[n];

        for (int i = 0; i < n; i++) {
            sore[i]=sc.nextInt();
        }
        System.out.println(Prob2.pb2(sore));
    }
}
