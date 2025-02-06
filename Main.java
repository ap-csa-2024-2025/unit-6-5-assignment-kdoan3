import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    
  }

  public static void reverse(String[] arr)
  {
    String reversed = " ";

    for (int elem : arr)
    {
      for (int i = 0; i < arr.length; i++)
      {
        String letter = arr[i].substring(i, i+1)
        reversed = letter + reversed;
      }
    }
    return reversed;
  }

  public int product(int[] arr)
  {
    int product = 1;
    for (int elem :  arr)
    {
      product *= elem;
    }
    return product;
  }

  public double average(double[] arr)
  {
    double sum = 0;
    for (double elem : arr)
    {
      sum += elem;
    }
    return sum/arr.length;
  }

}
