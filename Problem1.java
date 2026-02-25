package ProblemList;

public class Problem1 {
    //largest element of the array
    public static void main(String[] args) {

        String s="01:10:01PM";

        System.out.println();
        char[] ar=s.toCharArray();

              if(ar[8]=='A'){
                if(ar[0]=='1'&& ar[1]=='2') {
                    ar[0] = '0';
                    ar[1] = '0';
                }
              }
            if(ar[8]=='P') {
                if (!(ar[0] == '1' && ar[1] == '2')) {
                    ar[0] = (char)((((ar[0]-'0')*10 + (ar[1]-'0') + 12) / 10) + '0');
                    ar[1] = (char)((((ar[0]-'0')*10 + (ar[1]-'0') + 12) % 10) + '0');
                }
            }
        for(int i=0;i<ar.length-2;i++){
            System.out.print(ar[i]);
        } String res =ar.toString();

        }




    }


