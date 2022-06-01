package lab2;

import java.util.Arrays;

public class SortString 
{
	public static String[] sortString(String[] arr)
	{
	Arrays.sort(arr);
	for(int i=0;i<arr.length/2;i++)
	{
	arr[i]=arr[i].toUpperCase();
	}
	return arr;
	}

	public static void main(String[] args)
	{
	String Arr[] = {"Daksh","Sandy","Ani","Sasi","Vinu"}; sortString(Arr); System.out.println(Arrays.deepToString(Arr));
	//ANI,DAKSH,Sandy,Sai,Vinu
	}
	

}
