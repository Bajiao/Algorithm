package javaCode.leetcode.array.moveZeroes;

public class Solution01
{
	public void moveZeroes(int[] nums)
	{
		if (nums != null & nums.length > 1)
		{
			for (int i = 0; i < nums.length; i++)
			{
				if (nums[i] == 0)
				{
					for (int j = i + 1; j < nums.length; j++)
					{
						if (nums[j] != 0)
						{
							nums[i] = nums[i] + nums[j];
							nums[j] = nums[i] - nums[j];
							nums[i] = nums[i] - nums[j];
							break;
						}
					}
				}
			}
		}
	}
}
