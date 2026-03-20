package DSA.ReverseNumber;

public class ReverseNumber {
    public static void main(String[] args) {
       int n=1234;
        int rem=0;
        while(n!=0) {
            int digit = n % 10;
            rem = (rem * 10) + digit;
            n = n / 10;


        }

        System.out.println(rem);

    }
}
