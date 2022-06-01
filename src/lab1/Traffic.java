package lab1;

public class Traffic 
{
	public static void test(String str)
	{
		//String str="yellow";
		switch(str)
		{
		case "red":
			System.out.println("red"+":Stop");
			break;

		case "green":
			System.out.println("green"+":Go");
			break;

		case "yellow":
			System.out.println("yellow"+":Ready");
			break;

		default: 
			System.out.println("No matching");
		}
	}
	public static void main(String[] args) 
	{
		test("red");//stop
		test("green");//go
		test("yellow");//ready
	}

}
