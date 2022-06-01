package lab5;

import java.util.Scanner;
class Exer3 extends Exception{
       public Exer3(String str)
       {
               System.out.println(str);
       }
       }
public class EmployeeException
{
       public static void main(String[] args)
       {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter ur salary:");
               int sal=sc.nextInt();
               try
               {
                       if(sal<3000)

                               throw new Exer3("less salary");

                       else

                               System.out.println("good salary");
                       }
                       catch(Exer3 e)
                       {
                               System.out.println(e);

                       }
       }
}
