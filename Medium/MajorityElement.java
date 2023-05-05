package Medium;
import java.util.HashMap;
import java.util.Map;
public class MajorityElement {
   
    public static int majority(int nums[], int n){
        //Time Complexity: O(N*logN) + O(N), where N = size of the given array.
        //Space Complexity: O(N) as we are using a map data structure.
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<n;i++){
            int val=hm.getOrDefault(nums[i],0);
            hm.put(nums[i],val+1);
        }
        
        for(Map.Entry<Integer, Integer> it:hm.entrySet()){
            if(it.getValue() > n/2)
                return it.getKey();
        }
        return -1;

    }
    public static void main(String[] args){

        int[] nums={4,4,2,4,3,4,4,3,2,4};
        int n=10;
        System.out.println(majority(nums,n));
        
    }
}
