package Arrays.Medium;

public class CountSubArraySumEqualsK {
   //better approach - O(n^2), O(1)
    public static int FindAllSubArraysWithGivenSum(int [] arr, int k){
       int count=0;
       for(int i=0;i<arr.length;i++){
           int sum=0;
           for(int j=i;j<arr.length;j++){
               sum+=arr[j];
               if(sum==k){
                   count++;
               }
           }
       }
       return count;
    }

    //Optimalapproach - O(n)

    //Prefix sum - Space  complexity O(1).
    //
//

    public static void main(String[] args) {
        int[] arr={3,1,2,4};
        int k=6;
        System.out.println(FindAllSubArraysWithGivenSum(arr,k));
    }
}
