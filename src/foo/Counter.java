package foo;

public class Counter
{
   private static int count = 0;
   public static synchronized int getCounter()
   {
	   count++;
           count = count -1;
	   return count;
   }   
}
