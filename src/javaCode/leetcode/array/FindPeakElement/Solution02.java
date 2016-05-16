package javaCode.leetcode.array.FindPeakElement;

public class Solution02
{
	public static int findPeakElement(int[] nums, int low, int high, int n)
	{
		// Find index of middle element
        int mid = low + (high - low)/2;  /* (low + high)/2 */
 
        // Compare middle element with its neighbours (if neighbours
        // exist)
        if ((mid == 0 || nums[mid-1] <= nums[mid]) && (mid == n-1 ||
             nums[mid+1] <= nums[mid]))
            return mid;
 
        // If middle element is not peak and its left neighbor is
        // greater than it,then left half must have a peak element
        else if (mid > 0 && nums[mid-1] > nums[mid])
            return findPeakElement(nums, low, (mid -1), n);
 
        // If middle element is not peak and its right neighbor
        // is greater than it, then right half must have a peak
        // element
        else return findPeakElement(nums, (mid + 1), high, n);
	}
	
	// A wrapper over recursive function findPeakUtil()
    static int findPeakElement(int[] nums)
    {
        int n = nums.length;
    	
    	return findPeakElement(nums, 0, n-1, n);
    }
}
