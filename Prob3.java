package Prb;

import java.util.Scanner;

public class Prob3 {
    static int birthday(int[] arr,int d, int m){

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<=m) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] + arr[j] == d) {
                        return arr[j];
                    }
                }

            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        System.out.println(Prob3.birthday(arr,d,m));
    }
}
