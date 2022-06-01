package lab1;

public class CalculateDifference
{
	public static int difference(int n)
	 {
	      int SumofSquareN = (n * (n + 1) * (2 * n + 1)) / 6;    
	      int SumNsq = (n * (n + 1)) / 2;  
	      int SumNSquare = SumNsq * SumNsq;
	      return Math.abs(SumofSquareN - SumNSquare);//difference between sum of sum of square N natural number and there sum
	   }
	 
	   public static void main(String args[])
	   {
	      System.out.println("Difference= "+ difference(4));//70
	   }

}
