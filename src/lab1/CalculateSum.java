package lab1;

public class CalculateSum 
{
    static int sum(int n, int X, int Y)
    {
        int S1, S2, S3; 
       S1 = ((n / X)) * (2 * X + (n / X - 1) * X) / 2;
       S2 = ((n / Y)) * (2 * Y + (n / Y - 1) * Y) / 2;
        S3 = ((n / (X * Y))) * (2 * (X * Y)+ (n / (X * Y) - 1) * (X  * Y))/ 2;     
        return S1 + S2 - S3;
    }
 
    public static void main(String []args)
    {
        System.out.println(sum(10, 3, 5));//33
     
    }

}
