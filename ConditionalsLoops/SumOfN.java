
import java.util.Scanner;
public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum =0;
      while( (n =sc.nextInt())!=0){
    sum+=n;
      }
      System.out.println(sum);
    }
}
