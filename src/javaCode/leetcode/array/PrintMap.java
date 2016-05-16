package javaCode.leetcode.array;

import java.util.Map;

public class PrintMap
{
	public static void print(Map<Integer, Integer> map)
	{
		for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
			System.out.println("Key: " + entry.getKey() + ", " + "Value: " + entry.getValue());
        }
	}
}
