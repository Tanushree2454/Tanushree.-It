import java.util.Scanner;

public class ElectricityBill {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Units;
		double Amount, Sur_Charge, Total_Amount;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Units that you Consumed  : ");
		Units = sc.nextInt();
  
	  	if (Units < 50)
	  	{
	        Amount = Units * 2.60;
	  		Sur_Charge = 25;  	
	  	} 
	  	else if (Units <= 100)
	  	{
	  		// For the First Fifty Units Charge = 130 (50 * 2.60)
	  		// Next, we are removing those 50 units from total units
	  		Amount = 130 + ((Units - 50 ) * 3.25);
	  		Sur_Charge = 35; 	
	  	}
	  	else if (Units <= 200)
	  	{
	  		// First Fifty Units charge = 130, and 50 - 100 is 162.50 (50 * 3.25)
	  		// Next, we are removing those 100 units from total units
	  		Amount = 130 + 162.50 + ((Units - 100 ) * 5.26);
	  		Sur_Charge = 45; 	
	  	}
	  	else
	  	{
	  		/* First Fifty Units = 130, 50 - 100 is 162.50, 
	  		 and 100 - 200 is 526 (100 * 5.65)
	  		Next, we are removing those 200 units from total units */
		   	Amount = 130 + 162.50 + 526 + ((Units - 200 ) * 7.75); 
		   	Sur_Charge = 55; 
		}
		
		Total_Amount = Amount + Sur_Charge;
		System.out.println("\n Electricity Bill  =  " + Total_Amount);
	}

}
// int calculateBill(int units)
// {
 
//     // Condition to find the charges
//     // bar in which the units consumed
//     // is fall
//     if (units <= 100)
//     {
//         return units * 10;
//     }
//     else if (units <= 200)
//     {
//         return (100 * 10) +
//                (units - 100) * 15;
//     }
//     else if (units <= 300)
//     {
//         return (100 * 10) +
//                (100 * 15) +
//                (units - 200) * 20;
//     }
//     else if (units > 300)
//     {
//         return (100 * 10) +
//                (100 * 15) +
//                (100 * 20) +
//                (units - 300) * 25;
//     }
//     return 0;
// }
 