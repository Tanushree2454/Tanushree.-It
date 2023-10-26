import java.util.Scanner;

public class TwentyEight {
    public static void main(String[] args) {
         Scanner cs=new Scanner(System.in);
        System.out.println("Enter the row size:");

       int row_size=cs.nextInt();
       for(int out=row_size;out>=-row_size;out--)
       {
           for(int in1=1;in1<=Math.abs(out);in1++)
           {
               System.out.print(" ");
           }
           for(int in2=row_size;in2>=Math.abs(out);in2--)
           System.out.print("* ");
           System.out.println();
       }
    }
}
