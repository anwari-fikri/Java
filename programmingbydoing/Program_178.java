import java.util.ArrayList;

public class Program_178
{
  public static void main(String [] args)
  {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    for(int i = 0; i < 10; i++)
    {
      numbers.add(-133);
    }
    
    for(int i = 0; i < numbers.size(); i++)
    {
      System.out.println("Slot " + i + " contains a " + numbers.get(i));
    }
  }
}