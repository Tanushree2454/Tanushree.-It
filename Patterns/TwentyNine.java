
    import java.util.Scanner;public class TwentyNine {


        public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
            System.out.println("Enter the row size(Odd Number):");
           int out,in;
           int row_size=cs.nextInt();
           int print_control_x=1;
           for(out=1;out<=row_size;out++)
           {
               for(in=1;in<=row_size;in++)
               {
                   if(in<=print_control_x || in>=row_size-print_control_x+1)
                   {
                      System.out.printf("*");
                   }
                   else
                   {
                    System.out.printf(" ");    
                   }
               }
               if(out<=row_size/2)
                   print_control_x++;
               else
                  print_control_x--;
               System.out.println(); 
           }
           cs.close();

        }

}
