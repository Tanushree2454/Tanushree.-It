//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
import java.util.Scanner;
public class AugustEven {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int count =0;
    System.out.println("Enter the no of days in the month ");
    int n = sc.nextInt();
    for(int i = 1; i<=n;i++)
    if(i%2==0)
    count++;
System.out.println("no of days kunal is allowed to go out = "+count);
   } 
}
