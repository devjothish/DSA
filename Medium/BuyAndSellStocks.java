package Medium;
//121. Best Time to Buy and Sell Stock
public class BuyAndSellStocks {
   
    public static int FindProfit(int arr[], int n){
        int maxprofit=0;
        int min_price=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            //if(arr[i]<min_price)
            //minprice=arr[i];
            min_price=Math.min(min_price,arr[i]);
            maxprofit=Math.max(arr[i]-min_price,maxprofit);
        }
        return maxprofit;
    }
    public static void main(String[] args){
        int[] arr={7,1,5,3,6,4};
        int n=arr.length;
       System.out.println(FindProfit(arr,n));


    }
}
