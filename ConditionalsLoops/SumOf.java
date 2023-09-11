import java.util.Scanner;
//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class SumOf
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int nSum = 0, eSum = 0, oSum = 0;
        System.out.println("Enter Numbers:");
        while (true) {
            int n = in.nextInt();
            
            if (n == 0) {
                break;
            }
            
            if (n < 0) {
                nSum += n; 
            }
             if (n>0 && n % 2 == 0) {
                eSum += n;
            }
            if(n>0 && n%2!=0) {
                oSum += n;
            }
        }
        
        System.out.println("Negative No. Sum = " + nSum);
        System.out.println("Positive Even No. Sum = " + eSum);
        System.out.println("Positive Odd No. Sum = " + oSum);
    }
}