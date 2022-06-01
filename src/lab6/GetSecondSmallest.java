package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetSecondSmallest 
{
	  public int getSecondSmallest(int[] arr)
      {
              //create arraylist as a list iterator
              List<Integer> intList=new ArrayList<Integer>();
              //using for loop
              for(int i:arr)
              {
                      intList.add(i);

              }
              //sort the list elements
              Collections.sort(intList);
              //return integer value
              return intList.get(1);
      }
      public static void main(String[] args)
      {
              //create an obj
              GetSecondSmallest e=new GetSecondSmallest ();
              //given array elements
              int arr[]= {23,43,54,24,56,75,86,45,64,34};
              //to find second elements assign array elements one by one
              int i=e.getSecondSmallest(arr);
              //and print second smallest elements
              System.out.println(i);

      }

}
