package javaCode.leetcode.array.moveZeroes;

//O(n)
public class Solution02
{
	public void moveZeroes(int[] nums)
	{
		if (nums != null & nums.length > 1)
		{
			int index = -1;

			for (int i = 0; i < nums.length; i++)
			{
				if (index != -1 & nums[i] != 0)
				{
					nums[i] = nums[i] + nums[index];
					nums[index] = nums[i] - nums[index];
					nums[i] = nums[i] - nums[index];
					index++;
				} else if (nums[i] == 0 & index == -1)
				{
					index = i;
				}
			}
		}
	}
}
