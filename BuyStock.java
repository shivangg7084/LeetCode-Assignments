public class BuyStock {
    public int maxProfit(int[] A) {
        int n = A.length;
        int mini=A[0];
        int profit=0;
        for(int i =0;i<n;i++){
            int cost = A[i]-mini;
            profit = Math.max(profit, cost);
            mini = Math.min(A[i], mini);
        }
        return profit;
    }
}

