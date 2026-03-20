package DSA.CountDigit;

public class CountDigits {
    public int countDigits(int n) {
        // code here
        int c=0;
        while(n>0){
            n= n/10;
            c++;

        }
        return c;
    }
    public static void main(String[] args) {
        CountDigits cs=new CountDigits();
        System.out.println(
        cs.countDigits(123));
    }
}
