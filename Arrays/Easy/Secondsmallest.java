package Arrays.Easy;

public class Secondsmallest {
    public static void main(String[] args){
        //initialize small and second small variable with int_max
        int[] arr={8,3,5,1,7,4,1,5};
        int small=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;
        int n=arr.length;
        if (n<2)
            System.out.println("No value");
        /*if the current element is smaller than small,
        update second_small with small value and small with current value
        Else, if the current value is smaller than second_small,
        update the second_small variable with current value (i)
        */
        for(int i=0;i<n;i++){
            if(arr[i]<small)
            {
                second_small=small;
                small=arr[i];
            } else if (arr[i]<second_small && arr[i] != small) {
                second_small=arr[i];
            }
        }
        System.out.println(second_small);
    }
}
