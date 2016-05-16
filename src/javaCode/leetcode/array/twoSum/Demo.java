package javaCode.leetcode.array.twoSum;

import javaCode.leetcode.array.PrintArray;

public class Demo
{
	public static void main(String[] args)
	{
		int[] nums = {2,8,11,7};
		int[] nums2 = {0,8,11,0};
		
		Solution02 test = new Solution02();
		int[] result = test.twoSum(nums, 9);
		PrintArray.print(result);
		
		result = test.twoSum(nums2, 0);
		PrintArray.print(result);
	}
}
