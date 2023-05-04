package Medium;
import java.util.HashMap;

public class TwoSum {
    
    public static void main(String[] args){
        int [] nums={3,3};
        int target=7;
        int [] ans=twosum(nums,target);
        System.out.println(ans[0] + ","+ ans[1]);
    }

    public static int[] twosum(int nums[],int target){
        HashMap<Integer,Integer> hm=new HashMap<>();
        //int[] ans=new int[2];
        //ans[0]=ans[1]=-1;
        for(int i=0;i<nums.length;i++){
            int remaining=target-nums[i];
            if(hm.containsKey(remaining))
                return new int[]{hm.get(remaining),i};
                /*if using void function
                ans[0]=hm.get(remaining);
                ans[1]=i;
                return ans;
                */
            else
                hm.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}

