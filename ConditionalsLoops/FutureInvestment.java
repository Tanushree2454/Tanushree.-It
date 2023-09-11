import java.util.Scanner;
public class FutureInvestment
{
    public static void main(String args[])
    {
        //Scanner class object created
        Scanner sc = new Scanner(System.in);
        //taking user input of present value, time and rate of return
        System.out.print("Enter Present Investment Value: ");
        double pv=sc.nextInt();
        System.out.print("Enter the Rate of Return: ");
        double r=sc.nextInt();
        System.out.print("Enter the Time Period in Number of Years: ");
        double t=sc.nextInt();
        //calculating future value by using formula
        double fv=pv*Math.pow((1+r/100),t);
        System.out.print("Future Investment Value is: "+fv);
  }
}