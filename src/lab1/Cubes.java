package lab1;

public class Cubes
{
	public static int test(int n)
 	{
 		int Sumofcube;
 		Sumofcube= (n*(n+1)/2);
 		return Sumofcube*Sumofcube;
 	}
	
	public static void main(String[] args)
	{
		System.out.println(test(5));//225
	}
 }



