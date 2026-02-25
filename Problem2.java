package ProblemList;
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
public class Problem2 {


    class Result {

        /*
         * Complete the 'gradingStudents' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY grades as parameter.
         */

        public static int[] gradingStudents(int[] grades) {
            // Write your code here

            int len=grades.length;
            int ans=0;
            for(int i=0;i<len;i++){
                if(grades[i]%5==3&&grades[i]>=38){
                    ans=grades[i]+2;
                    System.out.println(ans);

                }
                if(grades[i]%5==4&&grades[i]>=38){
                    ans=grades[i]+1;
                    System.out.println(ans);

                }
                if(grades[i]%5==2||grades[i]<38||grades[i]%5==1||grades[i]%5==0){
                    ans=grades[i];
                    System.out.println(ans);

                }


            }



            int[] arr=new int[ans];

            return arr;

        }

    }


        public static void main(String[] args) throws IOException {
            Scanner sc= new Scanner(System.in);
            int n= sc.nextInt();
            int[] arr= new int[n];



            for(int i=0;i<arr.length;i++){
                arr[i]= sc.nextInt();

            }
            Result.gradingStudents(arr);



        }
    }


