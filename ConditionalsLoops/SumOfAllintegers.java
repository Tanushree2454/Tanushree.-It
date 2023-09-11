import java.util.Scanner;

public class SumOfAllintegers {
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      int n, sum =0;
      while((n=sc.nextInt())!=0)  {
     sum+=n;
      }
      System.out.println(sum);
    }
}
