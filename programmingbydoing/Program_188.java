import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Program_188
{
  public static void main(String [] args)
  {
    Random r = new Random();
    
    ArrayList<String> strings = new ArrayList<String>();
    
    strings.add("ask");
    strings.add("not");
    strings.add("what");
    strings.add("your");
    strings.add("country");
    strings.add("can");
    strings.add("do");
    strings.add("for");
    strings.add("you");
    strings.add("but");
    
    System.out.println("ArrayList before: " + strings);
    
    Collections.sort(strings);
    
    System.out.println("ArrayList after : " + strings);
    
  }
}