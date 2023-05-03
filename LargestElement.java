import java.sql.SQLOutput;

public class LargestElement {
    public static void main(String[] args){

        int[] arr= {4,7,2,9,4};

        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
    }
}
