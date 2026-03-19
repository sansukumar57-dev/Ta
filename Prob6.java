package Prb;

import java.util.Arrays;

public class Prob6 {
static int search(int[] arr,int t){
    int l=0;int r=arr.length-1;
while(l<=r){
int mid=(l+r)/2;
if(arr[mid]==t){
    return mid;

}
if(arr[mid]<t){
   l= mid-1;
}
if(arr[mid]>t){
   r=mid+1;
}
    System.out.println(mid);
    System.out.println(l);
    System.out.println(r);
}
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]==t){
                   return j;
               }
            }

    return -1;
}
    public static void main(String[] args) {
        int[] arr={1,3,4,12,8,10,13,122,2};
        int target=3;
        System.out.println(Arrays.binarySearch(arr,target));
        System.out.println(search(arr,target));
    }
}
