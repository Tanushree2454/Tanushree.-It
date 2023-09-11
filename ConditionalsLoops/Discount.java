
import java.util.Scanner;
public class Discount
{
    public static void main (String []args)
    {
        int percentage = 0;
        double releasevalue = 0;
        double discountedcost = 0;

    Scanner sc = new Scanner(System.in);

    // System.out.print("Shtyp cmimin e produktit te pare: ");
    // double pr1 = sc.nextDouble();

    // System.out.print("Shtyp cmimin e produktit te dyte: ");
    // double pr2 = sc.nextDouble();

    // System.out.print("Shtyp cmimin e produktit te trete: ");
    // double pr3 = sc.nextDouble();

    // System.out.print("Shtyp cmimin e produktit te katert: ");
    // double pr4 = sc.nextDouble();

    System.out.print("Shtyp cmimin e produktit te peste: ");
    double pr5 = sc.nextDouble();

    double COST = ( pr5);

    if(COST >= 20 && COST < 60)
    {
        percentage = 10;
        releasevalue = (COST*(10.0/100.0));
    }
    else if(COST >= 60 && COST < 100)
    {
        percentage = 20;
        releasevalue = (COST*(20.0/100.0));
    }
    else{
        percentage = 30;
        releasevalue = (COST*(30.0/100.0));
    }
System.out.println( discountedcost = COST - releasevalue);

    }
}