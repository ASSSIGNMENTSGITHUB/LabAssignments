package lab1;

public class CheckNumber1 
{
	public static boolean isPowerOfTwo(int x)
    {
        return x!= 0 && ((x & (x - 1)) == 0);
    }
 
    public static void main(String[] args)
    {
        System.out.println(isPowerOfTwo(31) ? "Yes" : "No");//no
        System.out.println(isPowerOfTwo(64) ? "Yes" : "No");//yes
        System.out.println(isPowerOfTwo(8) ? "Yes" : "No");//yes
        System.out.println(isPowerOfTwo(32) ? "Yes" : "No");//yes
        System.out.println(isPowerOfTwo(65) ? "Yes" : "No");//no
    }

}
