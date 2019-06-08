import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program_183
{
  public static void main(String [] args)
  {
    Random r = new Random();
    
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    for(int i = 0; i < 10; i++)
    {
      numbers.add(r.nextInt(99)+1);
    }
    
    System.out.println("ArrayList: " + numbers);
    
    Scanner kb = new Scanner(System.in);
    System.out.print("Value to find: ");
    int find = kb.nextInt();
    
    boolean found = false;
    for(int i = 0; i < numbers.size(); i++)
    {
      if(find == numbers.get(i))
      {
        System.out.println(find + " is in slot " + i);
        found = true;
      }
    }
    
    if(found == false)
    {
      System.out.println(find + " is not in the ArrayList");
    }
  }
}