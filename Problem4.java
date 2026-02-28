package ProblemList;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,7,5,6};
   //     System.out.println("1,3");
        for (int i = 0; i < arr.length; i++) {
            if(!(arr[i]%2==0)){
                System.out.println(arr[i]);
            }
        }
        int target=12;
int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<i;j++) {
                if ( target ==arr[j]+arr[j+1]){
                    sum=arr[j]+ arr[j+1];
                    j++;
                }
            }

        }
        System.out.println(sum);
    }
}
