package lab1;

import java.util.Scanner;

public class CheckNumber 
{
	public static void main(String[] args)
	{
	   Scanner scan = new Scanner(System.in);

	   System.out.print("Enter a number to check ");

	   int num= scan.nextInt();

	   int temp = num;

	   int dig = temp;

	   temp=temp/10;

	   boolean flag = true;

	   while (temp>0)
	   {
	       if(dig<=temp%10)
	       { 
	            flag = false;
               	break;
	       }
	       dig = temp%10;
	       temp=temp/10;
	   }
	   if(flag)
	   {
	   System.out.println(num+" digits are in ascending order.");
	   }
	   else
	   {
		   System.out.println(num+" digits are not in ascending order");
	   }
	 }

}
