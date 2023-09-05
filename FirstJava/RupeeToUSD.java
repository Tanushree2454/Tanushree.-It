import java.util.Scanner;
public class RupeeToUSD {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in)  ;
      Double rupees = sc.nextDouble();
      Double USD = rupees*82.71;
      System.out.println(USD);

    }
}
