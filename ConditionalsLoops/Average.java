import java.util.Scanner;
//calculate average marks 
public class Average {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter any Integer value : ");
    int value , sum = 0, count = 0;
    while((value = scan.nextInt()) != 0)
    {
      count++;
      sum = sum + value;
    }
    System.out.println("Average : " + (sum / count));
   } 
}
