package Arrays.Easy;
import java.util.Arrays;

public class MissingNumber {
   
    public static void main(String[] args){

        int arr[]={3,0,1};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                System.out.println(i);
            }
        }
    }
}
