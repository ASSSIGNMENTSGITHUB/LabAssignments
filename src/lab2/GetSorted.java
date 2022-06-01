package lab2;

public class GetSorted
{
	public static void main(String[] args)
	{
	  int [] x= {19,50,40,30,60};
	  System.out.println("before reversing:");
	  for(int y :x)
	  {
	System.out.println("after reversing"); int[] rev = new int [x.length]; for(int i=x.length-1;i>=0;i--)
	  {
	rev[i]=x[i]; System.out.println(rev[i]);
	  }
	  }
	 }

}
//after reversing 60,30,40,50,19
