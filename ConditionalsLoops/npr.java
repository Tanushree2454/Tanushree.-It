import java.util.Scanner;

public class npr
{
   public static void main(String[] args)
   {
      int n, r, npr;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the Value of n: ");
      n = s.nextInt();
      System.out.print("Enter the Value of r: ");
      r = s.nextInt();
      
      npr = (fact(n)) / (fact(n-r));
      
      System.out.println("\nnPr = " +npr);
   }
   public static int fact(int num)
   {
      int fact=1;
      for(int i=1; i<=num; i++)
         fact *= i;
      return fact;
   }
}