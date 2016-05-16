package javaCode.leetcode.array.maxProfit;

public class Solution01
{
	public static int maxProfit(int[] prices)
	{
		if (prices == null || prices.length < 2)
		{
			return 0;
		}
		
		int maxprofit = 0;
		int min = 0;
		int max = 0;
		for (int i = 0; i < prices.length; i++)
		{
			if (prices[i] < prices[min])
			{
				min = i;
			}
			
			int profit = prices[i] - prices[min];
			if (maxprofit < profit)
			{
				maxprofit = profit;
				max = i;
			}
		}
		return maxprofit;
	}
	
	public static void main(String[] args)
	{
		int[] prices ={5,3,2,4,7,1};
		System.out.println(maxProfit(prices));
	}
}
