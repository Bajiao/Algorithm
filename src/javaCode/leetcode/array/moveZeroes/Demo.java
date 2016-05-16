package javaCode.leetcode.array.moveZeroes;

import javaCode.leetcode.array.PrintArray;

public class Demo
{
	public static void main(String[] args)
	{
		Solution02 test = new Solution02();
		int[] nums;

		// test case 01
		nums = new int[]
		{ 0, 0, 1 };
		test.moveZeroes(nums);
		PrintArray.print(nums);

		// test case 01
		nums = new int[]
		{ 0, 1, 0, 3, 12 };
		test.moveZeroes(nums);
		PrintArray.print(nums);
	}
}
