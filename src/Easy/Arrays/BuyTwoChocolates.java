package Easy.Arrays;

import java.util.Arrays;

public class BuyTwoChocolates {

    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int temp = money;
        int count = 0;
        int length = prices.length;
        for (int i=0; i<length; i++){
            if (prices[i] <= temp){
                temp -= prices[i];
                count += 1;
                if (count == 2){
                    return temp;
                }
            }

        }
        return money;
    }
    public static void main(String[] args) {
        int [] input = {98,54,6,34,66,63,52,39};
        int money = 62;
        System.out.println(buyChoco(input, money));
    }
}
