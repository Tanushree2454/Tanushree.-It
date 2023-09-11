import java.util.Scanner;

public class ncr
{
   public static void main(String[] args)
   {
      int n, r, ncr;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the Value of n: ");
      n = s.nextInt();
      System.out.print("Enter the Value of r: ");
      r = s.nextInt();
      
      ncr = (fact(n)) / (fact(r)*fact(n-r));
      
      System.out.println("\nnCr = " +ncr);
   }
   public static int fact(int num)
   {
      int fact=1;
      for(int i=1; i<=num; i++)
         fact *= i;
      return fact;
   }
}