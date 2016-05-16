package javaCode.leetcode.array;

public class PrintArray
{
	public static void print(int[] nums)
	{
		if (nums == null)
		{
			System.out.println("null");
		} else
		{
			for (int i = 0; i < nums.length; i++)
			{
				System.out.print(nums[i] + ", ");
			}
			System.out.println("");
		}
	}
}
