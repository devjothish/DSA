public class LinearSearch {

    public static void main(String[] args)
    {
        int[] arr={5,2,7,3,6,4,2};
        int k=4;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println(i);
                count++;
        }}
        if(count>=1)
            System.out.println("");
        else
            System.out.println(0);

    }
}
