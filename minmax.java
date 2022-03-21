package arraypratice;

public class minmax {
    public static void main(String[] args){
        int n=6;

        int a[]={1,2,3,4,5,6};
        int min=a[0];
        int max=a[0];
        for(int i=0;i<n;i++){
            if(min>a[i]){
                min=a[i];
            }
            if(max<a[i]){
                max=a[i];
            }

        }
        System.out.print(min+" "+max);

    }


}
