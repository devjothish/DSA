package Arrays.Medium;

public class MaximumSubArray {
   
    public static long MaxsubArray(int arr[],int n,int ansStart,int ansEnd)
    { 
        long max=Long.MIN_VALUE;
        long sum=0;
        //int start=0;
        for(int i=0;i<n;i++){
            //if(sum==0) start=i;
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
                //ansStart=start;
                //ansEnd=i;

            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }

    public static void main(String[] args){

        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        int ansStart=0;
        int ansEnd=0;
        System.out.println(MaxsubArray(arr, n,ansStart,ansEnd));
    }
}
