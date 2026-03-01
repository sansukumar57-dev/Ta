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
public class Problem5 {



        class Result {

            /*
             * Complete the 'countApplesAndOranges' function below.
             *
             * The function accepts following parameters:
             *  1. INTEGER s
             *  2. INTEGER t
             *  3. INTEGER a
             *  4. INTEGER b
             *  5. INTEGER_ARRAY apples
             *  6. INTEGER_ARRAY oranges
             */

            public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[]oranges) {
                // Write your code here
                int apple=0;
                int orange=0;
                for(int i=0;i<apples.length;i++){
                    int dis=apples[i]+a;

                    if(dis>=s && dis<=t){
                        apple++;

                    }
                }
                for(int i=0;i<oranges.length;i++){
                    int dis=oranges[i]+b;

                    if(dis>=s&&dis<=t){
                        orange++;

                    }
                }
                System.out.println(apple);
                System.out.println(orange);


            }

        }


            public static void main(String[] args) throws IOException {
                Scanner sc=new Scanner(System.in);
                int s=sc.nextInt();
                int t=sc.nextInt();
                int a=sc.nextInt();
                int b=sc.nextInt();
                int applesn=sc.nextInt();
                int mangosn=sc.nextInt();
                int[] apples=new int[applesn];
                for(int i=0;i<applesn;i++){
                    apples[i]=sc.nextInt();
                }

                int[] oranges=new int[mangosn];
                for(int i=0;i<mangosn;i++){
                    oranges[i]=sc.nextInt();
                }

                Result.countApplesAndOranges(s, t, a, b, apples, oranges);




            }
        }

