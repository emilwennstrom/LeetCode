public class BestTimetoBuyandSellStock {

	public static int maxProfit(int[] prices) {
		int currentMin = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int i = 0; i < prices.length - 1; i++) {
			int currentMax = Integer.MIN_VALUE;
			if (prices[i] < currentMin) currentMin = prices[i];
			if (prices[i + 1] > currentMax) currentMax = prices[i + 1];
			int profit = currentMax - currentMin;
			if (profit > maxProfit) maxProfit = profit;
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int[] prices = new int[] {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
}
