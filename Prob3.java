package Problems;

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int sum=0;
        int min=arr[0];
        int max=arr[0];

        for(int i = 0; i < arr.length; i++){
            sum=sum+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<max) {
                max = arr[i];
            }
            if(arr[i]>min) {
                min =  arr[i];
            }

        }
        System.out.println(sum-max);
        System.out.println(sum-min);

//
    }
}
