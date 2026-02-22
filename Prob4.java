package Problems;

import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int prev=0;
        int dub=0;
        for(int i=0;i< arr.length;i++){
            if( arr[i]>prev){
                prev=arr[i];
                dub=1;
            }
            if(prev == arr[i]){
               dub++;
            }

        }
        System.out.println(dub);

    }
}
