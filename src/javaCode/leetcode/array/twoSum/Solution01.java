package javaCode.leetcode.array.twoSum;

//O(n^2)
public class Solution01
{
	public int[] twoSum(int[] nums, int target)
	{
		int[] result = null;
		
		for(int i = 0; i < nums.length-1; i++)
		{
			for(int j= i+1; j<nums.length; j++)
			{
				if((nums[i] + nums[j])==target)
				{
					return new int[]{i, j};
				}
			}
		}
		return result;
	}
}
