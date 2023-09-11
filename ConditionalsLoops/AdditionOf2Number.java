 import java.util.Scanner;
 public class AdditionOf2Number{
//class AddNumWithOutPlus1{
public static void main(String args[]){
    Scanner scan=new Scanner(System.in); //create a scanner object for input
System.out.print("Enter the first number: ");
int num1=scan.nextInt();//get input from the user for num1
System.out.print("Enter the second number: ");
int num2=scan.nextInt();//get input from the user for num2
for(int i=0; i<num2; i++)
   num1++;
System.out.print("Sum of two numbers is: "+num1);
}
} 
