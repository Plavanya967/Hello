package arraypratice;

import java.util.HashMap;
import java.util.Map;

public class hashingpairsum
{
    static void pairsum(int nums[],int target){
        boolean r= false;
        Map<Integer,Integer> map= new HashMap<>();

        for(int i=0;i< nums.length;i++){
            if(map.containsKey(target-nums[i])){
                System.out.println(target-nums[i]+" "+nums[i]);
                r=true;
            }


            map.put(nums[i],i);
        }
       if(r==false){
           System.out.println(0);
       }

    }
    public static void main(String[] args) {
        int nums[]={8, 7, 2, 5, 3, 1};
        int target=10;
        pairsum(nums,target);

    }
}
