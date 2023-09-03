
import java.util.Scanner;

public class Bonus {
    public static void main(String args[]){
   Scanner sc = new Scanner(System.in) ;
   System.out.println("enter your salary");
 int salary =sc.nextInt();
 if(salary > 10000)
 System.out.println("salary"+(salary+2000));
 else
 System.out.println("salary"+(salary+1000));
}
}
