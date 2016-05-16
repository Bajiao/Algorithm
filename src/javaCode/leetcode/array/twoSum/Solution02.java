package javaCode.leetcode.array.twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution02
{
	public int[] twoSum(int[] nums, int target)
	{
		int[] result = null;
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++)
		{
			map.put(nums[i], i);
		}
		
		for(int i=0; i<nums.length; i++)
		{
			int complement = target - nums[i];
			if(map.containsKey(complement) && map.get(complement) != i)
			{
				return new int[]{i, map.get(complement)};
			}
		}
		
		return result;
	}
}
