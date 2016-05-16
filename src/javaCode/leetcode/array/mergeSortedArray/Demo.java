package javaCode.leetcode.array.mergeSortedArray;

import javaCode.leetcode.array.PrintArray;

public class Demo
{
	public static void main(String[] args)
	{
		int[] nums1 = new int[10];
		nums1[0] = 0;
		nums1[1] = 0;
		nums1[2] = 1;
		nums1[3] = 3;
		nums1[4] = 7;
		
		int[] nums2 = {-2, -1, 4, 6, 9};
		
		Solution01 test = new Solution01();
		
		Solution02 test2 = new Solution02();
		
		Solution03 test3 = new Solution03();
		
		test3.merge(nums1, 5, nums2, 5);
		
		PrintArray.print(nums1);
	}
}
