package javaCode.leetcode.array.missingNumber;

public class Solution01
{
	public int missingNumber(int[] nums)
	{
		int sum = 0, n = nums.length;
        for (int a : nums) {
            sum += a;
        }
        return n * (n + 1)/2 - sum;
	}
}
