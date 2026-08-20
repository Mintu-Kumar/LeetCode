package LeetCodeBlind75;

public class BuySellStocke
{


    public static int buySell(int[] arr){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit=0;

        for(int price: arr)
        {
            if(price<minPrice)
                minPrice =price;
            else
                maxProfit = Math.max(maxProfit,price-minPrice);
        }

        return maxProfit;

    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
       int result =  buySell(arr);
        System.out.println(result);
    }
}
