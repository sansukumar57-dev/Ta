package DSA.PalindromeNumber;

public class PalindromeNumber {

    public static void main(String[] args) {
        int n=1234321;

        int rem=0;

        int orginal=n;

        while(n!=0){
            int digit=n%10;
            rem=(rem*10)+digit;
            n=n/10;
        }
        if(orginal==rem){
            System.out.println("this is the palindrome number");
        }
        else{
            System.out.println("it is not palindrome number");
        }
    }
}
