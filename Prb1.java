package Prb;

import java.util.Scanner;

public class Prb1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
//
        int[] a={2,6};
        int[] b={16,32,96};





        int count = 0;

        for(int k = 1; k <= 100; k++) {

            boolean flag = false; // reset every iteration

            // check if k divisible by all elements of a
            for(int i = 0; i < a.length; i++) {
                if(k % a[i] != 0) {
                    flag = true;
                    break;
                }
            }

            // check if k divides all elements of b
            for(int j = 0; j < b.length; j++) {
                if(b[j] % k != 0) {
                    flag = true;
                    break;
                }
            }

            if(!flag) {
                count++;
            }
        }

        System.out.println(count);




    }


}
