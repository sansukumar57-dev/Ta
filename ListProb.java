import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(int[][] arr,int n) {
        // Write your code here
        int a=0;int b=0;


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j)  {
                    a=a+arr[i][j];
                }

                if(i + j == n - 1)  {
                    b=b+arr[i][j];
                }

            }
        }

        int res=a-b;
        if(res<0){
            res=-res;
        }
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner (System.in);

        int n=sc.nextInt();

        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println(Result.diagonalDifference(arr,n));



    }
}
