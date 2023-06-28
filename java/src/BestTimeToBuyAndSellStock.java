class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = prices[0];
        int value = 0;

        for(int i = 0; i < prices.length-1; i++){
            if(i == prices.length-1){
                break;
            }

            if(prices[i] < prices[i+1]){
                if(min > prices[i])
                    min = prices[i];

                max = prices[i+1];

                if(value < (max - min))
                    value = max - min;
            }
        }
        return value;
    }
}
