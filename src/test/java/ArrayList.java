
import java.util.Arrays;
import java.util.Collections;

public class ArrayList
{

  public static void main(String args[])
  {

    Integer addArray[] = {5, 9, 2, 0, 6};

    /*Identify the index of the given number i.e 6*/
    System.out.println("Index of given number 6 is : " + Arrays.asList(addArray).indexOf(6));

    /*Add all the elements of Array*/

    int sum = 0;
    for(int add = 0; add < addArray.length; add++)
    {
      sum += addArray[add];
    }
    System.out.println("The sum of the array is : " + sum);

    /*
    Sort the Array.
    Ascending Order
    Descending Order
    */
    Arrays.sort(addArray);
    System.out.println("Sorting the ascending Order");
    for(int asort : addArray)
    {
      System.out.println(asort);
    }

    System.out.println("Sorting the descending Order");
    Arrays.sort(addArray, Collections.reverseOrder());
    for(int dsort : addArray)
    {
      System.out.println(dsort);
    }
  }

}

