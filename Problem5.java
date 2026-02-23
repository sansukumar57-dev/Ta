package Problems;

import java.util.Scanner;

public class Problem5 {
    static  String timeConversion(String n){
        char[] time= n.toCharArray();
        for (int i = 0; i < time.length; i++) {
            System.out.println(time[i]);
        }
       return time.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
      //  Problem5.timeConversion(n);
        char[] time= n.toCharArray();
        for (int i = 0; i < time.length; i++){
            System.out.println(time[i]);
        }
    }
}
