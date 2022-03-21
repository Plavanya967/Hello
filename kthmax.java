package arraypratice;

import java.util.Arrays;

public class kthmax {
    public static void main(String[] args){
        int n= 8;
        int a[]={1,2,9,8,7,9,10,11};
        int k=3;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(i==(n-k)){
                System.out.print(a[i]);
            }
        }
    }
}
