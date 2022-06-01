package lab2;

import java.util.Arrays;

public class SecondSmallestinArray
{
	public static int getSecondSmallest(int[] a)
	{
	Arrays.sort(a);
	return a[1];
	}

	public static void main(String[] args)
	{
	int a[]= {1,2,5,6,3,2};
	System.out.println("Second Smallest: "+getSecondSmallest(a));//2
	}

}
