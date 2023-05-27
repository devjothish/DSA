package Arrays.Medium;

import java.util.Arrays;
// import java.util.List;
public class RearrangeArraywithSign {
   
    public static int[] Solution(int arr[], int n){
        int[] result=new int[n];
        int positive=0;
        int negative=1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                result[positive]=arr[i];
                //System.out.print(result[positive] + " ");
                positive+=2;
            }
            else{
                result[negative]=arr[i];
                //System.out.print(result[negative] + " ");
                negative+=2;
            }
        }
        return result; 
    }
    public static void main(String[] args){
        int arr[]={3,1,-2,-5,2,-4};
        int n=arr.length;
        int ans[]= Solution(arr,n);
        //List<Integer> numberList = Arrays.asList(ans);

       // System.out.print(numberList);
        System.out.print(Arrays.toString(ans));
        
    }
}
