import java.util.Scanner;

public class SumOfAll{
    //Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
     public static void main(String args[]){
        Scanner in =new Scanner(System.in) ;
        
        int sum=0;
        char ch;
        do {
            System.out.print("Please enter the integer");
            int num = in.nextInt();
            sum=sum+num;
            System.out.print("enter x to stop or any other to continue");
            ch = in.next().charAt(0);
        }while ( ch!='x');
        System.out.println(sum);
    }
}
    