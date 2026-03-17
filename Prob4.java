package Prb;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Prob4 {

            public static void main(String[] args) throws IOException {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();int[] arr=new int[n];
                int k=sc.nextInt();
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                System.out.println(Result.divisibleSumPairs(n, k, arr));

            }
        }


class Result {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, int[] ar) {int c=0;
        // Write your code here
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                if(i<j){

                    if((ar[i]+ar[j])%k==0){
                        c++;
                    }
                }
            }
        }






        return c;
    }

}
