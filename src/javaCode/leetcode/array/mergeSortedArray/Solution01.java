package javaCode.leetcode.array.mergeSortedArray;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import javaCode.leetcode.array.PrintArray;
import javaCode.leetcode.array.PrintMap;

public class Solution01
{
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        Solution01.convert(nums1, m, map);
        Solution01.convert(nums2, n, map);
        
        int index = 0;
        SortedSet<Integer> keys = new TreeSet<>(map.keySet());
        for (Integer key : keys) 
        { 
        	for(int i=0; i<map.get(key); i++)
            {
                nums1[index] = key;
                index++;
            }
        }
        PrintMap.print(map);
        PrintArray.print(nums1);
    }
	
	public static void convert(int[] nums, int size, Map<Integer, Integer> map)
	{
		for(int i=0; i<size; i++)
        {
            int counter = 1;
            if(map.containsKey(nums[i]))
            {
                counter = map.get(nums[i]);
                counter++;
            }
            map.put(nums[i], counter);
        }
	}
}
