package foo;

public class Counter
{
   private static int count = 6;
   public static synchronized int getCounter()
   {
	   count++;
	   return count;
   }   
}
