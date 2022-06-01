package lab3;

import java.util.Scanner;

public class StringTokenizer
{
	public StringTokenizer(String s, String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[])
	{
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers:");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens())
        {
                String temp = st.nextToken();
                n = Integer.parseInt(temp);
                System.out.println(n);
                sum = sum + n;
        }
        System.out.println("sum of the integers is: " + sum);
        sc.close();
}

	private String nextToken() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean hasMoreTokens() {
		// TODO Auto-generated method stub
		return false;
	}
}
