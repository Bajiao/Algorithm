package javaCode.leetcode.array.FindPeakElement;

// return index of peak
public class Solution01
{
	public static int findPeakElement(int[] nums)
	{
		int k = nums.length;
		
		if(k==0) return -1;
		if(k==1) return 0;
		
		int left = 0;
		int right = k-1;
		while(left < right)
		{
			if(nums[left]>nums[left+1]) return left;
			if(nums[right]>nums[right-1]) return right;
			
			int mid = (left + right)/2;
			if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
			{
				return mid;
			}
			else if(nums[mid-1]>nums[mid])
			{
				right = mid-1;
			}
			else
			{
				left=mid+1;
			}
		}
		
		return -1;
	}
	
}
