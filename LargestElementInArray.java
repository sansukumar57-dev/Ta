package DSA.Array;

public class LargestElementInArray {
    static  int arrayLarge(int[] arr){
        int i=arr[0];
        for (int j = 1; j < arr.length; j++) {
            for (int k = 1; k < arr.length; k++) {
                if(arr[j]<=arr[k]){
                    i=arr[k];
                }
            }

        }


        return  i;
    }
    public static void main(String[] args) {
        int[] ar={1, 8, 7, 56, 90};
        int[] arr={5, 5, 5, 5};
        int[] aa={10};
        int a= arrayLarge(ar);
        System.out.println(a);
    }
}
