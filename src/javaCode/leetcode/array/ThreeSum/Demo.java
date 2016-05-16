package javaCode.leetcode.array.ThreeSum;

import java.util.List;

public class Demo
{
	public static void main(String[] args)
	{
		int[] nums = {0,0,0,0};
		
		List<List<Integer>> result = Solution01.threeSum(nums);
		
		print(result);
	}
	
	public static void print(List<List<Integer>> lists)
	{
		for(List<Integer> list: lists)
		{
			for(int num: list)
			{
				System.out.print(num + ", ");
			}
			System.out.println("");
		}
	}
}
