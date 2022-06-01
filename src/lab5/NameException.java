package lab5;

import java.util.Scanner;

	public class NameException
	{

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.println("enter first name");
	String firstname = sc.nextLine();

	System.out.println("enter last name");
	String lastname = sc.nextLine();


	try
	{

	if(firstname.length()==0 && lastname.length()==0)
	{
	throw new Exception("invalid name");
	}
	else
	{
	System.out.println("valid name");
	}
	}
	catch(Exception a)
	{
	System.out.println(a);
	}

	}
}
